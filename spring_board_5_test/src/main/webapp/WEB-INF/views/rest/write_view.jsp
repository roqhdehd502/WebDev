<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Write View</title>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<script type="text/javascript">
   	$(document).ready(function(){
      $("#writeForm").submit(function(event){         
           event.preventDefault();
           var bName = $("#bName").val();
           var bTitle = $("#bTitle").val();
           var bContent = $("#bContent").val();           
           
           console.log(bName);
           console.log(bTitle);
           console.log(bContent);
           console.log($(this).attr("action"));    
           
           var form = {
                 bName: bName,
                 bTitle: bTitle,
                 bContent: bContent
           };

           $.ajax({
             type : "PUT",
             url : $(this).attr("action"),
             cache : false,
             contentType:'application/json; charset=utf-8',
             data: JSON.stringify(form),
             success: function (result) {       
               if(result == "SUCCESS"){     
                  $(location).attr('href', '${pageContext.request.contextPath}/restful/board/')                            
               }                       
             },
             error: function (e) {
                 console.log(e);
             }
         })            
       });       
   	});
	</script>	
</head>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1">
      <form id="writeForm" action="${pageContext.request.contextPath}/restful/board/write" method="post">
         <tr>
            <td>이름</td>
            <td><input type="text" id="bName" name="bName" size="50"></td>
         </tr>
         <tr>
            <td>제목</td>
            <td><input type="text" id="bTitle" name="bTitle" size="50"></td>
         </tr>
         <tr>
            <td>내용</td>
            <td><textarea cols="20" rows="10" id="bContent" name="bContent"></textarea></td>
         </tr>
         <tr>
            <td colspan="2">
	            <input type="submit" value="입력"> &nbsp;&nbsp;
	            <a href="${pageContext.request.contextPath}/restful/board">목록</a>
            </td>
         </tr>
      </form>
   </table>
</body>
</html>