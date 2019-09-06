package com.hpywl.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("初始化FirstListener init.....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("销毁FirstListener destroy.....");
    }
}
