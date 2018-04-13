package com.xinyan.device.core.web.biz;

import com.xinyan.device.core.web.TestConfigure;
import com.xinyan.device.core.dal.mapper.DemoMapper;
import com.xinyan.device.core.dal.model.Demo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by tuze on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Import(TestConfigure.class)
@Slf4j
public class DemoServiceTest {

    @Autowired
    DemoMapper demoMapper;

    @Autowired
    @Qualifier("testDemo")
    Demo demo;

    @Test
    public void queryMemberName() throws Exception {
        log.info("{}", demoMapper.queryMemberName());
    }

    @Test
    public void querySqlModel() throws Exception {
        log.info("{}", demo);
    }

}