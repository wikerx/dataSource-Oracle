package com.scott.ds.controller;

import com.scott.ds.service.TUService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName :DataSourceController
 * @Description :DOTO
 * @Author :Mr.薛
 * @Data :2019/10/9  16:47
 * @Version :V1.0
 * @Status : 编写
 **/
@RestController
public class DataSourceController {
    @Autowired
    private TUService tuService;

    private static Log log = LogFactory.getLog(DataSourceController.class);

//    使用Master
    @RequestMapping(value = "selectMaster", method = RequestMethod.GET)
    public Object selectMaster() {
        log.info("使用Master节点查询Oracle数据库");
        return tuService.selectListMaster();
    }

//    使用slave1
    @RequestMapping(value = "selectSlave1", method = RequestMethod.GET)
    public Object selectSlave1() {
        log.info("使用Slave1节点查询Oracle数据库");
        return tuService.selectListSlave1();
    }
    @RequestMapping(value = "selectSlave2", method = RequestMethod.GET)
    public Object selectSlave2() {
        log.info("使用Slave2节点查询Oracle数据库");
        return tuService.selectListSlave2();
    }



}
