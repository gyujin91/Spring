<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<title>메인 페이지</title>
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
        <div class="page_warp">
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
                            <tr class="even">
                                <td class="td_num2">11</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">얼굴 동안(童顏) 만들어주는 시술에 ‘필러’ 지고 ‘에뜨레벨’ 뜬다 </a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">216</td>
                                <td class="td_datetime">03-29</td>
                            </tr>

                            <tr class="even">
                                <td class="td_num2">10</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">"기미·주근깨 치료, 맞춤치료 중요"</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">340</td>
                                <td class="td_datetime">03-17</td>
                            </tr>

                            <tr class="even">
                                <td class="td_num2">9</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">피부볼륨, 탄력이 고민이라면?</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">593</td>
                                <td class="td_datetime">01-27</td>
                            </tr>

                            <tr class="">
                                <td class="td_num2">8</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">"리프팅 시술 종류 다양해져…정확한 진단 중요"</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">726</td>
                                <td class="td_datetime">01-03</td>
                            </tr>

                            <tr class="even">
                                <td class="td_num2">7</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">"수험생 여드름 고민, 흉터까지 고려한 치료 필요"</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">865</td>
                                <td class="td_datetime">12-14</td>
                            </tr>

                            <tr class="even">
                                <td class="td_num2">6</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">"여름 내 지친 피부에 생기를 더해주는 레이저토닝"</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">934</td>
                                <td class="td_datetime">10-21</td>
                            </tr>

                            <tr class="even">
                                <td class="td_num2">5</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">동안 이미지 얻으려면 피부 상태 중요</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">1016</td>
                                <td class="td_datetime">08-25</td>
                            </tr>

                            <tr class="even">
                                <td class="td_num2">4</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">여드름치료, 재발 낮추려면 전문적인 케어 중요해</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">940</td>
                                <td class="td_datetime">07-19</td>
                            </tr>

                            <tr class=" even">
                                <td class="td_num2">3</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="">[SR건강칼럼] 여드름 치료, 근본적인 원인 해결이 중요</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">578</td>
                                <td class="td_datetime">05-17</td>
                            </tr>

                            <tr class="even">
                                <td class="td_num2">2</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="23">[SR건강칼럼]-동안피부완성, 레필레오 스킨 부스터로 해결</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">530</td>
                                <td class="td_datetime">05-11</td>
                            </tr>

                            <tr class=" even">
                                <td class="td_num2">1</td>
                                <td class="td_subject" style="padding-left:0px">
                                    <div class="bo_tit">
                                        <a href="22">[조세일보]-피부·안티에이징 시술 전문 연세디에이지의원 오픈</a>
                                    </div>
                                </td>
                                <td class="td_name sv_use"><span class="sv_member">연세디에이지</span></td>
                                <td class="td_num">512</td>
                                <td class="td_datetime">05-11</td>
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