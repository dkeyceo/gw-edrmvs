package com.dkey.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterCharset", urlPatterns = { "/*" })
public class FilterCharset implements Filter {
    private FilterConfig _filterConfig = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        _filterConfig = filterConfig;
    }

    public void destroy() {
        _filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        request.setCharacterEncoding("UTF8");
        response.setCharacterEncoding("UTF8");
        chain.doFilter(request, response);
    }
}
