<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../home/top.jsp" />
<link rel="stylesheet" href="${css}/customer/list.css" />
<link rel="stylesheet" href="${css}/product/product.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div id="pro_nav">
	<form class="navbar-form navbar-left" role="search">
		<div class="form-group">
			<input type="text" class="form-control" placeholder="Search">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	<ul class="nav navbar-nav navbar-right">
		<li><a href="${ctx}/product.do?cmd=move&page=product_register">상품등록</a></li>
	</ul>
</div>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 25px">상품 목록</font>
 	</h1>
</div>
<div class="grid-item" id="content">
	<table class="table table-hover">
		<thead>
			<tr>
				<th>No.</th>
				<th>이미지</th>
				<th>상품명</th>
				<th>제조사명</th>
				<th>카테고리</th>
				<th>수량</th>
				<th>가격</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="pro" varStatus="status">
				<tr>
					<td>${pro.productId}</td>
					<td>${pro.photo}</td>
					<td>${pro.productName}</td>
					<td>${pro.supplierId}</td>
					<td>${pro.categoryId}</td>
					<td>${pro.unit}</td>
					<td>${pro.price}</td>
					<td>
						<a href="${ctx}/product.do?cmd=product_retrieve&page=product_update&product_Id=${pro.productId}">수정</a>
					</td>
					<td>
						<a href="${ctx}/product.do?cmd=product_remove&page=product_remove&product_Id=${pro.productId}">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="center">
		<div class="pagination">
			<c:if test="${pagination.existPrev}">
				<a
					href="${ctx}/product.do?cmd=pro_list&page=product_list&page_num=${pagination.prevBlock}">&laquo;</a>
			</c:if>
			<c:forEach begin="${pagination.startPage}"
				end="${pagination.endPage}" varStatus="status">
				<c:choose>
					<c:when test="${pagination.pageNum eq status.index}">
						<a href="#" class="page active">${status.index}</a>
					</c:when>
					<c:otherwise>
						<a href="#" class="page">${status.index}</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:if test="${pagination.existNext}">
				<a
					href='${ctx}/product.do?cmd=pro_list&page=product_list&page_num=${pagination.nextBlock}'>&raquo;</a>
			</c:if>
		</div>
	</div>
</div>
<jsp:include page="../home/bottom.jsp" />
<script>
$('.btn btn-success').click(function(){
	alert('클릭클릭');
	location.assign('${ctx}/product.do?cmd=product_retrieve&page=product_update&product_Id=${pro.productId}');
});

</script>