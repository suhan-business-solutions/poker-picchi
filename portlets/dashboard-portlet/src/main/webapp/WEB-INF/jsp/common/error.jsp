<%@ include file="init.jspf"%>

<c:choose>
	<c:when test="${not empty ERROR_MAP }">
		<div class="portlet-msg-error">
			<c:forEach items="${ERROR_MAP }" var="error">
				<spring:message code="${error.key }" arguments="${error.value }"
					text="" />
			</c:forEach>
		</div>
	</c:when>
	<c:otherwise>
		<div>
			<span class="portlet-msg-error"> Sorry ! We are unable to
				process your request at this moment.</span>
		</div>
	</c:otherwise>
</c:choose>

