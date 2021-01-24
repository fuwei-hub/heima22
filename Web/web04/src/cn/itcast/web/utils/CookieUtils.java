package cn.itcast.web.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
    /**
     * 方法1:功能获取cookie，需要传入cookie的名字，要得到Cookie对象
     */
    public static Cookie findCookie(String cookieName, HttpServletRequest request){
        if(cookieName==null || request==null){
            return null;
        }

        //1.获取所有的cookie
        Cookie[] cookies = request.getCookies();

        //2.遍历得到一个一个的cookie对象，用cookie对象的name和cookieName比较，如果一致，直接返回。
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals(cookieName)){
                return cookie;
            }
        }

        return null;
    }

    /**
     * 添加cookie的方法
     * 需要哪些参数 response,name,value,maxage,path,cn.itcase.domain
     * 返回 新创建好的cookie对象
     */
    public static Cookie addCookie(HttpServletResponse response,String cookieName,String cookieValue,int maxAge,String path,String domain){
        //创建cookie
        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setDomain(domain);
        cookie.setPath(path);
        cookie.setMaxAge(maxAge);

        //添加到浏览器
        response.addCookie(cookie);

        return cookie;
    }

    /**删除cookie*/
    public static void deleteCookie(String name,HttpServletResponse response){
        Cookie cookie = new Cookie(name, "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

}
