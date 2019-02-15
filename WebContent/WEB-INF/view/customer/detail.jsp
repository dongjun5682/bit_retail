<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet"href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<img src="resources/img/pascal.JPG"/>
</div>
<div class="grid-item" id="content">
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
<jsp:include page="../home/bottom.jsp"/>