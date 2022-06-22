<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path1" value="${pageContext.request.contextPath }"/>
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
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  margin-top:100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}


.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #343a40;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #444a50;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}

.form .message a {
  color: #343a40;
  text-decoration: none;
}
.form .register-form {
  display: none;
}

 </style>
</head>
<body>
    <%@ include file="../include/header.jsp" %> 

    <div id="ct">
        <div class="loginbox">
            <div class="join-page">
          <div class="form">
            <form class="join" id="join" action="/member/join.do" method="post">
              <input type="text" placeholder="id" name="userid" id="j_id" required/>
              <button type="button" onclick="idck();">Check</button>
              <input type="password" placeholder="password" name="userpw" id="j_pw" required/>
              <input type="password" placeholder="password_ck" name="userpw2" id="j_pw2" required/>
              <input type="text" placeholder="name" name="username" id="j_name" required/>
              <!-- <input type="text" placeholder="nickname" name="j_nick" id="j_nick" required/> -->
              <input type="email" placeholder="email" name="email" id="j_email" required/> 
              <input type="tel" placeholder="tel" name="tel" id="j_tel" required/>
              <input type="text" placeholder="address" name="addr1" id="j_address" required/>
              <input type="text" placeholder="detail_address" name="addr2" id="j_address2" required/>
              <input type="text" placeholder="zip_code" name="postcode" id="postcode" onclick="findAddr()" required/>
              <input type="date" placeholder="birth" name="birth">
              <input type="number" placeholder="point" value="1" readonly>
              
              <button type="submit">join</button>
          

               <!-- <button type="button" onclick="join();">join</button>  -->
            </form>
            
            
            <script type="text/javascript">
            	
            </script>
            
            
            
            
            
            
            
            
            
            
            
            
            
           <!--  <script type="text/javascript">
    
     function findAddr() {
			  new daum.Postcode({
		            oncomplete: function(data) {
		                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

		                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
		                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
		                var addr = 'addr1'; // 주소 변수
		                var extraAddr = 'postcode'; // 참고항목 변수

		                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
		                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
		                    addr = data.roadAddress;
		                } else { // 사용자가 지번 주소를 선택했을 경우(J)
		                    addr = data.jibunAddress;
		                }

		                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
		                if(data.userSelectedType === 'R'){
		                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
		                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
		                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
		                        extraAddr += data.bname;
		                    }
		                    // 건물명이 있고, 공동주택일 경우 추가한다.
		                    if(data.buildingName !== '' && data.apartment === 'Y'){
		                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                    }
		                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
		                    if(extraAddr !== ''){
		                        extraAddr = ' (' + extraAddr + ')';
		                    }
		                    // 조합된 참고항목을 해당 필드에 넣는다.
		                   document.getElementById("postcode").value = extraAddr;
		                
		                } else {
		                	document.getElementById("postcode").value = "";
		                }

		                // 우편번호와 주소 정보를 해당 필드에 넣는다.
		                document.getElementById("postcode").value = data.zonecode;	//우편번호
		                document.getElementById("addr1").value = addr;				//주소1
		                // 커서를 상세주소 필드로 이동한다.
		                document.getElementById("adddr2").focus();					//주소2(상세주소)
		            }
		        }).open();
    } 
            
            
            function idck() {
            var xPos = (document.body.offsetWidth/2) - (300/2); // 가운데 정렬
            var yPos = (document.body.offsetHeight/2) - (200/2);
            var ck_id = document.getElementById("j_id").value;
            var href = '../IDcheckCtrl?ck_id='+ck_id
            window.open(href, "pop_name", "width=300, height=200, left="+xPos+", top="+yPos+", menubar=yes, status=yes, titlebar=yes, resizable=yes");
            }
            function join(){
            var ck1 = document.getElementById("j_id").readOnly;
            var ck2 = document.getElementById("j_pw").value;
            var ck3 = document.getElementById("j_pw2").value;
            var ck4 = document.getElementById("j_name").value;
            var ck5 = document.getElementById("j_nick").value;
            var ck6 = document.getElementById("j_tel").value;
            var ck7 = document.getElementById("j_address").value;
            var ck8 = document.getElementById("j_email").value;
            var ck9 = document.getElementById("j_cash").value;
            var ck10 = document.getElementById("j_point").value;
            var ck11 = document.getElementById("j_grade").value;
            var ck12 = document.getElementById("j_address2").value;
            if(ck1 == false){
                alert('아이디 중복검사를 해주세요');
                return;
            }if(ck2 == ""){
                alert('비밀번호를 입력해주세요');
                return;
            }if(ck3 == ""){
                alert('비밀번호 확인을 입력해주세요');
                return;
            }if(ck4 == ""){
                alert('이름을 입력해주세요');
                return;
            }if(ck5 == ""){
                alert('닉네임을 입력해주세요');
                return;
            }if(ck6 == ""){
                alert('연락처를 입력해주세요');
                return;
            }if(ck7 == ""){
                alert('주소를 입력해주세요');
                return;
            }if(ck12 == ""){
                alert('상세주소를 입력해주세요');
                return;
            }if(ck8 == ""){
                alert('이메일을 입력해주세요');
                return;
            }if(ck2 != ck3){
                alert('비밀번호 확인이 틀립니다.');
                return;
            }if(ck9 == ""){
                alert('운영자님 빈칸이 있어요');
                return;
            }if(ck10 == ""){
                alert('운영자님 빈칸이 있어요');
                return;
            }if(ck11 == ""){
                alert('운영자님 빈칸이 있어요');
                return;
            }
            
            
                document.getElementById("join").submit();
            }
                
                  </script> -->
            
           
            
          
          </div>
        </div>
        </div>
    </div>

    <footer id="footer">
    </footer>

   <%@ include file="../include/footer.jsp" %>     
</body>
</html>