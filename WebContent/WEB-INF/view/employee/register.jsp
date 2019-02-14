<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/> 
<link rel="stylesheet" href="${css}employee/register.css"/>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 25px">사원 등록</font></h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
	<div class="grid-container">
	    <div class="input-group" id="item_2">
  			<span class="input-group-addon" id="basic-addon1">매니저 </span>
 			<input type="text" class="form-control" placeholder="UserID" aria-describedby="sizing-addon1" 
 			 id="manager" name="manager">
		</div>
		<div class="input-group" id="item_4">
  			<span class="input-group-addon" id="basic-addon1">이 름</span>
 			<input type="text" class="form-control" placeholder="Password" aria-describedby="sizing-addon2"
 			id="name" name="name">
		</div>
		<div class="input-group" id="item_6">
  			<span class="input-group-addon" id="basic-addon1">생년월일</span>
 			<input type="text" class="form-control" placeholder="UserName" aria-describedby="basic-addon1"
 			 id="birthday" name="birthday" >
		</div>
		<div class="input-group" id="item_8">
  			<span class="input-group-addon" id="basic-addon1">사진</span>
 			<input type="text" class="form-control" placeholder="SSN" aria-describedby="basic-addon1"
 			id="photo" name="photo" >
		</div>
		<div class="input-group" id="item_10">
  			<span class="input-group-addon" id="basic-addon1">상 세</span>
 			<input type="text" class="form-control" placeholder="address" aria-describedby="basic-addon1" 
 			 id="notes" name="notes">
		</div>
		<button type="button" class="btn btn-default btn-lg" id="confirm_btn">
 			 <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
		</button>
		<button type="button" class="btn btn-default btn-lg" id="cancel_btn" >
 			 <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
		</button>
	    <input type="hidden" name="cmd" value="register" />
	    <input type="hidden" name="page" value="access" />
	</div>
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var name = $('#name').val();
	var manager = $('#manager').val();
	var birthday = $('#birthday').val();
	var photo = $('#photo').val();
	var desc = $('#notes').val();
	$('#form')
	.attr('action', '${ctx}/employee.do')
	.submit();
});
</script>
