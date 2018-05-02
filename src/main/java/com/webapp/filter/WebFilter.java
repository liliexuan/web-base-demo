package com.webapp.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author Min
 * @Description:
 * @ClassName: com.webapp.WebFilter
 * @Date 10:10 - 2018/5/2.
 */
public class WebFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.debug("init method ...");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        LOGGER.debug("destroy method ...");
    }
}
