<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/init.jsp"%>


<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Person person = (Person) row.getObject();
	String personId = String.valueOf(person.getPersonId());
%>

<liferay-ui:icon-menu>
	<portlet:actionURL name="deletePerson" var="deleteURL">
		<portlet:param name="personId" value="<%=personId%>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete image="delete" message="Delete"
		url="<%=deleteURL.toString()%>" />
<%-- 	<portlet:renderURL var="viewURL">
		<portlet:param name="mvcPath" value="/html/user/tab1.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon image="view" message="View"
		url="<%=viewURL.toString()%>" />
 --%>
</liferay-ui:icon-menu>
<%-- <aui:script>
		function showPopup() {
			AUI().use(
					'liferay-util-window',
					function(A) {
						Liferay.Util.openWindow({
							dialog : {
								centered : true,
								destroyOnClose : true,
								cache : false,
								width : 500,
								height : 300,
								scrollable : true,
								modal : true
							},
							title : 'Person Details',
							id : '<portlet:namespace/>popUpDialog',
							uri : '<%=viewURL.toString()%>'
						}).render();
						Liferay.provide(window,
								'<portlet:namespace/>closePopup', function(
										popupIdToClose) {
									var popupDialog = Liferay.Util.Window
											.getById(popupIdToClose);
									popupDialog.destroy();
								}, [ 'liferay-util-window' ]);

					});
		}
	</aui:script>
  --%>