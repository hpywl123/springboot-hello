package com.hpywl;

import com.hpywl.filter.FirstFilter;
import com.hpywl.filter.SecondFilter;
import com.hpywl.listener.FirstListener;
import com.hpywl.listener.SecondListener;
import com.hpywl.servlet.FirstServlet;
import com.hpywl.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringbootHelloApplication {
    /*
    项目启动后首先执行监听器（Listener）初始化，然后是过滤器（Filter）初始化。
    */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloApplication.class, args);
    }

    /**
     * 注册Servlet类
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean getFirstServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new FirstServlet());
        bean.addUrlMappings("/first");  //servlet的调用方法
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "ywl");
        map.put("age", "12");
        //设置传递到servlet的参数
        bean.setInitParameters(map);
        return bean;
    }

    /**
     * 注册Servlet类
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean getSecondServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");  //servlet的调用方法
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Jack");
        map.put("age", "44");
        //设置传递到servlet的参数
        bean.setInitParameters(map);
        return bean;
    }

    /**
     * 注册Filter过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean getFirstFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new FirstFilter());
        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/first"); //过滤first方法
        return bean;
    }

    /**
     * 注册Filter过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean getSecondFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/second"); //过滤second方法
        return bean;
    }

    /**
     * 注册Listener监听器
     *
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean getFistListener() {
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new FirstListener());
        return bean;
    }

    /**
     * 注册Listener监听器
     *
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean getSecondListener() {
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }
}
