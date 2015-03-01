<%@ include file="../common/init.jspf"%>

<portlet:actionURL var="addBuyIn">
	<portlet:param name="action" value="add-buy-in" />
</portlet:actionURL>

<form:form method="post" action="${ addBuyIn}" commandName="buyIn" class="form-horizontal">
	<form:hidden path="tableId" />
	<form:hidden path="playerId" />
	<div class="control-group">
		<label class="control-label" for="textinput">Player Name</label>
		<div class="controls">
			<form:input id="textinput" path="playerName" readonly="true"/>
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="amount">Amount</label>
		<div class="controls">
			<div class="input-prepend input-append">
				<span class="add-on">$</span> 
				<form:input class="span2" id="amount" path="amount" style="text-align:right; color:#FBA051; font-weight:400; background-color: white;" maxlength="2" readonly="true"/> 
				<span class="add-on">.00</span>
			</div>
			<div id="slider" style="width: 215px;"></div>
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="credit">Credit ?</label>
		<div class="controls control-check-box">
			<form:checkbox id="credit" path="credit" />
		</div>
	</div>

	<!-- Button -->
	<div align="center">
		<aui:button-row>
			<aui:button cssClass="btn btn-primary btn-large" type="submit" icon="icon-plus" iconAlign="left" value="Add Buy In" />
			<aui:button cssClass="btn btn-warning btn-large" type="reset" icon="icon-trash" iconAlign="left" value="Clear" />
		</aui:button-row>
	</div>
</form:form>

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