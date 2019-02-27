

var context = "${ctx}";
$('.page').click(()=>{
	location.assign(
			ctx + '/customer.do');
});
$('#cate_register').click(function(){
	$('#cate_side_menu >li').attr('style','background-color:white');
	$('#cate_register').attr('style','background-color:green');
	$('#content').html('<form id="form">'
			+'  <div class="form-group">'
			+'    <label for="email">카테고리 이름</label>'
			+'    <input type="email" class="form-control" name="cate_name">'
			+'  </div>'
			+'  <div class="form-group">'
			+'    <label for="pwd">상세 설명</label>'
			+'    <input type=text class="form-control" name="desc"/>'
			+'  </div>'
			+'  <div class="checkbox">'
			+'    <label><input type="checkbox"> Remember me</label>'
			+'  </div>'
			+'  <button type="submit" class="btn btn-default" >등록하기</button>'
			+'</form>');
});
$('#cate_search').attr('style','cursor:pointer').click(function(){
	$('#cate_side_menu >li ').attr('style','background-color:white');
	$('#cate_search').attr('style','background-color:green');
	$('#content').html('<form id="form">'
			+'  <div class="form-group">'
			+'    <h2>카테고리 검색</h2>'
			+'    <select>'
			+'  	<option name="cate_id" value="1000">스마트폰 </option>'
			+'  	<option name="cate_id" value="1021">데스크탑 </option>'
			+'    	<option name="cate_id" value="1022">노트북 </option>'
			+'  </div>'
			+' <div><h2>asdasdsad</h2></div>'
			+'</form>');
});

$('#cate_list').attr('style','cursor:pointer').click(function(){
	$('#cate_side_menu >li').attr('style','background-color:white');
	$('#cate_list').attr('style','background-color:green');
  	$('#content').html('<table class="table table-hover">'
      +'      <thead>'
      +'        <tr>'
      +'        <th>No.</th>'
      +'      <th>카테고리 제목</th>'
      +'      <th>카테고리 설명</th>'
      +'        </tr>'
      +'      </thead>'
      +'      <tbody>'
      +'       <c:forEach items="${list}" var="category" varStatus="status">'
      +'       <tr>'
      +'        <td>${category.categoryId}</td>'
      +'        <td>${category.categoryName}</td>'
      +'        <td>${category.description}</td>'
      +'      </tr>'
      +'    </c:forEach>'
      +'      </tbody>'
      +'    </table> ');
});
$('#cate_delete').attr('style','cursor:pointer').click(function(){
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_delete').attr('style','background-color: green');
	$('#content').html(' <form id="form">'
			+'  <label for="email">삭제할 카테고리 </label> <br />'
			+'  <input type="checkbox" name="vehicle1" value="Bike"> 스마트폰 <br>'
			+'  <input type="checkbox" name="vehicle2" value="Car"> 데스크탑 <br>'
			+'  <input type="checkbox" name="vehicle3" value="Boat" checked> 노트북 <br><br>'
			+'  <input type="submit" value="Submit">'
			+'</form>');
});

$('#cate_modify').attr('style','cursor:pointer').click(function(){
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_modify').attr('style','background-color: green');
	$('#content').html('<h2>카테고리 수정 </h2>'
			+'<form id="radio_form">'
			+'	<input type="radio" name="cate" value="1000"> 핸드폰<br>'
			+' 	<input type="radio" name="cate" value="1021"> 데스크탑<br>'
			+' 	<input type="radio" name="cate" value="1022"> 노트북<br>'
			+'  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">수정하기 </button>'
			+'</form>'
			+'<form id="form">'
			+'  <div class="modal fade" id="myModal" role="dialog">'
			+'    <div class="modal-dialog">'
			+'      <div class="modal-content">'
			+'        <div class="modal-header">'
			+'          <button type="button" class="close" data-dismiss="modal">&times;</button>'
			+'          <h4 class="modal-title">카테고리 수정</h4>'
			+'        </div>'
			+'        <div class="modal-body">'
			+'          <h2>카테고리 이름 </h2>	   '
			+'				<input type="text" name="categoryId" style="width:550px;"/><br />'
			+'			<h2>상세 설명</h2>						'
			+'         		<textarea class="form-control" rows="5" id="comment"></textarea>'
			+'        </div> <br />'
			+'        <div class="modal-footer">'
			+'          <button type="button" class="btn btn-default" data-dismiss="modal">수정하기</button>'
			+'        </div>'
			+'      </div>'
			+'    </div>'
			+'</form>');
});

