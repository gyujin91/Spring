<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="ko">

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
   
    <style>
        .visual {
            width: 100%;
            display: block;
            height: 531px;
        }

        .tit_box {
            padding-top: 150px;
            font-weight: 300;
            color: beige;
            text-align: center;
            margin: 0 auto;
            font-size: 20px;
        }

        .tit_box>h3 {
            font-weight: 100;
            padding-bottom: 25px;
            font-size: 60px;
        }

        .board {
            text-align: left;
            width: 1440px;
            margin: 100px auto;
        }

        .board .page_tit {
            margin-top: 50px;
            font-weight: 300;
            font-size: 1.5em;
            text-decoration: underline;
        }

        .board table {
            margin: 0 auto;
            width: 100%;
            border-spacing: 0;
        }

        .board .txt_box {
            margin-top: 50px;
            margin-bottom: 50px;
            font-size: 1.2em;
        }

        .table_top th {
            border-top: 2px solid #000;
            border-bottom: 1px solid #777;
            background-color: #ededed;
            line-height: 3em;
            font-size: 20px;
            text-align: center;
        }

        td {
            line-height: 3em;
            border-bottom: 1px solid #777;
        }

        td {
            text-align: center;

        }

        .td_subject {
            text-align: left;
        }

        tr:nth-child(2n) {
            background-color: #ededed;
        }

        tr:hover td:first-child {
            border-left: 2px solid #253dbe;
        }

        tr td:first-child {
            border-left: 2px solid #fff;
        }

        tr:hover a {
            text-decoration: underline;
        }
    </style>
</head>

<body>
    <%@ include file="../include/header.jsp" %>

    <div id="ct">
        <div class="page_wrap">
            <div class="visual" style="background:url(/resources/img/top_visual.jpg);">
                <div class="tit_box">
                    <h3>News</h3>
                    <p>연세디에이지클리닉의 진솔한 이야기와 <br>다양한 소식을 만나보세요</p>
                </div>
            </div>
            <div class="board">
                <p class="page_tit">News</p>
                <div class="txt_box">
                    연세디에이지 News게시판 입니다.<br>
                    수 많은 유명언론에 소개된 연세디에이지클리닉을 확인하실 수 있습니다.
                </div>
                <div class="table_warp">
                    <table>
                        <colgroup>
                            <col style="width:10%;">
                            <col>
                            <col style="width:10%;">
                            <col style="width:10%;">
                            <col style="width:10%;">
                        </colgroup>
                        <thead>
                            <tr class="table_top">
                                <th>번호</th>
                                <th>제목</th>
                                <th>글쓴이</th>
                                <th>조회</th>
                                <th>날짜</th>
                            </tr>
                        </thead>
                        <tbody>
                        	<c:forEach items="${boardList }" var="board">
                        		<tr class="even">
                        			 <td class="td_num2">${board.seq }</td>
                                	<td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="${path1 }/board/read.do?seq=${board.seq }">${board.title } </a>
                                    </div>
                                	</td>
                               	 	<td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                	<td class="td_num">${board.visited }</td>
                                	<fmt:formatDate value="${board.regdate }" pattern="YYYY년 M월 dd일" var="regdate" />
                                	<td class="td_datetime">${regdate }</td>               
                        		</tr>
                        	</c:forEach>                        
                            <tr>                          
                            	<td>
                            		<a href="${path1 }/board/writeForm.do">글 등록</a>
                            	</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                
                
                          
            </div>
        </div>
    </div>

    <footer id="footer">
    </footer>
<%@ include file="../include/footer.jsp" %>
</body>
</html>