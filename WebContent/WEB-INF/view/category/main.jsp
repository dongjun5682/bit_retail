<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/category/category.css" />
<div id="cust_nav">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
         <button type="button" class="btn btn-default btn-lg" id="home_btn">
  				<span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home
		 </button>
          <ul class="nav navbar-nav navbar-right">
       		 <li class="dropdown">
         	 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${cus.customerName}님 환영합니다<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="${ctx}/customer.do?cmd=cust_retrieve&page=detail&customer_Id=${cus.customerId}">MyPage</a></li>
            <li class="divider"></li>
            <li><a href="#">Log out</a></li>
          </ul>
        </li>
      </ul>
       <img class="nav navbar-nav navbar-right" id="profile_img" src="${img}/${image.imgName}.${image.imgExtention}"/>	
        </div>
</div>
    <div class="row">
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
			<img data-src="holder.js/100%x200" alt="100%x200" src="${img}imac.jpg" data-holder-rendered="true" style="height: 200px; width: 100%; display: block;">
          <div class="caption">
            <h3 id="thumbnail-label">데스크탑 <a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <p>IMAC</p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
       		<div class="embed-responsive embed-responsive-16by9">
  				<iframe class="embed-responsive-item" src="https://www.youtube.com/embed/WVPRkcczXCY"></iframe>
			</div>
          <div class="caption">
            <h3 id="thumbnail-label">노트북<a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <p>Macbook Pro </p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img data-src="holder.js/100%x200" alt="100%x200" src="${img}iphone.jpg" data-holder-rendered="true" style="height: 200px; width: 100%; display: block;">
          <div class="caption">
            <h3 id="thumbnail-label">스마트폰<a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <p>IphoneXS</p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
        </div>
      </div>
    </div>
<jsp:include page="../home/bottom.jsp"/>  
<script>
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
});
$('#cust_login').click(function(){
	location.assign('home.do?cmd=move&page=login');
});
$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access');
});
$('#home_btn').click(function(){
	location.assign('home.do');
});
</script>