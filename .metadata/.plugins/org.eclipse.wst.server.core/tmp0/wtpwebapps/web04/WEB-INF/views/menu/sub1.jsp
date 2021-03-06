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
        img {
            display: block;
        }

        .page {
            clear: both;
            min-height: 100vh;
            display: none;
            width: 100%;
        }

        ul {
            list-style: none;
        }

        .page:target {
            display: block;
        }

        .grid_warp {
            width: 1440px;
            margin: 0 auto;
        }

        .grid_box {
            display: grid;
            grid-template-columns: 50% 50%;
        }

        .img_box {
            margin-left: 40px;
        }

        .grid_box .txt_box {
            display: inline-block;
            width: 100%;
            vertical-align: top;
            font-size: 20px;
            font-weight: 300;
            line-height: 1.5em;
        }

        .page_tit {
            margin-left: 235px;
            font-size: 20px;
            font-weight: 300;
            text-decoration: underline;
            margin-bottom: 50px;
        }

        .color_blue {
            color: blue;
        }

        .list {
            width: 1600px;
            margin: 0 auto;
            display: flex;
            flex-wrap: wrap;


        }

        .list>div {
            display: inline-block;
            width: 46%;
            margin: 0 2% 0.5rem;
            vertical-align: top;
        }

        .list>div figure img {
            display: block;
            width: 100%;
        }

        .list>div .txt_box {
            margin-top: 0.35rem;
            text-align: center;
        }

        .list>div .txt_box .tit {
            color: #000;
            font-size: 30px;
            font-weight: 400;
        }

        .list>div .txt_box .txt {
            margin-top: 0.2rem;
            color: #363636;
        }

        #page2 .ct_warp>h3 {
            text-align: center;
            font-size: 60px;
            font-weight: 250;
        }

        .list1 {
            width: 1600px;
            margin: 0 auto;

        }

        .hgroup {
            text-align: center;
            font-size: 30px;
            font-weight: 300;
        }

        em {
            margin-left: 760px;
            display: flex;
            width: 35px;
            text-align: center;
            background-color: blue;
            color: #fff;
        }
    </style>
</head>

<body>
    <%@ include file="../include/header.jsp" %>
    <div id="ct">
        <div class="ct_warp">
            <section class="page" id="page1">
                <p class="page_tit">De:AGE ABOUT</p>
                <div class="tit_box">
                    <div class="grid_warp">
                        <div class="grid_box">
                            <div class="txt_box">
                                <h2>고객만족, 고객중심 <br><span class="color_blue">연세디에이지클리닉</span></h2>
                                <p>
                                    <strong>사소한 부분이라도 세심하게 주의를 기울여 높은 만족도를 드리겠습니다.</strong><br><br>
                                    연세디에이지클리닉은 고객과 하나 되는 환자 중심의 진료를 제공합니다. <br>
                                    대한민국 최고의 <span class="color_blue">안티에이징, 피부, 쁘띠 클리닉</span>으로써 끊임없이 연구하며 고객 한 분 한 분을
                                    위해 노력을 기울이고 있습니다.<br><br>

                                    연세디에이지클리닉에 오시면 그동안 잃어버렸던 미소와 만족을 되찾으실 수 있습니다. 동서고금, 나이를 막론하고 건강하고 아름다운 피부를 갖는 것은 모든
                                    이들의 소망입니다. 하지만 정보의 홍수 속에서 믿을 수 있는 시술이나 병원을 찾기란 쉽지 않은 일입니다.<br><br>

                                    연세디에이지클리닉은 믿을 수 있는 <span class="color_blue">전문의의 정밀한 진단과 처방, 10년 이상의 풍부한 경험과 노하우가
                                        더해져 만족스러운 결과</span>를 이끌어냅니다. 여러분이 꿈꾸는 건강하고 아름다운 피부를 만들어 드리겠습니다.
                                </p>
                                <p>
                                    <br>
                                    <strong>[열정]</strong> <span class="color_blue">기본과 원칙을 중시</span>하고, 정직하고 자연스러운 치료를
                                    위해 끊임없이 연구하고 배우겠습니다. <br><br>
                                    <strong>[신뢰] </strong> 내원하는 고객 한 분 한 분을 가족같이 맞이하고, 고객의 불편함에 귀를 기울여 언제나 즐거운 마음으로 편안하게
                                    찾을 수 있는 연세디에이지클리닉이 되겠습니다.<br><br>
                                    <strong>[안전] </strong>고객의 안전을 최우선으로 두어 <span class="color_blue">1:1 맞춤 처방, 빠른
                                        회복</span>을 지향합니다.
                                </p>
                            </div>
                            <div class="img_box">
                                <img src="./img/about01.jpg" alt="">
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <section class="page" id="page2">
                <div class="ct_warp" style="background-color:beige">
                    <h3><span class="color_blue">줄기세포 집중화</span>치료 병의원</h3>
                    <div class="list">
                        <div>
                            <figure>
                                <img src="./img/list1.jpg" alt="">
                            </figure>
                            <div class="txt_box">
                                <p class="tit">01.Stem Cell Center</p>
                                <p class="txt">줄기세포 치료를 선도하기 위해 줄기세포 미용 성형 분야에 집중합니다. 세계적인 줄기세포 장비와 선진 기술을 도입하여 줄기세포의 치료
                                    분야를 확대하고 있습니다.</p>
                            </div>
                        </div>
                        <div>
                            <figure>
                                <img src="./img/list2.jpg" alt="">
                            </figure>
                            <div class="txt_box">
                                <p class="tit">02.줄기세포 시설 및 연구실 구축</p>
                                <p class="txt">줄기세포 집중화 병의원으로 줄기세포 미용 성형을 위하여 다양한 줄기세포 장비와 관리실 등 체계적인 시스템을 갖추었습니다.</p>
                            </div>
                        </div>
                        <div>
                            <figure>
                                <img src="./img/list3.jpg" alt="">
                            </figure>
                            <div class="txt_box">
                                <p class="tit">03.DMT, PDRN, PRP, 스컬트라 등 1:1 맞춤시술</p>
                                <p class="txt">
                                    피부 미용 시술인 DMT, PDRN, PRP, 스컬트라, 레이저 시술까지 1:1 맞춤 시스템을 운영하고 있습니다.<br>
                                    피부과 전문의의 상담과 시술, 사후관리까지 모두 1:1로 진행되어 개인 맞춤형 서비스를 누리실 수 있습니다.
                                </p>
                            </div>
                        </div>
                        <div>
                            <figure>
                                <img src="./img/list4.jpg" alt="">
                            </figure>
                            <div class="txt_box">
                                <p class="tit">04.연세디에이지 concierge system<br> <span>[시술당일 일상생활 가능]</span></p>
                                <p class="txt">
                                    연세디에이지클리닉의 concierge system은 내원하시는 고객 한 분 한 분을 위해 상담부터 시술까지 호텔 수준의 concierge system
                                    service를 제공합니다.<br>
                                    환자분 고유의 시술실을 운영 중이며, 시술부터 회복까지 1:1 맞춤 서비스를 제공하므로 시술 당일 일상생활이 가능합니다.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <section class="page" id="page3">
                <div class="ct_warp">
                    <div class="list1">
                        <div>
                            <div class="hgroup">
                                <em>01</em>
                                <h3>트렌드를 주도하는 <span class="color_blue">연세De:AGE</span></h3>
                                <p>연세De:AGE클리닉은 최신 의료시술과 의료 장비로 고객님의 아름다움을 한층 더 높여 드립니다.</p>
                            </div>
                            <figure>
                                <img src="./img/list6.png" alt="">
                            </figure>
                        </div>
                        <div>
                            <div class="hgroup">
                                <em>02</em>
                                <h3>일회용 의료기구 사용 / <span class="color_blue">정기적인 방역</span></h3>
                                <p>고객 한 분 한 분을 위해 일회용 의료기구 사용과 정기적인 방역으로 위생관리를 시행합니다.</p>
                            </div>
                            <figure>
                                <img src="./img/list7.png" alt="">
                            </figure>
                        </div>
                        <div>
                            <div class="hgroup">
                                <em>03</em>
                                <h3><span class="color_blue">다양한 세미나</span> 강의 진행</h3>
                            </div>
                            <figure>
                                <img src="./img/list8.png" alt="">
                            </figure>
                        </div>
                    </div>
                </div>
            </section>
            <section class="page" id="page4">
                <div class="tit_box">
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <p class="sub_con">
                        내용1
                    </p>
                </div>
            </section>
            <section class="page" id="page5">
                <div class="tit_box">
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <h2 class="sub_tit">
                        제목1
                    </h2>
                    <p class="sub_con">
                        내용1
                    </p>
                </div>
            </section>
        </div>
    </div> <!-- #ct 끝 -->
    <footer id="footer">

    </footer>

    <%@ include file="../include/footer.jsp" %>
</body>

</html>