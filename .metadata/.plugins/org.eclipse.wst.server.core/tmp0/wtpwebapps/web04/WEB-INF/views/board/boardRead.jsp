<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<link rel="stylesheet" href="//cdn.jsdelivr.net/gh/xpressengine/xeicon@2.3.1/xeicon.min.css">
	<link href="<%=request.getContextPath() %>/resources/css/common.css" rel="stylesheet">
	<link href="<%=request.getContextPath() %>/resources/css/normalize.css" rel="stylesheet">
	<script src="<%=request.getContextPath() %>/resources/js/jquery-latest.js"></script>
</head>
<body>
<%@ include file="../include/header.jsp" %>
<div id="ct">
	<div class="table_warp">
    	<table class="tb">
    			<tr>
    				<th>제목</th>
    			</tr>
    			<tr>
    				<td>${boardList.title }</td>
    			</tr>
    			<tr>
    				<th>작성자</th>
    				<td>${boardList.nickname }</td>
    			</tr>
    			<tr>
    				<th>내용</th>
    			</tr>
    			<tr>
    				<td>${boardList.content }</td>
    			</tr>
    			<tr>
    				<th>작성일</th>
    				<td>${boardList.regdate }</td>
    			</tr>
    			<tr>
    				<th>조회수</th>
    				<td>${boardList.visited }</td>
    			</tr>
    			
    		
    	</table>                                                    		
	</div>
</div>

<%@ include file="../include/footer.jsp" %>
</body>
</html>