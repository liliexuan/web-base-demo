package com.webapp.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @Author Min
 * @Description:
 * @ClassName: com.webapp.servlet.WebServlet
 * @Date 11:00 - 2018/5/2.
 */
public class WebServlet extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {
        LOGGER.debug("init metthod ...");

    }



    @Override
    public void destroy() {
        LOGGER.debug("destroy metthod ...");
    }
}
