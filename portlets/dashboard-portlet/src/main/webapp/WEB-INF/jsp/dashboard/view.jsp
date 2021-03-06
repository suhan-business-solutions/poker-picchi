<%@ include file="../common/init.jspf"%>

<portlet:defineObjects />

<portlet:actionURL var="createTable">
	<portlet:param name="action" value="createTable" />
	<portlet:param name="orgId" value="${orgId }" />
	<portlet:param name="orgName" value="${orgName }" />
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
						<input id="textinput" name="tableName" type="text" placeholder="${orgName}" />

					</div>
				</div>

				<!-- Select Basic -->
				<div class="control-group">
					<label class="control-label" for="selectbasic">Default Buy In</label>
					<div class="controls">
						<div class="input-prepend input-append">
							<span class="add-on">$</span>
							<input class="span2" id="amount" name="buyIn" style="text-align:right; color:#FBA051; font-weight:400; background-color: white;" maxlength="2" readonly />
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
							<input type="checkbox" name="credit-${user.getUserId() }"  id="${user.getUserId() }" class="credit" disabled/>
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
			<!--<aui:button cssClass="btn btn-warning btn-large" type="reset" icon="icon-trash" iconAlign="left" value="Clear" />-->
		</aui:button-row>
	</div>
</form>
<script type="text/javascript">
	$(function() {
		$("#slider").slider({
			value : 10,
			min : 10,
			max : 50,
			step : 10,
			slide : function(event, ui) {
				$("#amount").val( ui.value);
			}
		});
		$("#amount").val( $("#slider").slider("value"));
		
		$("#amount").ForceNumericOnly();
	});
	
	AUI().use('aui-base', function(A) {   
		
		A.all('input[type=checkbox][name=<portlet:namespace />rowIds]').each(
			function(node){
				node.on('click', function(event){
					var credit = A.one('#'+node.get('value'));
					if (node.get('checked')){
						credit.set("disabled", false);
						credit.set("checked", true);
					}
					else{
						credit.set("disabled", true);
						credit.set("checked", false);
					}
					
				});
			}		
		);
		var allrows = A.one('input[type=checkbox][name=<portlet:namespace />allRowIds]');
		allrows.on('click', function(event){
			A.all('.credit').each(function(node){
				if (allrows.get('checked')){
					node.set("disabled", false);
					node.set("checked", true);
				}
				else{
					node.set("disabled", true);
					node.set("checked", false);
				}
				console.log(""+node.get('id'));
			});
			
		});
		
	
	});	
	
</script>
