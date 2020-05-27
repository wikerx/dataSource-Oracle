package com.scott.ds.mapper;

import com.scott.ds.annotation.DataSource;
import com.scott.ds.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
@DataSource
public interface TUserMapper {

//    默认使用主数据源
    @Select("SELECT * FROM T_USER")
    public List<User> selectListMaster();

//    数据源1
    @DataSource("slave1")
    @Select("SELECT * FROM T_USER")
    public List<User> selectListSlave1();

//    数据源2
    @DataSource("slave2")
    @Select("SELECT * FROM T_USER")
    public List<User> selectListSlave2();

}
