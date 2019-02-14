<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/signup.css" />
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 25px">회원 등록</font></h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
	<div class="grid-container">
		<div class="input-group" id="item_2">
  			<span class="input-group-addon" id="basic-addon1">아이디  </span>
 			<input type="text" class="form-control" placeholder="UserID" aria-describedby="sizing-addon1" 
 			 id="customerId" name="customerId">
		</div>
		<div class="input-group" id="item_4">
  			<span class="input-group-addon" id="basic-addon1">비밀번호</span>
 			<input type="text" class="form-control" placeholder="Password" aria-describedby="sizing-addon2"
 			 id="password" name="password">
		</div>
		<div class="input-group" id="item_6">
  			<span class="input-group-addon" id="basic-addon1">이름</span>
 			<input type="text" class="form-control" placeholder="UserName" aria-describedby="basic-addon1"
 			 id="customerName" name="customerName" >
		</div>
		<div class="input-group" id="item_8">
  			<span class="input-group-addon" id="basic-addon1">주민번호</span>
 			<input type="text" class="form-control" placeholder="SSN" aria-describedby="basic-addon1"
 			 id="ssn" name="ssn">
		</div>
		<div class="input-group" id="item_10">
  			<span class="input-group-addon" id="basic-addon1">전화번호</span>
 			<input type="text" class="form-control" placeholder="PHONE" aria-describedby="basic-addon1" 
 			id="phone" name="phone">
		</div>
		<div class="input-group" id="item_12">
  			<span class="input-group-addon" id="basic-addon1">지번주소</span>
 			<input type="text" class="form-control" placeholder="city" aria-describedby="basic-addon1" 
 			id="city" name="city">
		</div>
		<div class="input-group" id="item_14">
  			<span class="input-group-addon" id="basic-addon1">상세주소</span>
 			<input type="text" class="form-control" placeholder="address" aria-describedby="basic-addon1" 
 			id="address" name="address">
		</div>
		<div class="input-group" id="item_16">
  			<span class="input-group-addon" id="basic-addon1">우편번호</span>
 			<input type="text" class="form-control" placeholder=postalCode aria-describedby="basic-addon1"
 			 id="postalCode" name="postalCode">
		</div>
		<button type="button" class="btn btn-default btn-lg" id="confirm_btn">
 			 <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
		</button>
		<button type="button" class="btn btn-default btn-lg" id="cancel_btn" >
 			 <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
		</button>
	    <input type="hidden" name="cmd" value="signup" />
	    <input type="hidden" name="page" value="signin" />
	</div>
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var customerId = $('#customerId').val();
	var customerName = $('#customerName').val();
	var password = $('#password').val();
	var address = $('#address').val();
	var city = $('#city').val();
	var postalCode = $('#postalCode').val();
	var ssn = $('#ssn').val();
	var phone = $('#phone').val();
	$('#form')
	.attr('action', '${ctx}/customer.do')
	.submit();
});
</script>
