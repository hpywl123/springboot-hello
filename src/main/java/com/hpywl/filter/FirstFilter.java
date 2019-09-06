package com.hpywl.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.LogRecord;

public class FirstFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化FirstFilter。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FirstFilter过滤器执行中。。。");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("摧毁FirstFilter");
    }
}
