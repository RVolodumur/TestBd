<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp"%>
<body>
    <aside class="modalReg" id="modalReg">
        <header>
            <h2>Регістрація</h2>
        </header>
        <section>
            <div class="saveUser">
                <sf:form modelAttribute="user" action="/user/saveUser" method="post">
                    Ім'я
                    <br>
                    <sf:input path="userName"/>
                    <br>
                    Номер телефону
                    <br>
                    <sf:input path="phone"/>
                    <br>
                    Email
                    <br>
                    <sf:input type="email" path="email"/>
                    <br>
                    Пароль
                    <br>
                    <sf:input type="password"  path="password"/>
                    <br>
                    <input type="submit" value="Зберегти">
                </sf:form>
            </div>
        </section>
        <footer class="footer">
            <a href="#" class="btn">Закрити</a>
        </footer>
    </aside>
    <aside class="modalLog" id="modalLog">
        <header>
            <h2>Вхід</h2>
        </header>
        <section>
            <div class="userLog">
                <form action="user/login" method="post">
                    <input type="text" name="userName">
                    <input type="password" name="password">
                    <input type="submit">
                </form>
            </div>

        </section>
        <footer class="footer">
            <a href="#" class="btn">Закрити</a>
        </footer>
    </aside>
    <a href="#modalLog"><i class="fa fa-sign-in fa-3x" aria-hidden="true"></i></a>
    <a href="#modalReg"><i class="fa fa-user-plus fa-3x" aria-hidden="true"></i></a>
    <br>
    <a href="admin">Адміністративна сторінка</a>
    <br>
    <a href="AllCategories">Категорії продуктів </a>
<br>

</body>
</html>
