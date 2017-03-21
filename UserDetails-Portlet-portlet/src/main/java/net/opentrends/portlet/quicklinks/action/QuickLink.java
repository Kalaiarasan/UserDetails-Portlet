package net.opentrends.portlet.quicklinks.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import net.opentrends.portlet.quicklinks.util.PrefsUtil;

/**
 * Portlet implementation class QuickLink
 */
public class QuickLink extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		PortletPreferences preferences = renderRequest.getPreferences();
		List<Map<String, Object>> quicklinks = PrefsUtil.getQuicklinkMapList(preferences);
		renderRequest.setAttribute("quicklinks", quicklinks);
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			getSiteURL(resourceRequest, resourceResponse);
		} catch (IOException ioException) {
			_log.info(ioException.getMessage());
		} catch (PortletException portletException) {
			_log.info(portletException.getMessage());
		}
	}

	private void getSiteURL(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String friendlyURL = StringPool.BLANK;
		JSONArray layoutListJSONArray = JSONFactoryUtil.createJSONArray();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String siteURL = ParamUtil.getString(resourceRequest, "siteURL");
		DynamicQuery layoutQuery = DynamicQueryFactoryUtil.forClass(Layout.class,
				PortalClassLoaderUtil.getClassLoader());
		Group group = themeDisplay.getScopeGroup();
		Criterion criterion = null;
		criterion = RestrictionsFactoryUtil.like("name", StringPool.PERCENT + siteURL + StringPool.PERCENT);
		criterion = PropertyFactoryUtil.forName("groupId").eq(new Long(group.getGroupId()));
		layoutQuery.add(criterion);
		JSONObject layoutJSON = null;
		try {
			List<Layout> layoutList = LayoutLocalServiceUtil.dynamicQuery(layoutQuery);
			for (Layout layout : layoutList) {
				friendlyURL = PortalUtil.getLayoutURL(layout, themeDisplay);
				friendlyURL = friendlyURL.replace(themeDisplay.getPortalURL(), StringPool.BLANK);
				layoutJSON = JSONFactoryUtil.createJSONObject();
				layoutJSON.put("siteURL", friendlyURL);
				layoutListJSONArray.put(layoutJSON);
			}
		} catch (Exception e) {
			_log.info(e.getMessage());
		}
		PrintWriter out = resourceResponse.getWriter();
		out.println(layoutListJSONArray.toString());
	}

	private static Log _log = LogFactoryUtil.getLog(QuickLink.class.getName());

}
