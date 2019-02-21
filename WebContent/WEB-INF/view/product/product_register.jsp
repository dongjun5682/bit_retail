<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/> 
<link rel="stylesheet" href="${css}product/product_register.css"/>
<div class="grid-item" id="pro_register_nav">
<h1>상품등록</h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
	<div class="grid-container">
	    <div class="input-group" id="item_2">
  			<span class="input-group-addon" id="basic-addon1">상품명 </span>
 			<input type="text" class="form-control" placeholder="product_name" aria-describedby="sizing-addon1" 
 			 id="product_name" name="product_name">
		</div>
		<div class="input-group" id="item_4">
  			<span class="input-group-addon" id="basic-addon1">수량</span>
 			<input type="text" class="form-control" placeholder="unit" aria-describedby="sizing-addon2"
 			id="unit" name="unit">
		</div>
		<div class="input-group" id="item_6">
  			<span class="input-group-addon" id="basic-addon1">가격</span>
 			<input type="text" class="form-control" placeholder="price" aria-describedby="basic-addon1"
 			 id="price" name="price" >
		</div>
		<div class="input-group" id="item_8">
  			<span class="input-group-addon" id="basic-addon1">제조사 번호</span>
 			<input type="text" class="form-control" placeholder="supplier_id" aria-describedby="basic-addon1"
 			 id="supplier_id" name="supplier_id" >
		</div>
		<div class="input-group" id="item_10">
  			<span class="input-group-addon" id="basic-addon1">카테고리 번호</span>
 			<input type="text" class="form-control" placeholder="category_id" aria-describedby="basic-addon1"
 			 id="category_id" name="category_id" >
		</div>
		<button type="button" class="btn btn-default btn-lg" id="confirm_btn">
 			 <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
		</button>
		<button type="button" class="btn btn-default btn-lg" id="cancel_btn" >
 			 <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
		</button>
	    <input type="hidden" name="cmd" value="pro_register" />
	    <input type="hidden" name="page" value="product_list" />
	</div>
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var product_name = $('#product_name').val();
	var unit = $('#unit').val();
	var price = $('#price').val();
	var supplier_id = $('#supplier_id').val();
	var category_id = $('#category_id').val();
	$('#form')
	.attr('action', '${ctx}/product.do')
	.attr('method','post')
	.submit();
});

</script>
