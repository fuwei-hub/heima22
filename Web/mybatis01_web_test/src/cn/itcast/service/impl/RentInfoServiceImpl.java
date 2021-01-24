package cn.itcast.service.impl;

import cn.itcast.dao.RentInfoDao;
import cn.itcast.dao.impl.RentInfoDaoImpl;
import cn.itcast.domain.Host;
import cn.itcast.service.RentInfoService;

import java.util.List;

public class RentInfoServiceImpl implements RentInfoService {
    private RentInfoDao rentInfoDao=new RentInfoDaoImpl();
    @Override
    public List<Host> findAll() throws Exception {
        return rentInfoDao.findAll();
    }
}
