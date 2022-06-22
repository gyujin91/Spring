<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	<title>자료 등록</title>
	<link rel="stylesheet" href="//cdn.jsdelivr.net/gh/xpressengine/xeicon@2.3.1/xeicon.min.css">
	<link href="<%=request.getContextPath() %>/resources/css/common.css" rel="stylesheet">
	<link href="<%=request.getContextPath() %>/resources/css/normalize.css" rel="stylesheet">
	<script src="<%=request.getContextPath() %>/resources/js/jquery-latest.js"></script>
</head>
<body>
<div class="ct">
<%@ include file="../include/header.jsp" %>
<article id="con" class="content">
	<h2 class="page_tit">자료 등록</h2>
	<form action="${path1 }/databank/insert.do" method="post" name="databankUpload">
	<div class="table_form_wrap">
		<table class="table_form">
			<tbody>
				<tr>
					<th><label for="title">제목</label></th>
					<td><input type="text" name="title" id="dtitle" size="100" class="single100" placeholder="글제목 입력" required></td>
				</tr>
				<tr>
					<th><label for="content">내용</label></th>
					<td><textarea name="content" id="dcontent" cols="100" rows="8" class="multi100" placeholder="글 내용 입력" required></textarea></td>
				</tr>
				<tr>
					<th><label for="dposter">파일 형식</label></th>
					<td><input type="text" name="dposter" id="dposter" size="40" class="single100" value="" readonly>
							<input type="image" name="dposter2" id="proData2" />
					</td>
				</tr>
				<tr>
					<th><label for="dfilename">업로드 파일</label></th>
					<td><input type="text" name="dfilename" id="dfilename" size="40" class="single100" value="" readonly>
							<button class="btn btn-primary" onclick="uploadFile()">자료 업로드 하기</button>
							<img src="" id="proData" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" class="btn btn-writer" value="자료 등록">
						<input type="reset" class="btn btn-primary" value="취소">
					</td>
				</tr>	
			</tbody>
		</table>
	</div>
	</form>
	<script>
	function uploadFile() {
		window.open("${path1 }/databank/uploadForm.do", "dataupload", "width=400, height=300");
	}
	</script>
</article>
<%@ include file="../include/footer.jsp" %>
</div>
</body>
</html>