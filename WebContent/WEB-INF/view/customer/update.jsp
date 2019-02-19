<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet"href="${css}/customer/update.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<img src="${img}/default_img.jpg"/>
</div>

<div class="grid-item" id="content">
<form id="form">
[${cus.customerName}의 정보] <br /> 
아이디 : ${cus.customerId} <br />
이 름  : ${cus.customerName} <br />
생년월일 : ${cus.ssn} <br />
성 별 : 남 <br />
전화번호 : <input type="text" name="phone" placeholder="${cus.phone}" /><br />
우편번호 : <input type="text" name="postalCode" placeholder="${cus.postalCode} " /><br />
지번주소 : <input type="text" name="city" placeholder="${cus.city}" /><br />
상세주소 : <input type="text" name="address" placeholder="${cus.address}" /><br />
임시번호 : <input type="text" name="password" placeholder="임시 비밀번호" />
<input type="hidden" name="customer_Id" value ="${cus.customerId}" />
<input type="hidden" name="cmd" value="cust_update" />
<input type="hidden" name="page" value="detail" />
</form>
</div>	
<div class="grid-item" id="modify">
	<button type="button" class="btn btn-success" id="confirm_btn">확인</button>
</div>
<div class="grid-item" id="cancel">
	<button type="button" class="btn btn-danger" id="cancel_btn">취소</button>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var form = $('#form');
	form.attr('action','${ctx}/customer.do');
	form.attr('method','post');
	form.submit();
});

$('#cancel_btn').click(function(){
	alert('취소 클릭');
});

</script>