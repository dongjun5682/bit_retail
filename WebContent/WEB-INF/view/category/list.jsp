<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
<div class="container" style="width:250px;">
  <ul class="list-group" id="cate_side_menu">
    <li class="list-group-item" id="cate_list" style="background-color: green">카테고리 목록</li>
    <li class="list-group-item" id="cate_register">카테고리 등록</li>
    <li class="list-group-item" id="cate_search">카테고리 조회</li>
    <li class="list-group-item" id="cate_modify">카테고리 수정</li>    
    <li class="list-group-item" id="cate_delete">카테고리 삭제</li>
  </ul>
</div>
</div>
<div class="grid-item" id="content">
<table class="table table-hover">
      <thead>
        <tr>
      	<th>No.</th>
	    <th>카테고리 제목</th>
	    <th>카테고리 설명</th>
        </tr>
      </thead>
      <tbody>
       <c:forEach items="${list}" var="category" varStatus="status">
		   <tr>
		    <td>${category.categoryId}</td>
		    <td>${category.categoryName}</td>
		    <td>${category.description}</td>
		  </tr>
	  </c:forEach>
      </tbody>
    </table>  
	<%-- <div class="center">
	  <div class="pagination">
	  <c:if test="${pagination.existPrev}">
	      <a href="${ctx}/customer.do?cmd=customer_list&page=list&page_num=${pagination.prevBlock}">&laquo;</a>
	  </c:if>
	  <c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" varStatus="status">
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
	  	  <a href='${ctx}/customer.do?cmd=customer_list&page=list&page_num=${pagination.nextBlock}'>&raquo;</a>
	  </c:if>
	  </div>
	</div> --%>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script src="${js}/employee.js">



</script>



