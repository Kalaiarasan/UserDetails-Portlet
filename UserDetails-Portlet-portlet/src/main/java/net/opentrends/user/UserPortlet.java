package net.opentrends.user;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.NoSuchWorkflowDefinitionLinkException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.WorkflowDefinitionLink;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import net.opentrends.user.model.Person;
import net.opentrends.user.service.PersonLocalServiceUtil;

/**
 * Portlet implementation class UserPortlet
 */
public class UserPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		 
		List<Organization> organizationList = null;
		try {
			organizationList = OrganizationLocalServiceUtil.getOrganizations(-1, -1);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		renderRequest.setAttribute("organizationList", organizationList);
		super.doView(renderRequest, renderResponse);
	}

	public void addPerson(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(UserPortlet.class.getName(), request);
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		String name = ParamUtil.getString(request, "name");
		String sex = ParamUtil.getString(request, "sex");
		int age = ParamUtil.getInteger(request, "age");
		String city = ParamUtil.getString(request, "city");
		Person person = PersonLocalServiceUtil.addPerson(name, sex, age, city, serviceContext);

		try {

			WorkflowDefinitionLink workflowDefinitionLink = null;
			try {
				workflowDefinitionLink = WorkflowDefinitionLinkLocalServiceUtil
						.getDefaultWorkflowDefinitionLink(themeDisplay.getCompanyId(), Person.class.getName(), WorkflowConstants.ACTION_SAVE_DRAFT, 0);
				person = PersonLocalServiceUtil.updateStatus(themeDisplay.getUserId(), person.getPersonId(),
						person.getStatus(), serviceContext);
				SessionMessages.add(request, "added-Person");
			} catch (Exception exception) {
				if (exception instanceof NoSuchWorkflowDefinitionLinkException) {
					SessionMessages.add(request.getPortletSession(), "workflow-not-enabled");
				}
				_log.error(exception.getMessage());
			}
			// checking workflow defintion is enabled to person asset or not
			if (person != null && workflowDefinitionLink != null) {
				// add Person asset in asset entry table
				AssetEntryLocalServiceUtil.updateEntry(themeDisplay.getUserId(), person.getGroupId(),
						Person.class.getName(), person.getPersonId(), serviceContext.getAssetCategoryIds(),
						serviceContext.getAssetTagNames());
				// start workflow instance to Person
				WorkflowHandlerRegistryUtil.startWorkflowInstance(themeDisplay.getCompanyId(),
						themeDisplay.getScopeGroupId(), person.getUserId(), Person.class.getName(),
						person.getPrimaryKey(), person, serviceContext);
			}

		} catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
		}

	}

	@ProcessAction(name = "deletePerson")
	public void deletePerson(ActionRequest actionRequest, ActionResponse actionResponse)
			throws SystemException, PortalException {
		long personId = ParamUtil.getLong(actionRequest, "personId");
		PersonLocalServiceUtil.deletePerson(personId);
		SessionMessages.add(actionRequest, "deleted-Person");
		_log.info("Person data deleted successfully");
	}

	private final static Log _log = LogFactoryUtil.getLog(UserPortlet.class);
}
