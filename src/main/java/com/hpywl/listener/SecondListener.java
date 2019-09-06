package com.hpywl.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SecondListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("初始化SecondListener....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("销毁SecondListener.....");
    }
}
