package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest requset = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String s = requset.getRequestURL().toString().toLowerCase();
        if(s.contains("css") || s.contains("index") ||s.contains("fonts")||s.contains("login")){
            chain.doFilter(requset, response);
        }else{
            if(requset.getSession().getAttribute("userInfo")!=null){
                chain.doFilter(requset, response);
            }else{
                response.sendRedirect(requset.getContextPath()+"/index.jsp");
            }
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
