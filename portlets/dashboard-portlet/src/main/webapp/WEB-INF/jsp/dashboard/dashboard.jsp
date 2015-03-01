<%@ include file="../common/init.jspf"%>


<div class="taglib-header ">
	<h3 class="header-title" align="center">
		<span> Table Statistics </span>
	</h3>
</div>

<form class="form-horizontal">

<div class="container">
<div class="row">
<div class="col-md-6">
	<div class="control-group" style="margin-bottom: -10px;">
	  <label class="control-label" >Table Name</label>
	  <div class="controls">
		  	<div class="display-txt">
		   		<h3><small>Walsh Trails Poker Club</small></h3>
		    </div>
	  </div>
	</div>
	
	<!-- Text input-->
	<div class="control-group" >
	  <label class="control-label" >Table Value</label>
	  <div class="controls">
	   		<div class="display-txt">
		   		<h3><small>$ 100.00</small></h3>
		    </div>
	  </div>
	</div>
	
	
</div>
<div class="col-md-6" style="width:350px;">
	<!-- Select Basic -->
	<div class="control-group" style="margin-bottom: -10px;">
	  <label class="control-label" >No. of Players</label>
	  <div class="controls">
	    	<div class="display-txt">
		   		<h3><small>10 Players</small></h3>
		    </div>
	  </div>
	</div>
	<div class="control-group">
	  <label class="control-label" for="selectbasic">Date and Time Started</label>
	  <div class="controls">
	    	<div class="display-txt">
		   		<h3><small>21 Feb 2015 10:00 CST</small></h3>
		    </div>
	  </div>
	</div>
	 
</div>
</div>
</div>
<!-- Button -->
 
<div>
	<liferay-ui:search-container delta="${ users.size()}"  emptyResultsMessage="No Players to Display">
	       <liferay-ui:search-container-results
	           results="${ users}"
	           total="${ users.size()}" />
	
	       <liferay-ui:search-container-row
	           className="com.liferay.portal.model.User"
	           modelVar="user" keyProperty="userId">
	           <liferay-ui:search-container-column-text name="Player Name">
	           		${user.getFullName()}
	           </liferay-ui:search-container-column-text>
	           <liferay-ui:search-container-column-text name="Total Buy-In">
	           		$ 50.00
	           </liferay-ui:search-container-column-text>
	           <liferay-ui:search-container-column-text name="Paid Buy-Ins">
	           		2
	           </liferay-ui:search-container-column-text>
	           <liferay-ui:search-container-column-text name="Un-Paid Buy-Ins">
	           		<p style="font-color:red;">3</p>
	           </liferay-ui:search-container-column-text>
	           <liferay-ui:search-container-column-text name="Buy-In #" cssClass="search-container-credit-col">
	           		5
	           </liferay-ui:search-container-column-text>
	           <liferay-ui:search-container-column-text name="Time Joined">
	           		$ 50.00
	           </liferay-ui:search-container-column-text>
	           <liferay-ui:search-container-column-text cssClass="search-container-action-col" >
	           		<portlet:renderURL var="buyIn" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
						<portlet:param name="action" value="buy-in"/>
						<portlet:param name="playerId" value="${user.userId} "/>
						<portlet:param name="tableId" value="${user.userId} "/>
					</portlet:renderURL>
					<portlet:renderURL var="buyOut" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
						<portlet:param name="action" value="buy-out"/>
						<portlet:param name="playerId" value="${user.userId} "/>
						<portlet:param name="tableId" value="${user.userId} "/>
					</portlet:renderURL>
		           	<liferay-ui:icon-menu>
		           		<liferay-ui:icon iconCssClass="icon-plus-sign" url="javascript:showPopUp('${ buyIn}', 'Buy-In')" label="true" message="Add a Buy In"/>
		           		<liferay-ui:icon iconCssClass="icon-minus-sign" url="javascript:showPopUp('${ buyOut}', 'Buy-Out')" label="true" message="Buy Out"/>
		           	</liferay-ui:icon-menu>
	           </liferay-ui:search-container-column-text>
	           
	       </liferay-ui:search-container-row>
	
	       <liferay-ui:search-iterator />
	   </liferay-ui:search-container>
</div> 

 <div align="center">
     <aui:button-row>
    	<aui:button cssClass="btn btn-primary btn-large" type="submit" icon="icon-user" iconAlign="left" value="Add Player" useDialog="true"/>
    	<aui:button cssClass="btn btn-danger btn-large" icon="icon-credit" iconAlign="left" value="Roll Out" />
    </aui:button-row>
  </div>
</form>

<aui:script>
function showPopUp( url, actionName ){
AUI().use('aui-base', 'aui-io-plugin-deprecated', 'liferay-util-window',
	function(A) {
		
		var popUpWindow=Liferay.Util.Window.getWindow(	
			{
				dialog: {
					centered: true,
					constrain2view: true,
					//cssClass: 'yourCSSclassName',
					modal: true,
					resizable: false,
					width: 475,
					height:330
				}
			}
		).plug(
			A.Plugin.IO,
				{			
					autoLoad: false
				}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html(actionName);
		popUpWindow.io.set('uri',url);
		popUpWindow.io.start();
	});
}
</aui:script>