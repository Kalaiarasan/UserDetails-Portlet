<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@include file="/html/init.jsp"%>
<%
	String portletResource = ParamUtil.getString(request, "portletResource");
	 
%>
<liferay-ui:success key="potlet-config-saved"
	message="Portlet Configuration have been successfully saved" />
<liferay-portlet:actionURL var="configurationActionURL"
	portletConfiguration="true"></liferay-portlet:actionURL>

<liferay-portlet:resourceURL portletConfiguration="true"
	portletName="<%=portletResource%>" id="getSiteURL" var="getSiteURL" />
<liferay-ui:error key="the-URL-is-not-valid"
	message='Button Text and URL are required fields. URL must start with "/" or "http://" or "https://".' />
<aui:form action="<%=configurationActionURL%>" name="saveConfiguration"
	method="post">
	<c:choose>
		<c:when test="${empty quicklinks}">
			<div id="quicklink-fields">
				<div class="lfr-form-row lfr-form-row-inline">
					<div class="row-fields" style="display: flex;">
						<div class="span6">
							<aui:input label="Button Text" name="buttonText0">
								<aui:validator name="required" />
							</aui:input>

						</div>
						<div class="span6">
							<aui:input label="Friendly URL" name="href0"
								onClick="updateId(this.id)"
								helpMessage='<%=LanguageUtil.get(locale, "quick-links-help")%>'>
								<aui:validator name="required" />
							</aui:input>

						</div>
					</div>
				</div>
			</div>
		</c:when>
		<c:otherwise>
			<div id="quicklink-fields">
				<c:forEach var="quicklink" items="${quicklinks}" varStatus="status">
					
					<div class="lfr-form-row lfr-form-row-inline">
						<div class="row-fields" style="display: flex;">
							<div class="span6">
								<aui:input label="Button Text" name="buttonText${status.index}"
									value="${quicklink['buttonText']}">
									<aui:validator name="required" />
								</aui:input>
							</div>
							<div class="span6">
								<aui:input label="Friendly URL" name="href${status.index}"
									value="${quicklink['href']}" onClick="updateId(this.id)"
									helpMessage='<%=LanguageUtil.get(locale, "quick-links-help") %>'>
									<aui:validator name="required" />
								</aui:input>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</c:otherwise>
	</c:choose>



	<aui:button type="submit" name="Save Configuration"
		value="Save Configuration"></aui:button>

</aui:form>

<aui:script>
	AUI().use('liferay-auto-fields', function(A) {
		new Liferay.AutoFields({
			contentBox : '#quicklink-fields',
			fieldIndexes : '<portlet:namespace />quicklinkIndexes'
		}).render();
	});

	function updateId(id) {
		var href = id.replace("_86_", "");
		AUI().use('autocomplete-list', 'aui-base', 'aui-io-request',
				'autocomplete-filters', 'autocomplete-highlighters',
				function(A) {
					A.io.request('<%=getSiteURL.toString()%>', {
						dataType : 'json',
						method : 'GET',
						on : {
							success : function() {
								new A.AutoCompleteList({
									allowBrowserAutocomplete : 'true',
									enableCache : 'false',
									activateFirstItem : 'true',
									inputNode : '#<portlet:namespace/>' + href,
									resultTextLocator : 'siteURL',
									render : 'true',
									resultHighlighter : 'phraseMatch',
									resultFilters : [ 'phraseMatch' ],
									source : this.get('responseData'),
								})
							}
						}
					});
				});
	}
</aui:script>
	
























