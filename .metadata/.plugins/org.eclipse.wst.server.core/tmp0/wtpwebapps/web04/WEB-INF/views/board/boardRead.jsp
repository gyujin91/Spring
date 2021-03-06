<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 검색(메타) 정보 -->
<meta name="url" content="http://test.com">
<meta name="title" content="제목">
<meta name="description" content="설명">
<meta name="keywords" content="키워드">
<!-- 오픈 그래프 -->
<meta property="og:url" content="http://test.com">
<meta property="og:title" content="제목">
<meta property="og:description" content="설명">
<meta property="og:image" content="로고주소">
<title></title>
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/gh/xpressengine/xeicon@2.3.1/xeicon.min.css">
<link href="<%=request.getContextPath() %>/resources/css/common.css"
	rel="stylesheet">
<link href="<%=request.getContextPath() %>/resources/css/normalize.css"
	rel="stylesheet">
<script
	src="<%=request.getContextPath() %>/resources/js/jquery-latest.js"></script>

<style>
.form_wrap {
	clear:both;
 	width:1440px;
 	margin:0 auto;
 	margin-top:150px;
 	margin-bottom: 150px;
 	
}

.tb {
	width: 1000px;
	border-collapse: collapse;
	border: 2px solid black;
}

th {
	text-align: center;
	border-right: 1px solid black;
	border-bottom: 1px solid black;
	border-left: 1px solid black;
}

td {
	border-bottom: 1px solid black;
}

input {
	width: 400px;
	border-top: none;
	border-bottom: none;
	border-right: none;
	border-left: none;
}

.ip1 {
	width: 900px;
}

textarea {
	width: 900px;
	border-top: none;
	border-bottom: none;
	border-right: none;
	border-left: none;
}

.btn_group button:hover {
	color: white;
	background-color: skyblue;
}

.btn1 {
	border-top-left-radius: 5px;
	border-bottom-left-radius: 5px;
	margin-right: -4px;
	font-size: 20px;
	padding: 5px 5px;
}

.btn2 {
	border-top-right-radius: 5px;
	border-bottom-right-radius: 5px;
	margin-left: -3px;
	font-size: 20px;
	padding: 5px 5px;
}
</style>
</head>
<body>
	<%@ include file="../include/header.jsp"%>
	<div id="ct">		
			<div class="form_wrap">
				<h2>게시판 상세 보기</h2>
				<form action="${path1 }/board/update.do" method="post">
					<table class="tb">
						<tr>
							<th><label for="">글 번호</label></th>
							<td><c:if test="${userid == 'admin' }">
									<input type="text" name="seq" readonly>
								</c:if> <c:if test="${userid != 'admin' }">
									<p>${board.seq }</p>
								</c:if></td>
							<th><label for="">작성자</label></th>
							<td><c:if test="${userid == 'admin' }">
									<input type="text" name="nickname" readonly>
								</c:if> <c:if test="${userid != 'admin' }">
									<p>${board.nickname }</p>
								</c:if></td>
						</tr>
						<tr>
							<th><label for="">제목</label></th>
							<td colspan="4"><c:if test="${userid == 'admin' }">
									<input type="text" name="title" class="ip1" required>
								</c:if> <c:if test="${userid != 'admin' }">
									<p>${board.title }</p>
								</c:if></td>
						</tr>
						<tr>
							<th><label for="">작성일</label></th>
							<fmt:formatDate value="${board.regdate }" pattern="YYYY년M월dd일"
								var="regdate" />
							<td>${regdate }</td>
							<th><label for="">조회수</label></th>
							<td>${board.visited }</td>
						</tr>
						<tr>
							<th><label for="">내용</label></th>
							<td colspan="4"><c:if test="${userid == 'admin' }">
									<textarea name="content" id="" cols="100" rows="10"></textarea>
								</c:if> <c:if test="${userid != 'admin' }">
									<p>${board.content }</p>
								</c:if></td>
						</tr>
					</table>
					<div class="btn_group">
						<c:if test="${userid == 'admin' }">
							<button type="submit" class="btn1">수정</button>
							<button type="reset" class="btn2">취소</button>
							<a href="${path1 }/board/delete.do">
								<button type="button" class="btn2">삭제</button>
							</a>
						</c:if>
						<a href="${path1 }/board/list.do">
							<button type="button" class="btn2">목록</button>
						</a>
					</div>
				</form>
			</div>
		</div>
	


	<%@ include file="../include/footer.jsp"%>
</body>
</html>