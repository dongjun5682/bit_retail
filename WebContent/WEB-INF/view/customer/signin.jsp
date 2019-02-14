<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/employee/access.css" />
<div class="grid-item" id="side_menu">
	<h1><font style="font-size: 25px">회원 로그인</font></h1>
</div>
<div class="grid-item" id="content">
<div style="height:40px"></div>	    
<form class="form-horizontal">
  <div class="form-group">
    <small class="col-sm-2 control-label">UserID</small>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="customerId" name="customerId" placeholder="User Name">
    </div>
  </div>
  <div class="form-group">
    <small class="col-sm-2 control-label">Password</small>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="password" name="password" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Sign in</button>
    </div>
  </div>
     	<input type="hidden" name="cmd" value="signin" />
	    <input type="hidden" name="dir" value="category" />
	    <input type="hidden" name="page" value="main" />
</form>
</div>

<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var customerId = $('#customerId').val();
	var password = $('#password').val();
	$('#form')
	.attr('action', '${ctx}/customer.do')
	.submit();
});
</script>


