<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
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
<title>메인 페이지</title>
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/gh/xpressengine/xeicon@2.3.1/xeicon.min.css">
<link href="<%=request.getContextPath() %>/resources/css/common.css"
	rel="stylesheet">
<link href="<%=request.getContextPath() %>/resources/css/normalize.css"
	rel="stylesheet">
<script
	src="<%=request.getContextPath() %>/resources/js/jquery-latest.js"></script>
<style>
  .write_wrap {
    clear:both;
 	width:1200px;
 	margin:0 auto;
 	margin-top:150px;
 	margin-bottom: 150px;
 	  
    }

       
.tb {
	border-collapse: collapse;
	text-align: center;
	line-height: 1.5;
	margin: 20px 10px;
}

.tb th {
	width: 50px;
	padding: 30px;
	font-weight: bold;
	border: 1px solid #ccc;
}

input::placeholder {
	color: black;
	font-style: italic;
}

textarea::placeholder {
	color: black;
	font-style: italic;
	padding-top: 60px;
}

input {
	height: 130px;
}

.btn_group button {
	border: 1px solid skyblue;
	background-color: rgba(0, 0, 0, 0);
	color: skyblue;
	padding: 5px;
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
			<div class="write_wrap">				
					<strong>글 등록</strong>
					<form action="write.do" method="post">
						<table class="tb">
							<tr>
								<th scope="row">제목</th>
								<td><input type="text" name="title" size="106"
									placeholder="제목"></td>
							</tr>
							<tr>
								<th scope="row">작성자</th>
								<td><input type="text" name="nickname" size="106"
									placeholder="연세디에이지" readonly></td>
							</tr>
							<tr>
								<th scope="row">내용</th>
								<td><textarea name="content" cols="100" rows="10"
										placeholder="내용"></textarea></td>
							</tr>
						</table>
						<div class="btn_group">

							<button type="submit" class="btn1">등록</button>
							<button type="reset" class="btn2">취소</button>
						</div>
					</form>
				</div>
			</div>
	
	<%@ include file="../include/footer.jsp"%>
</body>
</html>