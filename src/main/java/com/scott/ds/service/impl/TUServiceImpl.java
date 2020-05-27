package com.scott.ds.service.impl;

import com.scott.ds.entity.User;
import com.scott.ds.mapper.TUserMapper;
import com.scott.ds.service.TUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUServiceImpl implements TUService {
    @Autowired
    private TUserMapper userMapper;

    public List<User> selectListMaster(){
        return userMapper.selectListMaster();
    }

    public List<User> selectListSlave1(){
        return userMapper.selectListSlave1();
    }

    public List<User> selectListSlave2(){
        return userMapper.selectListSlave2();
    }




}
