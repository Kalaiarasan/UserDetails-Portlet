
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.kernel.util.PropsKeys"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil"%>
<%@page import="com.liferay.portlet.journal.model.JournalArticle"%>
 
<%@include file="/html/init.jsp"%> 
 
<%-- <% 
List<JournalArticle> journalArticles = JournalArticleLocalServiceUtil.getArticles();
for(JournalArticle jArticle:journalArticles){
%>
<liferay-ui:journal-article articleId="<%=jArticle.getArticleId()%>" groupId="<%=scopeGroupId %>"
	languageId="<%=locale.getLanguage() %>" showTitle="true"/>

<%} %> --%>
<%--   
<%
	List<User> users = new ArrayList<User>();
	long longSiteId = GetterUtil.getLong(siteId);
	String SiteName = "";
	try {
		users = UserLocalServiceUtil.getGroupUsers(longSiteId);
		SiteName = GroupLocalServiceUtil.getGroup(longSiteId).getName();
	} catch (Exception e) {

	}
%>
<%
	if (!SiteName.equals(StringPool.BLANK)) {
%>
<h5>
	<%=SiteName%>
	Site Users
</h5>
<table border="1">
	<tr>
		<th>User First Name</th>
		<th>User Last Name</th>
		<th>User Screen Name</th>
		<th>User Email Address</th>
	</tr>
	<%
		for (User userobj : users) {
	%>
	<tr>
		<td><%=userobj.getFirstName()%></td>
		<td><%=userobj.getLastName()%></td>
		<td><%=userobj.getScreenName()%></td>
		<td><%=userobj.getEmailAddress()%></td>

	</tr>
	<%
		}
	%>
</table>
<%
	} else {
%>
<div class="portlet-msg-info">Please contact site administrator to
	configure the site name</div>
<%
	}
%>


 --%>
  
  <liferay-ui:success key="added-Person"
	message="Person data Added Successfully" />
<liferay-ui:success key="deleted-Person"
	message="Person data Deleted Successfully" />
<liferay-ui:success key="workflow-not-enabled"
	message="Workflow not enabled" />
	
<portlet:actionURL name="addPerson" var="addPersonURL"></portlet:actionURL>
<aui:form action="<%=addPersonURL%>" name="<portlet:namespace />fm">

	<aui:fieldset>

		<aui:input name="name" />
		<aui:input name="sex" />
		<aui:input name="age" />
		<aui:input name="city" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>

	</aui:button-row>
</aui:form>
<liferay-ui:search-container> 
	<liferay-ui:search-container-results
		results="<%=PersonLocalServiceUtil.getPersons(searchContainer.getStart(), searchContainer.getEnd())%>"
		total="<%=PersonLocalServiceUtil.getPersonsCount()%>" />
	<liferay-ui:search-container-row
		className="net.opentrends.user.model.Person" modelVar="person">
		<liferay-ui:search-container-column-text property="name" name="Name" />	 
		<liferay-ui:search-container-column-text name="status"><%=WorkflowConstants.LABEL_APPROVED %></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-jsp name="Actions"
			path="/html/user/action.jsp" align="right" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
 
 
 <% 
List<Organization> organizationList=(List)renderRequest.getAttribute("organizationList"); 
 %>
         
<select name="organization">
<c:forEach var="org" items ="${organizationList}">
   <option value="${org.organizationId}">${org.name}</option>
   </c:forEach>

</select>
 <%-- <c:choose>
			<c:when test="fn:length(requestScope.organizationList) == 0">
				<div>
					<liferay-ui:message key="no-organization-found" />
				</div>
			</c:when>
			<c:otherwise>
				<c:forEach var="organization" items="${requestScope.organizationList}">					
								${organization.name}					 
				</c:forEach>
			</c:otherwise>
		</c:choose>
  --%>