/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-06-20 13:50:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/board/../include/header.jsp", Long.valueOf(1655665128742L));
    _jspx_dependants.put("/WEB-INF/views/board/../include/footer.jsp", Long.valueOf(1655657033764L));
    _jspx_dependants.put("jar:file:/D:/gyujin/jsp2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/web04/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1655135212964L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!-- 검색(메타) 정보 -->\r\n");
      out.write("    <meta name=\"url\" content=\"http://test.com\">\r\n");
      out.write("    <meta name=\"title\" content=\"제목\">\r\n");
      out.write("    <meta name=\"description\" content=\"설명\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"키워드\">\r\n");
      out.write("    <!-- 오픈 그래프 -->\r\n");
      out.write("    <meta property=\"og:url\" content=\"http://test.com\">\r\n");
      out.write("    <meta property=\"og:title\" content=\"제목\">\r\n");
      out.write("    <meta property=\"og:description\" content=\"설명\">\r\n");
      out.write("    <meta property=\"og:image\" content=\"로고주소\">\r\n");
      out.write("	<title>메인 페이지</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/gh/xpressengine/xeicon@2.3.1/xeicon.min.css\">\r\n");
      out.write("	<link href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("	<link href=\"");
      out.print(request.getContextPath() );
      out.write("/resources/css/normalize.css\" rel=\"stylesheet\">\r\n");
      out.write("	<script src=\"");
      out.print(request.getContextPath() );
      out.write("/resources/js/jquery-latest.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("    <style>\r\n");
      out.write("        .visual {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            display: block;\r\n");
      out.write("            height: 531px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .tit_box {\r\n");
      out.write("            padding-top: 150px;\r\n");
      out.write("            font-weight: 300;\r\n");
      out.write("            color: beige;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .tit_box>h3 {\r\n");
      out.write("            font-weight: 100;\r\n");
      out.write("            padding-bottom: 25px;\r\n");
      out.write("            font-size: 60px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board {\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            width: 1440px;\r\n");
      out.write("            margin: 100px auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board .page_tit {\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            font-weight: 300;\r\n");
      out.write("            font-size: 1.5em;\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board table {\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border-spacing: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .board .txt_box {\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            margin-bottom: 50px;\r\n");
      out.write("            font-size: 1.2em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .table_top th {\r\n");
      out.write("            border-top: 2px solid #000;\r\n");
      out.write("            border-bottom: 1px solid #777;\r\n");
      out.write("            background-color: #ededed;\r\n");
      out.write("            line-height: 3em;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        td {\r\n");
      out.write("            line-height: 3em;\r\n");
      out.write("            border-bottom: 1px solid #777;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        td {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .td_subject {\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:nth-child(2n) {\r\n");
      out.write("            background-color: #ededed;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:hover td:first-child {\r\n");
      out.write("            border-left: 2px solid #253dbe;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr td:first-child {\r\n");
      out.write("            border-left: 2px solid #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:hover a {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"header_wrap\">\r\n");
      out.write("    <div class=\"header_top\">\r\n");
      out.write("        <h1>연세디에이지는 환자중심의 진료환경을 지향합니다.</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"util_menu\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("            <li><a href=\"#\">로그인</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"header_bottom\" >\r\n");
      out.write("        <div class=\"logo\"><img src=\"resources/img/logo.png\" alt=\"로고\"></div>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"#\">De:AGE ABOUT</a>\r\n");
      out.write("            <div class=\"submenu_wrap\">\r\n");
      out.write("                <div class=\"submenu\">\r\n");
      out.write("                	<li><a href=\"../menu/sub1.jsp#page1\">De:AGE about</a></li>\r\n");
      out.write("                	<li><a href=\"sub1#2\">Dr. Yoon. hyo geun</a></li>\r\n");
      out.write("                	<li><a href=\"sub1#3\">Location(Map)</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"#\">EXOSOME(CELL)</a>\r\n");
      out.write("            <div class=\"submenu_wrap\">\r\n");
      out.write("                <div class=\"submenu\">\r\n");
      out.write("                <li><a href=\"sub1#1\">CELL-UP SKIN BOOSTER</a></li>\r\n");
      out.write("                <li><a href=\"sub1#2\">LEFILLEO</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"#\">LIFTING</a>\r\n");
      out.write("            <div class=\"submenu_wrap\">\r\n");
      out.write("                <div class=\"submenu\">\r\n");
      out.write("                <li><a href=\"sub1#1\">Laser Lifting</a></li>\r\n");
      out.write("                <li><a href=\"sub1#2\">Thread Lifting</a></li>\r\n");
      out.write("                <li><a href=\"sub1#3\">Newtera Lifting</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"#\">SKIN</a>\r\n");
      out.write("            <div class=\"submenu_wrap\">\r\n");
      out.write("                <div class=\"submenu\">\r\n");
      out.write("                <li><a href=\"sub1#1\">기미·주근깨</a></li>\r\n");
      out.write("                <li><a href=\"sub1#2\">여드름·자국(홍조)</a></li>\r\n");
      out.write("                <li><a href=\"sub1#3\">여드름흉터·모공</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"#\">PETTI</a>\r\n");
      out.write("            <div class=\"submenu_wrap\">\r\n");
      out.write("                <div class=\"submenu\">\r\n");
      out.write("                <li><a href=\"sub1#1\">FILTER</a></li>\r\n");
      out.write("                <li><a href=\"sub1#2\">BOTOX</a></li>\r\n");
      out.write("                <li><a href=\"sub1#3\">Sculptra</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"#\">ANTI-AGING</a>\r\n");
      out.write("            <div class=\"submenu_wrap\">\r\n");
      out.write("                <div class=\"submenu\">\r\n");
      out.write("                <li><a href=\"sub1#1\">신호등주사</a></li>\r\n");
      out.write("                <li><a href=\"sub1#2\">Vitamins-D</a></li>\r\n");
      out.write("                <li><a href=\"sub1#3\">남성호르몬</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"#\">COMMUNITY</a>\r\n");
      out.write("            <div class=\"submenu_wrap\">\r\n");
      out.write("                <div class=\"submenu\">\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/list.do\">Event·Notice</a></li>\r\n");
      out.write("                <li><a href=\"sub1#2\">Kakaotalk</a></li>\r\n");
      out.write("                <li><a href=\"sub1#3\">Before&After</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"ct\">\r\n");
      out.write("        <div class=\"page_warp\">\r\n");
      out.write("            <div class=\"visual\" style=\"background:url(/resources/img/top_visual.jpg);\">\r\n");
      out.write("                <div class=\"tit_box\">\r\n");
      out.write("                    <h3>News</h3>\r\n");
      out.write("                    <p>연세디에이지클리닉의 진솔한 이야기와 <br>다양한 소식을 만나보세요</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"board\">\r\n");
      out.write("                <p class=\"page_tit\">News</p>\r\n");
      out.write("                <div class=\"txt_box\">\r\n");
      out.write("                    연세디에이지 News게시판 입니다.<br>\r\n");
      out.write("                    수 많은 유명언론에 소개된 연세디에이지클리닉을 확인하실 수 있습니다.\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table_warp\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <colgroup>\r\n");
      out.write("                            <col style=\"width:10%;\">\r\n");
      out.write("                            <col>\r\n");
      out.write("                            <col style=\"width:10%;\">\r\n");
      out.write("                            <col style=\"width:10%;\">\r\n");
      out.write("                            <col style=\"width:10%;\">\r\n");
      out.write("                        </colgroup>\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr class=\"table_top\">\r\n");
      out.write("                                <th>번호</th>\r\n");
      out.write("                                <th>제목</th>\r\n");
      out.write("                                <th>글쓴이</th>\r\n");
      out.write("                                <th>조회</th>\r\n");
      out.write("                                <th>날짜</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr class=\"even\">\r\n");
      out.write("                                <td class=\"td_num2\">11</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">얼굴 동안(童顏) 만들어주는 시술에 ‘필러’ 지고 ‘에뜨레벨’ 뜬다 </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">216</td>\r\n");
      out.write("                                <td class=\"td_datetime\">03-29</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"even\">\r\n");
      out.write("                                <td class=\"td_num2\">10</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">\"기미·주근깨 치료, 맞춤치료 중요\"</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">340</td>\r\n");
      out.write("                                <td class=\"td_datetime\">03-17</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"even\">\r\n");
      out.write("                                <td class=\"td_num2\">9</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">피부볼륨, 탄력이 고민이라면?</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">593</td>\r\n");
      out.write("                                <td class=\"td_datetime\">01-27</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"\">\r\n");
      out.write("                                <td class=\"td_num2\">8</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">\"리프팅 시술 종류 다양해져…정확한 진단 중요\"</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">726</td>\r\n");
      out.write("                                <td class=\"td_datetime\">01-03</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"even\">\r\n");
      out.write("                                <td class=\"td_num2\">7</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">\"수험생 여드름 고민, 흉터까지 고려한 치료 필요\"</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">865</td>\r\n");
      out.write("                                <td class=\"td_datetime\">12-14</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"even\">\r\n");
      out.write("                                <td class=\"td_num2\">6</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">\"여름 내 지친 피부에 생기를 더해주는 레이저토닝\"</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">934</td>\r\n");
      out.write("                                <td class=\"td_datetime\">10-21</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"even\">\r\n");
      out.write("                                <td class=\"td_num2\">5</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">동안 이미지 얻으려면 피부 상태 중요</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">1016</td>\r\n");
      out.write("                                <td class=\"td_datetime\">08-25</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"even\">\r\n");
      out.write("                                <td class=\"td_num2\">4</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">여드름치료, 재발 낮추려면 전문적인 케어 중요해</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">940</td>\r\n");
      out.write("                                <td class=\"td_datetime\">07-19</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\" even\">\r\n");
      out.write("                                <td class=\"td_num2\">3</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"\">[SR건강칼럼] 여드름 치료, 근본적인 원인 해결이 중요</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">578</td>\r\n");
      out.write("                                <td class=\"td_datetime\">05-17</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\"even\">\r\n");
      out.write("                                <td class=\"td_num2\">2</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"23\">[SR건강칼럼]-동안피부완성, 레필레오 스킨 부스터로 해결</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">530</td>\r\n");
      out.write("                                <td class=\"td_datetime\">05-11</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr class=\" even\">\r\n");
      out.write("                                <td class=\"td_num2\">1</td>\r\n");
      out.write("                                <td class=\"td_subject\" style=\"padding-left:0px\">\r\n");
      out.write("                                    <div class=\"bo_tit\">\r\n");
      out.write("                                        <a href=\"22\">[조세일보]-피부·안티에이징 시술 전문 연세디에이지의원 오픈</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"td_name sv_use\"><span class=\"sv_member\">연세디에이지</span></td>\r\n");
      out.write("                                <td class=\"td_num\">512</td>\r\n");
      out.write("                                <td class=\"td_datetime\">05-11</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("    </footer>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"footer_wrap\">\r\n");
      out.write("        <div class=\"footer_top\" >\r\n");
      out.write("            <a href=\"#\" target=\"_blank\"><i class=\"xi-youtube-play xi-5x\"></i></a>\r\n");
      out.write("            <a href=\"#\" target=\"_blank\"><i class=\"xi-instagram xi-5x\"></i></a>\r\n");
      out.write("            <a href=\"#\" target=\"_blank\"><i class=\"xi-kakaotalk xi-5x\"></i></a>\r\n");
      out.write("            <a href=\"#\" target=\"_blank\"><i class=\"xi-message xi-5x\"></i></a>            \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"ft_bind\">\r\n");
      out.write("        <div class=\"footer_bottom\">\r\n");
      out.write("            <img src=\"resources/img/footer_logo.png\" alt=\"로고\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer_info\">\r\n");
      out.write("            <nav class=\"nav1\"><a href=\"#\" target=\"_blank\">개인정보정책</a></nav>\r\n");
      out.write("            <nav class=\"nav2\"><a href=\"#\" target=\"_blank\">이용약관</a></nav>\r\n");
      out.write("            <div>\r\n");
      out.write("                <span>\r\n");
      out.write("                    <strong>주소 : </strong>\r\n");
      out.write("                    	경기도 시흥시 은계번영길 9, 4F 409~411(은행동 골드웨이)\r\n");
      out.write("                </span>\r\n");
      out.write("                <span>\r\n");
      out.write("                    <strong>E-mail : </strong>\r\n");
      out.write("                    	faceartist@daum.net\r\n");
      out.write("                </span>\r\n");
      out.write("                <br>\r\n");
      out.write("                <span>\r\n");
      out.write("                    <strong>사업자등록번호 : </strong>\r\n");
      out.write("                    647-16-01380\r\n");
      out.write("                </span>\r\n");
      out.write("                <span>\r\n");
      out.write("                    <strong>대표원장 : </strong>\r\n");
      out.write("                    	윤효근\r\n");
      out.write("                </span>\r\n");
      out.write("                <span>\r\n");
      out.write("                    <strong>의료기관명칭 : </strong>\r\n");
      out.write("                   	 연세디에이지의원\r\n");
      out.write("                </span>\r\n");
      out.write("                <span>\r\n");
      out.write("                    <strong>전화번호 : </strong>\r\n");
      out.write("                    	031.318.1013\r\n");
      out.write("                </span>\r\n");
      out.write("                <p>COPYRIGHT ⓒ2021 deageclinic All right Reserved</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"button\" id=\"top_btn\">\r\n");
      out.write("                <img src=\"resources/img/gotop.jpg\" alt=\"버튼\">\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/board/../include/header.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path1");
      // /WEB-INF/views/board/../include/header.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/board/../include/header.jsp(4,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
