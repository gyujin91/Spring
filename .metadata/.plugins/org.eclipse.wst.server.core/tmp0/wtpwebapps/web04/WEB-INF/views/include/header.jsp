<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<div class="header_wrap">
    <div class="header_top">
        <h1>연세디에이지는 환자중심의 진료환경을 지향합니다.</h1>
    </div>
    <div class="util_menu">
        <ul>
            <li><a href="{path1 }/member/join.do">회원가입</a></li>
            <li><a href="{path1 }/member/login.do">로그인</a></li>
        </ul>

    </div>
    <div class="header_bottom" >
        <div class="logo">
        	<a href="${path1 }/">
        		<img src="resources/img/logo.png" alt="로고">
        	</a>
        </div>
        <ul>
            <a href="#">De:AGE ABOUT</a>
            <div class="submenu_wrap">
                <div class="submenu">
                	<li><a href="../menu/sub1.jsp#page1">De:AGE about</a></li>
                	<li><a href="sub1#2">Dr. Yoon. hyo geun</a></li>
                	<li><a href="sub1#3">Location(Map)</a></li>
                </div>
            </div>
        </ul>
        <ul>
            <a href="#">EXOSOME(CELL)</a>
            <div class="submenu_wrap">
                <div class="submenu">
                <li><a href="sub1#1">CELL-UP SKIN BOOSTER</a></li>
                <li><a href="sub1#2">LEFILLEO</a></li>
                </div>
            </div>
        </ul>
        <ul>
            <a href="#">LIFTING</a>
            <div class="submenu_wrap">
                <div class="submenu">
                <li><a href="sub1#1">Laser Lifting</a></li>
                <li><a href="sub1#2">Thread Lifting</a></li>
                <li><a href="sub1#3">Newtera Lifting</a></li>
                </div>
            </div>
        </ul>
        <ul>
            <a href="#">SKIN</a>
            <div class="submenu_wrap">
                <div class="submenu">
                <li><a href="sub1#1">기미·주근깨</a></li>
                <li><a href="sub1#2">여드름·자국(홍조)</a></li>
                <li><a href="sub1#3">여드름흉터·모공</a></li>
                </div>
            </div>
        </ul>
        <ul>
            <a href="#">PETTI</a>
            <div class="submenu_wrap">
                <div class="submenu">
                <li><a href="sub1#1">FILTER</a></li>
                <li><a href="sub1#2">BOTOX</a></li>
                <li><a href="sub1#3">Sculptra</a></li>
                </div>
            </div>
        </ul>
        <ul>
            <a href="#">ANTI-AGING</a>
            <div class="submenu_wrap">
                <div class="submenu">
                <li><a href="sub1#1">신호등주사</a></li>
                <li><a href="sub1#2">Vitamins-D</a></li>
                <li><a href="sub1#3">남성호르몬</a></li>
                </div>
            </div>
        </ul>
        <ul>
            <a href="#">COMMUNITY</a>
            <div class="submenu_wrap">
                <div class="submenu">
                <li><a href="${path1 }/board/list.do">Event·Notice</a></li>
                <li><a href="sub1#2">Kakaotalk</a></li>
                <li><a href="sub1#3">Before&After</a></li>
                </div>
            </div>
        </ul>
    </div>
</div>