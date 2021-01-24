package cn.itcast.service;

import cn.itcast.domain.Login;

public interface LoginService {

    Login login(String username,String password)throws Exception;


}
