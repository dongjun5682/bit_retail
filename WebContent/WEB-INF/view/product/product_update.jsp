<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet"href="${css}/customer/update.css" />
<div class="grid-item" id="nav">
<h1>상품 수정</h1>
</div>
<div class="grid-item" id="side_menu">
 	<img id="product_img" src="${img}/${image.imgName}.${image.imgExtention}"/>
 	<input type="file" name="file_upload" id="file_upload"/>
 	<input type="submit" class="btn btn-success" id="file_upload_btn"/>
</div>
<div class="grid-item" id="content">
<form id="form">
상품명  :<input type="text" name="phone" placeholder="${pro.productName}" /><br />
제조사명 : <input type="text" name="phone" placeholder="${pro.supplierId}" /><br />
카테고리: <input type="text" name="phone" placeholder="${pro.unit}" /><br />
수량 :  <input type="text" name="phone" placeholder="${pro.unit}" /><br />
가격 : <input type="text" name="phone" placeholder="${pro.price}" /><br />
<input type="hidden" name="customer_Id" value ="${pro.productId}" />
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