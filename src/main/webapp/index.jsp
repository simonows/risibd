<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta lang="ru"/>
  <title>Авиакасса</title>
  <link href="css/base.css" rel="stylesheet" type="text/css"/>
  <link href="css/news.css" rel="stylesheet" type="text/css"/>
  <script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="js/list.js"></script>
</head>
<body>
  <header>
    <div id="logo" class="noselect">
      <span class="second-ch">S</span>8
    </div>
    <div class="signup">
      <c:set var="usert1" value="${sessionScope.name}"/>
      <c:if test="${empty usert1}">
        <a href="regauth">Войти/Зарегистрироваться</a>
      </c:if>
      <c:if test="${!empty usert1}">
        <a href="cabinet">${usert1}</a>
      </c:if>
    </div>
  </header>
  <div class="body-container">
    <nav class="menu">
      <div class="menu-elem noselect">Прилет</div>
      <div class="menu-elem noselect">Вылет</div>
      <div class="menu-elem noselect"><a href="https://shtudy.org/news">Новости</a></div>
      <div class="menu-elem noselect">Акции</div>
      <div class="menu-elem noselect">Правила</div>
      <div class="menu-elem noselect">Отмена рейсов</div>
    </nav>
    <div class="body">
        <div class="col-lg-9 main-part">
        <table class="table">
          <thead>
            <tr>
              <th>Список федеральных округов РФ</th>
            </tr>
          </thead>
          <tbody>
              <tr class="table-success">
                <td><a href="shtudy.org">Приволжский</a></td>
              </tr>
              <tr class="table-success">
                <td>Северо-Западный</td>
              </tr>
              <tr class="table-success">
                <td>Сибирский</td>
              </tr>
              <tr class="table-success">
                <td>Уральский</td>
              </tr>
              <tr class="table-success">
                <td>Центральный</td>
              </tr>
              <tr class="table-success">
                <td>Южный</td>
              </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
  <footer>
    <div class="footer-column">
      <div class="footer-elem">Помощь</div>
      <div class="footer-elem">Предложения</div>
      <div class="footer-elem">Вакансии</div>
      <div class="footer-elem">Новости</div>
    </div>
    <div class="footer-column">
      <div class="footer-elem">Помощь</div>
      <div class="footer-elem">Помощь</div>
      <div class="footer-elem">Помощь</div>
      <div class="footer-elem">Помощь</div>
    </div>
    <div class="footer-column">
      <div class="footer-elem">Помощь</div>
      <div class="footer-elem">Помощь</div>
      <div class="footer-elem">Помощь</div>
      <div class="footer-elem">Помощь</div>
    </div>
  </footer>
</body>
</html>
