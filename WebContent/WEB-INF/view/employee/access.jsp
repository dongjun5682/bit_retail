<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/employee/access.css" />
<div class="grid-item" id="side_menu">
	<h1><font style="font-size: 25px">사원 접속</font></h1>
</div>
<div class="grid-item" id="content">
<div style="height:40px"></div>	    
<form class="form-horizontal">
  <div class="form-group">
    <small class="col-sm-2 control-label">Employee_ID</small>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="empno" name="empno" placeholder="Employee_ID" value="1065">
    </div>
  </div>
  <div class="form-group">
    <small class="col-sm-2 control-label">Name</small>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="name" placeholder="EmployeeName" value="김경민">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">ACCESS</button>
    </div>
  </div>
      <input type="hidden" name="cmd" value="access" />
	    <input type="hidden" name="dir" value="customer" />
	    <input type="hidden" name="page" value="list" />
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var empno = $('#empno').val();
	var name = $('#name').val();
	$('#form')
	.attr('action', '${ctx}/employee.do')
	.submit();
});
</script>


