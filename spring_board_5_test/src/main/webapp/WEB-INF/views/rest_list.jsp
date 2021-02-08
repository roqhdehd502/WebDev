<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Rest List</title>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<script type="text/javascript">
	$(document).ready(function (){
		$('.a-delete').click(function(event){
			// 이벤트를 취소할 때 동작을 멈춘다.
			event.preventDefault();
			console.log("ajax 호출전");
			
			// <a>의 parent(<td>)의 parent 즉, <tr>를 지칭한다.
			/*
				어떻게 제이쿼리는 this가 <a>인 것을 알고있을까?
				: a 태그내 .a-delete 클릭 이벤트가 발생 되었으므로!
				: $('.a-delete').click(function(event)
			*/
			var trObj = $(this).parent().parent(); 
 
			$.ajax({
				// AJAX의 타입(삭제)
				type : 'DELETE',
				
				// <a>의(this) 속성(href)을 가져온다.(attr)
				url : $(this).attr("href"),
				
				// 캐시를 false 설정하여 페이지가 새로 고쳐질때
				// 데이터를 남기지 않는다(?)
				cache : false,
				
				success: function(result){
					console.log(result);
					if(result=="SUCCESS"){
						// trObj 변수를 삭제한다.(게시글 삭제)
						$(trObj).remove();
						console.log("REMOVED!")
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
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>삭제</th>
		</tr>
		
		<c:forEach items="${list}" var="dto">
        	<tr>
            	<td>${dto.bId}</td>
				<td>${dto.bName}</td>
				<td>
					<c:forEach begin="1" end="${dto.bIndent}">[Re]</c:forEach>
					<a href="${pageContext.request.contextPath}/restful/board/${dto.bId}">${dto.bTitle}</a></td>
				<td><fmt:formatDate value="${dto.bDate}" pattern="YYYY-MM-DD"/></td>
				<td>${dto.bHit}</td>
				<td><a class="a-delete" href="${pageContext.request.contextPath}/restful/board/${dto.bId}">삭제</a>

</td>
       	   </tr>
       </c:forEach>  
	   
	   <tr>
			<th>번호</th>
			<th>이름</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>삭제</th>
	   </tr>
	   
	   <tr>
			<td colspan="6"><a href="${pageContext.request.contextPath}/restful/write">글쓰기</a></th>
	   </tr>	
	</table>
</body>
</html>