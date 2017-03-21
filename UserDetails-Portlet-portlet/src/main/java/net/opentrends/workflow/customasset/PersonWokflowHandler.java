package net.opentrends.workflow.customasset;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.security.permission.ResourceActionsUtil;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.user.model.Person;
import net.opentrends.user.service.PersonLocalServiceUtil;

public class PersonWokflowHandler extends BaseWorkflowHandler {

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

/*	@Override
	public String getType(Locale locale) {
		// TODO Auto-generated method stub
		return LanguageUtil.get(locale,  "model.resource" + CLASS_NAME);
	}*/
	@Override
	public String getType(Locale locale) {
		return ResourceActionsUtil.getModelResource(locale, getClassName());
	}
	@Override	 
	   public Person updateStatus(int status,
	            Map<String, Serializable> workflowContext) throws PortalException,
	            SystemException {

	            long userId = GetterUtil.getLong(
	                (String)workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
	            long classPK = GetterUtil.getLong(
	                (String)workflowContext.get(
	                    WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

	            ServiceContext serviceContext = (ServiceContext)workflowContext.get(
	                "serviceContext");

	            return PersonLocalServiceUtil.updateStatus(
	                userId, classPK, status, serviceContext);

	    }
	
	
	public static final String CLASS_NAME = Person.class.getName();

}
