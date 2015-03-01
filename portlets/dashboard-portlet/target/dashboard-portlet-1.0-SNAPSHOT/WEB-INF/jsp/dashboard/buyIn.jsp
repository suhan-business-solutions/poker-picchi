<%@ include file="../common/init.jspf"%>

<h2>This is Buy In View</h2>
<form name="rollTable" method="post" action="${ createTable}" class="form-horizontal">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="control-group">
					<label class="control-label" for="textinput">Player Name</label>
					<div class="controls">
						<input id="textinput" name="textinput" type="text" placeholder="Enter Player Name" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="textinput">Amount</label>
					<div class="controls">
						<input id="amount" name="amount" type="text" placeholder="Enter Buy In Amount" />
						<input type="text" name="stepper" id="stepper4" class="gui-input">
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="control-group">
					<label class="control-label" for="credit">Credit ?</label>
					<div class="controls">
						<input id="credit" name="credit" type="checkbox" />
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Button -->
	<div align="center">
		<aui:button-row>
			<aui:button cssClass="btn btn-primary btn-large" type="submit" icon="icon-plus" iconAlign="left" value="Add Buy In"/>
			<aui:button cssClass="btn btn-warning btn-large" type="reset" icon="icon-trash" iconAlign="left" value="Clear" />
		</aui:button-row>
	</div>
</form>

<script type="text/javascript">
    $(function() {
    
	$('#stepper4').stepper({ 
                UI: false,
                allowWheel :false,
                limit: [10, 50],
                wheel_step: 10,
                arrow_step: 10             
	});
            
    });
</script>