package com.example.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class DemoServlet implements Servlet
{
    ServletConfig config = null;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("servlet初始化完成！");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        servletResponse.setCharacterEncoding("utf-8");
        PrintWriter pwriter = servletResponse.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("<h1>奇客谷教程Servlet接口例子</h1>");
        pwriter.print("</body>");
        pwriter.print("</html>");
    }

    @Override
    public String getServletInfo() {
        return "奇客谷教程Servlet接口例子";
    }

    @Override
    public void destroy() {
        System.out.println("servlet结束！");
    }
}
