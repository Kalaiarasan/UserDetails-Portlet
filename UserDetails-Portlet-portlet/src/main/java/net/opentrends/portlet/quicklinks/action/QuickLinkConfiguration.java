package net.opentrends.portlet.quicklinks.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

import net.opentrends.portlet.quicklinks.util.PrefsUtil;

public class QuickLinkConfiguration extends DefaultConfigurationAction {

	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {

		updateGeneral(actionRequest);
		String portletName = (String) actionRequest.getAttribute(WebKeys.PORTLET_ID);
		SessionMessages.add(actionRequest, portletName + ".doConfigure");
		SessionMessages.add(actionRequest, "potlet-config-saved");

	}

	@Override
	public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {
		String portletResource = ParamUtil.getString(renderRequest, "portletResource");
		PortletPreferences preferences = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest, portletResource);
		List<Map<String, Object>> quicklinks = new ArrayList<Map<String, Object>>();
		  quicklinks = PrefsUtil.getQuicklinkMapList(preferences);
		renderRequest.setAttribute("quicklinks", quicklinks);
		
		return "/html/quicklink/configuration.jsp";
	}

	protected void updateGeneral(ActionRequest actionRequest) throws Exception {
		PrefsUtil.updateQuicklinks(actionRequest);
	}

	private static Log _log = LogFactoryUtil.getLog(QuickLinkConfiguration.class.getName());
}
