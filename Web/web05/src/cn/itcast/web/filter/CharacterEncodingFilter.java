package cn.itcast.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    private String encoding;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException { ;
        req.setCharacterEncoding(encoding);
        resp.setContentType("text/html;charset="+encoding);
        chain.doFilter(req, resp);
    }
    //启动tomcat时就执行init方法
    public void init(FilterConfig config) throws ServletException {
        encoding = config.getInitParameter("encoding");
        System.out.println(encoding);

    }

}
