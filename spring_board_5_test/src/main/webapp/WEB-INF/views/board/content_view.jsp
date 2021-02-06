<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
function getList() {
	var url = "${pageContext.request.contextPath}/rest/after.json";

	$.ajax({
        type: 'GET',
        url: url,
        cache : false, // 이걸 안쓰거나 true하면 수정해도 값반영이 잘안댐
        dataType: 'json',// 데이터 타입을 제이슨 꼭해야함, 다른방법도 2가지있음
        success: function(result) {
			var htmls="";
			
        	$("#list-table").html("");	

			$("<tr>" , {
				html : "<td>" + "번호" + "</td>"+  // 컬럼명들
						"<td>" + "이름" + "</td>"+
						"<td>" + "제목" + "</td>"+
						"<td>" + "날짜" + "</td>"+				
						"<td>" + "히트" + "</td>"
			}).appendTo("#list-table") // 이것을 테이블에붙임

			if(result.length < 1){
				htmls.push("등록된 댓글이 없습니다.");
			} else {
                    $(result).each(function(){			                    			                    
	                    htmls += '<tr>';
	                    htmls += '<td>'+ this.bId + '</td>';
	                    htmls += '<td>'+ this.bName + '</td>';
	                    htmls += '<td>'
	         			for(var i=0; i < this.bIndent; i++) { //for 문은 시작하는 숫자와 종료되는 숫자를 적고 증가되는 값을 적어요. i++ 은 1씩 증가 i+2 는 2씩 증가^^
	         				htmls += '-'	
	        			}
	                    htmls += '<a href="${pageContext.request.contextPath}/content_view?bId=' + this.bId + '">' + this.bTitle + '</a></td>';
		                    htmls += '<td>'+ this.bDate + '</td>'; 
	                    htmls += '<td>'+ this.bHit + '</td>';	
	                    htmls += '</tr>';			                    		                   
                	});	//each end

                	htmls+='<tr>';
                	htmls+='<td colspan="5"> <a href="${pageContext.request.contextPath}/write_view">글작성</a> </td>';		                	
                	htmls+='</tr>';               	
			}
			$("#list-table").append(htmls);
        }
	});	// Ajax end
}//end	getList()	
</script>

<script type="text/javascript">
	$(document).ready(function (){
		$('#a-delete').click(function(event){
			//prevendDefault()는 href로 연결해 주지 않고 단순히 click에 대한 처리를 하도록 해준다.
			event.preventDefault();
			console.log("ajax 호출전"); 
			 
			$.ajax({
			    type : "DELETE",
			    url : "${pageContext.request.contextPath}/rest/delete/" + "${content_view.bId}",
			    data:{"bId":"${content_view.bId}"},
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
	<table id="list-table" width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="modify" method="post">
			<input type="hidden" name="bId" value="${content_view.bId}">
			<tr>
				<td> 번호 </td>
				<td> ${content_view.bId} </td>
			</tr>
			<tr>
				<td> 히트 </td>
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
			<tr >
				<td colspan="2">
					<input type="submit" value="수정">&nbsp;&nbsp;
					<a href="list">목록보기</a>&nbsp;&nbsp;
					<a id="a-delete" href="${pageContext.request.contextPath}/rest/delete?bId=${content_view.bId}">삭제</a>&nbsp;&nbsp;
					<a href="reply_view?bId=${content_view.bId}">답변</a>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>