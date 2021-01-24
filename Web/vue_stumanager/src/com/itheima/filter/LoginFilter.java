package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
    检查登录
 */
//@WebFilter(value = {"/*"})
public class LoginFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        try{
            //1.将请求和响应对象转换为和HTTP协议相关
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;

            String requestURI = request.getRequestURI().toLowerCase();
            if(requestURI.contains("js") || requestURI.contains("css") || requestURI.contains("img") || requestURI.contains("login.html") || requestURI.contains("user") || requestURI.contains("login")){
                filterChain.doFilter(request,response);
            }else{
                //2.获取会话域对象中数据
                Object user = request.getSession().getAttribute("user");
                //3.判断用户名
                if(user == null) {
                    //重定向到登录页面
                    response.sendRedirect(request.getContextPath() + "/login.html");
                }else{
                    filterChain.doFilter(request,response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {

    }
}
