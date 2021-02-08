<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Rest List</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
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
								"<td>" + "조회수" + "</td>"
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
			                    htmls += '</tr>';			                    		                   
		                	});

		                	htmls+='<tr>';
		                	htmls+='<td colspan="6"> <a href="${pageContext.request.contextPath}/restful/board/write_view">글작성</a> </td>';		                	
		                	htmls+='</tr>';		           	
					}
					$("#list-table").append(htmls);	
		        }
			});
		}
	</script>
	
	<script>
		$(document).ready(function(){
			getList();
		});
	</script>
</head>
<body>
	<table id="list-table" width="500" cellpadding="0" cellspacing="0" border="1"></table>
</body>
</html>