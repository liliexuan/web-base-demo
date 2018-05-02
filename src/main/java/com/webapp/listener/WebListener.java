package com.webapp.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author Min
 * @Description:
 * @ClassName: com.webapp.com.webapp.listener.WebListener
 * @Date 11:01 - 2018/5/2.
 */
public class WebListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.debug("contextInitialized method ...");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.debug("contextDestroyed method ...");
    }
}
