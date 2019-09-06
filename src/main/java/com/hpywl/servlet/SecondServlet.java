package com.hpywl.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
<servlet>
    <servlet-name>firstName</servlet-name>
    <servlet-class>com.hpywl.servlet.FirstServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>firstName</servlet-name>
    <url-pattern>/first</url-pattern>
</servlet-mapping>
 */

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Second Servlet加载中。。。");
        String name = getServletConfig().getInitParameter("name");
        String age = getServletConfig().getInitParameter("age");
        System.out.println("传递过来的参数name:"+name+",age:"+age);
    }
}
