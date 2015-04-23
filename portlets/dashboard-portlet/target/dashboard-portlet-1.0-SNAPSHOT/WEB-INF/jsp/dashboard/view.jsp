<%@ include file="../common/init.jspf"%>

<portlet:defineObjects />

<portlet:actionURL var="createTable">
	<portlet:param name="action" value="createTable" />
</portlet:actionURL>

<div class="taglib-header ">
	<h3 class="header-title" align="center">
		<span> Roll Table </span>
	</h3>
</div>

<form name="rollTable" method="post" action="${ createTable}" class="form-horizontal">

	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="textinput">Table Name</label>
					<div class="controls">
						<input id="textinput" name="textinput" type="text" placeholder="Alias Table Name" />

					</div>
				</div>

				<!-- Select Basic -->
				<div class="control-group">
					<label class="control-label" for="selectbasic">Default Buy In</label>
					<div class="controls">
						<div class="input-prepend input-append">
							<span class="add-on">$</span>
							<input class="span2" id="amount" name="amount" style="text-align:right; color:#FBA051; font-weight:400; background-color: white;" maxlength="2" readonly />
							<span class="add-on">.00</span>
						</div>
						<div id="slider" style="width: 215px;margin-top: 10px;"></div>
					</div>
				</div>
			</div>
			<div class="col-md-6" style="width: 350px;">

				<liferay-ui:search-container delta="${ users.size()}" rowChecker="<%=new RowChecker(renderResponse)%>" emptyResultsMessage="No Users to Display">
					<liferay-ui:search-container-results results="${ users}" total="${ users.size()}" />

					<liferay-ui:search-container-row className="com.liferay.portal.model.User" modelVar="user" keyProperty="userId">
						<liferay-ui:search-container-column-text name="Player Name">
	           				${user.getFullName()}
	           			</liferay-ui:search-container-column-text>
						<liferay-ui:search-container-column-text name="Credit ?" cssClass="search-container-credit-col">
							<input type="checkbox" />
						</liferay-ui:search-container-column-text>
					</liferay-ui:search-container-row>

					<liferay-ui:search-iterator />
				</liferay-ui:search-container>

			</div>
		</div>
	</div>
	<!-- Button -->
	<div align="center">
		<aui:button-row>
			<aui:button cssClass="btn btn-primary btn-large" type="submit" icon="icon-heart" iconAlign="left" value="Create Table" useDialog="true" />
			<aui:button cssClass="btn btn-warning btn-large" type="reset" icon="icon-trash" iconAlign="left" value="Clear" />
		</aui:button-row>
	</div>
</form>
<script type="text/javascript">
	$(function() {
		$("#slider").slider({
			value : 10,
			min : 0,
			max : 50,
			step : 10,
			slide : function(event, ui) {
				$("#amount").val( ui.value);
			}
		});
		$("#amount").val( $("#slider").slider("value"));
		
		$("#amount").ForceNumericOnly();
	});
</script>
