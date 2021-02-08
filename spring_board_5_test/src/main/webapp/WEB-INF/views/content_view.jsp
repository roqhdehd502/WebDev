<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Content View</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
function getList() {
	var url = "${pageContext.request.contextPath}/rest/after.json";

	$.ajax({
        type: 'GET',
        url: url,
        cache : false,
        dataType: 'json',
        success: function(result) {
			var htmls="";
			
        	$("#list-table").html("");	

			$("<tr>" , {
				 html : "<td>" + "번호" + "</td>"+
						"<td>" + "이름" + "</td>"+
						"<td>" + "제목" + "</td>"+
						"<td>" + "날짜" + "</td>"+				
						"<td>" + "조회수" + "</td>"+
						"<td>" + "삭제" + "</td>"
			}).appendTo("#list-table")

			if(result.length < 1){
				htmls.push("등록된 댓글이 없습니다.");
			} else {
                    $(result).each(function(){			                    			                    
	                    htmls += '<tr>';
	                    htmls += '<td>'+ this.bId + '</td>';
	                    htmls += '<td>'+ this.bName + '</td>';
	                    htmls += '<td>'
	         			for(var i=0; i < this.bIndent; i++) {
	         				htmls += '-'	
	        			}
	                    htmls += '<a href="${pageContext.request.contextPath}/restful/board/' + this.bId + '">' + this.bTitle + '</a></td>';
		                htmls += '<td>'+ this.bDate + '</td>'; 
	                    htmls += '<td>'+ this.bHit + '</td>';
	                    htmls += '<td><a id="a-delete" href="${pageContext.request.contextPath}/restful/board/' + this.bId + '"  >삭제</a></td>'; //href="${pageContext.request.contextPath}/restful/board/' + this.bId + '"             
	                    htmls += '</tr>';			                    		                   
                	});

                	htmls+='<tr>';
                	htmls+='<td colspan="6"> <a href="${pageContext.request.contextPath}/write_view">글작성</a> </td>';		                	
                	htmls+='</tr>';               	
			}
			$("#list-table").append(htmls);
        }
	});
}
</script>

<script type="text/javascript">
	$(document).ready(function (){
		
		$('.a-delete').click(function(event){
			event.preventDefault();
			console.log("ajax 호출전"); 
			 
			$.ajax({
			    type : "DELETE",
			    url : "${pageContext.request.contextPath}/restful/board/" + "${content_view.bId}", //
			    //data:{"bId":"${content_view.bId}"},
			    success: function (result) {       
			           console.log(result); 
			           getList();               
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
	<form action="modify" method="post">
		<table id="list-table" width="500" cellpadding="0" cellspacing="0" border="1">	
			<input type="hidden" name="bId" value="${content_view.bId}">
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
				<td> <input type="text" name="bName" value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea rows="10" name="bContent" >${content_view.bContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">&nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/restful/board">목록보기</a>&nbsp;&nbsp;
					<button class="a-delete">삭제</button>&nbsp;&nbsp;
					<!--<a class="a-delete" href="${pageContext.request.contextPath}/restful/board/${content_view.bId}" >삭제</a>&nbsp;&nbsp;   -->
					<a href="${pageContext.request.contextPath}/restful/board/reply_view/${content_view.bId}">답변</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>