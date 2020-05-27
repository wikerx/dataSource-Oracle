package com.scott.ds.service;

import com.scott.ds.entity.User;

import java.util.List;

public interface TUService {

    public List<User> selectListMaster();

    public List<User> selectListSlave1();

    public List<User> selectListSlave2();
}
