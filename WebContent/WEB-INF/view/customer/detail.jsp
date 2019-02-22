<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet"href="${css}/customer/detail.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<form id="file_form">
 		<img id="detail_img" src="${img}/${image.imgName}.${image.imgExtention}"/>	
 		<input type="file" name="file_upload" id="file_upload"/>
 		<input type="submit" class="btn btn-success" id="file_upload_btn"/>
<%--  		<input type="hidden" name="cmd" value="cust_file_upload"/>
 		<input type="hidden" name="page" value="detail" />
 		<input type="hidden" name="customer_Id" value="${cus.customerId}"/> --%>
	</form>
</div>
<div class="grid-item" id="content">
<div id="detail_info">
[${cus.customerName}의 정보] <br /> 
아이디 : ${cus.customerId} <br />
이 름  : ${cus.customerName} <br />
생년월일 : ${cus.ssn} <br />
성 별 : 남 <br />
전화번호 : ${cus.phone} <br />
우편번호 : ${cus.postalCode} <br />
지번주소 : ${cus.city} <br />
상세주소 : ${cus.address}<br />
</div>
</div>
<div class="grid-item" id="modify">
	<button type="button" class="btn btn-success" id="detail_modify">수정</button>
</div>
<div class="grid-item" id="reomve">
	<button type="button" class="btn btn-danger" id="detail_remove">회원탈퇴</button>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#detail_remove').click(function(){
	location.assign('${ctx}/customer.do?cmd=cust_remove&dir=home&page=main&customer_Id=${cus.customerId}');
});
$('#detail_modify').click(function(){
	alert('수정버튼 클릭');
	location.assign('${ctx}/customer.do?cmd=cust_retrieve&page=update&customer_Id=${cus.customerId}');
});
$('#file_upload_btn').click(function(){
	$('#file_form')
	.attr('method','post')
	.attr('action','${ctx}/customer.do?cmd=cust_file_upload&page=detail&customer_Id=${cus.customerId}')
	.attr('enctype','multipart/form-data')
	.submit();
});
</script>