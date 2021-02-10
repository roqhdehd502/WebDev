<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Content View</title>
	
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
</head>
<body>
   <table width="500" cellpadding="0" cellspacing="0" border="1">
      <form id="updateForm" action="${pageContext.request.contextPath}/restful/board/${content_view.bId}" method="post">
         <input type="hidden" id="bId" value="${content_view.bId}">
         <tr>
            <td> 번호 </td>
            <td> ${content_view.bId} </td>
         </tr>
         <tr>
            <td> 조회수 </td>
            <td> ${content_view.bHit} </td>
         </tr>
         <tr>
            <td> 이름 </td>
            <td> <input type="text" id="bName" value="${content_view.bName}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input type="text" id="bTitle" value="${content_view.bTitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea rows="10" id="bContent" >${content_view.bContent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2">
	            <input type="submit" value="수정">&nbsp;&nbsp;
	            <a href="${pageContext.request.contextPath}/restful/board">목록보기</a>&nbsp;&nbsp;
	            <a href="#">삭제</a>&nbsp;&nbsp;
	            <a href="${pageContext.request.contextPath}/restful/board/reply/${content_view.bId}">답변</a>
            </td>
         </tr>
      </form>
   </table>
</body>
</html>