package com.itheima.manager.Factory;

import com.itheima.manager.controller.ImpController;
import com.itheima.manager.controller.IntController;
import com.itheima.manager.dao.ImpDao;
import com.itheima.manager.dao.IntDao;
import com.itheima.manager.service.ImpService;
import com.itheima.manager.service.IntService;

public class StudentFactory {
    public static IntController getController() {
        return new ImpController();
    }

    public static IntService getService() {
        return new ImpService();
    }

    public static IntDao getDao() {
        return new ImpDao();
    }
}
