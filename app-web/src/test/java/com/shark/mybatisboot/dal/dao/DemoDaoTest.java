package com.shark.mybatisboot.dal.dao;

import com.shark.mybatisboot.dal.model.Demo;
import com.shark.mybatisboot.web.BootApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by tuze on 2017/12/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class)
@Slf4j
public class DemoDaoTest {

    @Autowired
    DemoDao demoDao;

    @Test
    public void querySqlModel() throws Exception {
        List<Map<String, Object>> maps = demoDao.querySqlModel();
        log.info("{}", maps);
    }

}