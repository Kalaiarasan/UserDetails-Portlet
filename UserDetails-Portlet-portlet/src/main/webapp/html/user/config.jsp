
<%@include file="/html/init.jsp"%>
  
<%
List<Group> list=GroupLocalServiceUtil.getGroups(0,GroupLocalServiceUtil.getGroupsCount());
%>
<liferay-ui:success key="potlet-config-saved"
	message="Portlet Configuration have been successfully saved" />
<liferay-portlet:actionURL var="configurationActionURL" portletConfiguration="true"/>
<aui:form action="<%=configurationActionURL%>" method="post" name="configurationForm">
Select Site:<br/>
<aui:select name="siteId" id="siteId">
<%for(Group group:list) {%>
<aui:option value="<%=group.getGroupId() %>" label="<%=group.getName() %>"></aui:option>
<%} %>
</aui:select>
<br/>
<aui:button type="submit" name="Save Configuration" value="Save Configuration"></aui:button>
</aui:form>  