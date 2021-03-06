package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class FindFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String s = request.getRequestURL().toString().toLowerCase();
        if (s.contains("css") || s.contains("fonts") || s.contains("login")) {
            chain.doFilter(req, resp);
        } else {
            if (request.getSession().getAttribute("userInfo") != null) {
                chain.doFilter(req, resp);
            }else{
                response.sendRedirect(request.getContextPath() + "/login.jsp");
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
