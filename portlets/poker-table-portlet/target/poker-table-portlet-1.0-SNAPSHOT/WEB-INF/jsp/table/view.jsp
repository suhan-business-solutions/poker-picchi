<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<div class="container marketing">
      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-md-4">
          <img class="img-circle" src="<%=request.getContextPath( ) %>/images/user.jpeg" alt="User" style="width: 140px; height: 140px;">
          <h2>User Creation</h2>
          <p>Add a User to current Group.</p>
          <p><a class="btn btn-primary" href="#" role="button">Add User</a></p>
        </div><!-- /.col-md-4 -->
        <div class="col-md-4">
          <img  src= "<%=request.getContextPath( ) %>/images/group.jpeg" alt="Group" style="width: 140px; height: 140px;">
          <h2>Group Creation</h2>
          <p>Create a Group.</p>
          <p><a class="btn btn-primary" href="#" role="button">Create Group</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-md-4">
          <img class="img-circle" src="<%=request.getContextPath( ) %>/images/pokertable.jpeg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Initiate a table</h2>
          <p>This will start the poker table with given list of users and starts the table dash board.</p>
          <p><a class="btn btn-primary" href="#" role="button">Initiate Table</a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

</div>
