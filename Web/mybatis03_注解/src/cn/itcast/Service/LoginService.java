package cn.itcast.Service;

import cn.itcast.domain.Login;
import org.apache.ibatis.annotations.Select;

public interface LoginService {

    Login UserLogin(String username, String password)throws Exception;
}
