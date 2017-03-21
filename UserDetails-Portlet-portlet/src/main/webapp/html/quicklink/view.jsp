<%@ include file="/html/init.jsp"%>
 

<div>
	<liferay-ui:message key="quick-links" />
</div>
<div style="overflow: auto;">
	<c:choose>
		<c:when test="${empty requestScope.quicklinks}">
			<div class="portlet-msg-info">
				<liferay-ui:message key="there-are-no-quick-links-configured" />

			</div>
		</c:when>
		<c:otherwise>
			<c:forEach var="quicklink" items="${requestScope.quicklinks}">
				<div class="button-holder">
					<c:if test="${not empty quicklink['buttonText']}">
						<a class="btn btn-primary" style="width: 100%"
							href="${quicklink['href']}"> ${quicklink['buttonText']} </a>
					</c:if>
				</div>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</div>
