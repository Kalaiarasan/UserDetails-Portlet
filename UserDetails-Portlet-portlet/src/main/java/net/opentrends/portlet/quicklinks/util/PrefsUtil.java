package net.opentrends.portlet.quicklinks.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

public class PrefsUtil {
	public static List<Map<String, Object>> getQuicklinkMapList(PortletPreferences preferences)
			throws ReadOnlyException {
		String quicklinkIndexesString = preferences.getValue("quicklinkIndexes", StringPool.BLANK);
		List<Map<String, Object>> quicklinks = new ArrayList<Map<String, Object>>();
		_log.info("getIndexesString" + quicklinkIndexesString);
		if (quicklinkIndexesString.equalsIgnoreCase(StringPool.BLANK)) {
			return quicklinks;
		}		 
		int[] quicklinkIndexes = StringUtil.split(quicklinkIndexesString, 0);
		for (int quicklinkIndex : quicklinkIndexes) {
			String buttonText = preferences.getValue("buttonText" + quicklinkIndex, StringPool.BLANK);
			String href = preferences.getValue("href" + quicklinkIndex, StringPool.BLANK);
			HashMap<String, Object> quicklink = new HashMap<String, Object>();
			quicklink.put("buttonText", buttonText);
			quicklink.put("href", href);
			quicklinks.add(quicklink);
			// _log.info("b" + quicklinkIndex+":"+buttonText);
			// _log.info("h" + quicklinkIndex+":"+href);
		}
		return quicklinks;
	}

	public static void updateQuicklinks(ActionRequest actionRequest)
			throws SystemException, PortalException, ReadOnlyException, ValidatorException, IOException {
		String portletResource = ParamUtil.getString(actionRequest, "portletResource");
		PortletPreferences preferences = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);
		String quicklinkIndexesString = actionRequest.getParameter("quicklinkIndexes");
		_log.info("quicklinkIndexesString" + quicklinkIndexesString);
		if (quicklinkIndexesString == null) {
			return;
		}
		int[] quicklinkIndexes = StringUtil.split(quicklinkIndexesString, 0);
		for (int quicklinkIndex : quicklinkIndexes) {
			String buttonText = ParamUtil.getString(actionRequest, "buttonText" + quicklinkIndex);
			String href = ParamUtil.getString(actionRequest, "href" + quicklinkIndex);
			preferences.setValue("buttonText" + quicklinkIndex, buttonText);
			preferences.setValue("href" + quicklinkIndex, href);
			// _log.info("buttonText" + quicklinkIndex+":"+buttonText);
			// _log.info("href" + quicklinkIndex+":"+href);
		}
		preferences.setValue("quicklinkIndexes", quicklinkIndexesString);
		preferences.store();
	}

	private static Log _log = LogFactoryUtil.getLog(PrefsUtil.class.getName());
}
