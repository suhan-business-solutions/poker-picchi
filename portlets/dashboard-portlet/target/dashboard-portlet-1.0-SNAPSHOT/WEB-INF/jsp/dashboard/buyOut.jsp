<%@ include file="../common/init.jspf"%>

<portlet:actionURL var="addBuyOut">
	<portlet:param name="action" value="buy-out" />
</portlet:actionURL>

<form:form method="post" action="${ addBuyOut}" commandName="buyOut" class="form-horizontal">
	<form:hidden path="playerId" />
	<form:hidden path="tableId" />
	<div class="control-group">
		<label class="control-label" for="textinput">Player Name</label>
		<div class="controls">
			<form:input id="textinput" path="playerName" readonly="true" />
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="textinput">Amount Returned</label>
		<div class="controls">
			<div class="input-prepend input-append">
				<span class="add-on">$</span>
				<form:input class="span3" id="amount" path="amount" style="text-align:right;" maxlength="3"/>
				<span class="add-on">.00</span>
			</div>
		</div>
	</div>


	<!-- Button -->
	<div align="center">
		<aui:button-row>
			<aui:button cssClass="btn btn-primary btn-large" type="submit" icon="icon-briefcase" iconAlign="left" value="Buy Out" />
			<aui:button cssClass="btn btn-warning btn-large" type="reset" icon="icon-trash" iconAlign="left" value="Clear" />
		</aui:button-row>
	</div>
</form:form>

<script type="text/javascript">
	AUI().use('aui-base', function(A) {
		var amt = A.one('#amount');
		amt.on('focus', function(event) {
			if(amt.val() === '0'){
				amt.set('value', '');
			}
		});
		amt.on('blur', function(event) {
			if(amt.val() === ''){
				amt.set('value', '0');
			}
		});
		
		$("#amount").ForceNumericOnly();
	});
</script>




