<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MY REST BOARD: CONTENT</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<script type="text/javascript">
   	$(document).ready(function(){
      $("#updateForm").submit(function(event){         
           event.preventDefault();     
           var bId = $("#bId").val();
           var bName = $("#bName").val();
           var bTitle = $("#bTitle").val();
           var bContent = $("#bContent").val();              
           
           console.log(bName);
           console.log(bTitle);
           console.log(bContent);
           console.log($(this).attr("action"));    
           
           var form = {
                 bId: bId,
                 bName: bName,
                 bContent: bContent,
                 bTitle: bTitle
           };

           $.ajax({
             type : "PUT",
             url : $(this).attr("action"),
             cache : false,
             contentType:'application/json; charset=utf-8', // 인코딩 데이터 변환
             data: JSON.stringify(form), // 보안 문제 해결을 위해 stringify 메소드를 사용
             success: function (result) {       
               if(result == "SUCCESS"){
                  // update가 완료되었으면 리스트 페이지로 이동        
                  $(location).attr('href', '${pageContext.request.contextPath}/restful/board/')                            
               }                       
             },
             error: function (e) {
                 console.log(e);
             }
         })            
       }); // end submit()       
   	}); // end ready()
	</script>
	<script type="text/javascript">
	$(document).ready(function (){
		$('#delete').click(function(event){
			event.preventDefault();
			console.log("ajax 호출전");		
			//var trObj = $(this).parent().parent(); 
 
			$.ajax({
				type : 'DELETE',
				url : $(this).attr("href"),
				cache : false,
				success: function(result){
					console.log(result);
					if(result=="SUCCESS"){
						if(result == "SUCCESS"){     
                  					$(location).attr('href', '${pageContext.request.contextPath}/restful/board/')                            
               				}  
					}
				},
				error:function(e){
					console.log(e);
				}
			})
		});	
	});	
	</script>
</head>
<body>
	<div class="jumbotron jumbotron-fluid">
  		<h1 align="center">MY BOARD</h1>
	</div>

	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
		<h1 align="center">CONTENT</h1>
	</nav>

	<form id="updateForm" action="${pageContext.request.contextPath}/restful/board/${content_view.bId}" method="post">
		<table class="table">
			<input type="hidden" id="bId" value="${content_view.bId}">
			<tr>
				<td>번호</td>
				<td>${content_view.bId}</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${content_view.bHit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" id="bName" value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" id="bTitle" value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" id="bContent">${content_view.bContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" class="btn btn-primary" value="수정">&nbsp;&nbsp;
					<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/restful/board/${content_view.bId}'" id="delete">삭제</button>&nbsp;&nbsp;
					<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/restful/board/reply/${content_view.bId}'">답변</button>&nbsp;&nbsp;
					<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/restful/board'">목록</button>
				</td>
			</tr>
		</table>
	</form>

	<div align="center" class="jumbotron jumbotron-fluid">
  		<p>Copyrights&copy;All rights reserved by bootstrap.
	</div>	

</body>
</html>