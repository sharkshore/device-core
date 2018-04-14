package com.xinyan.device.core.web.controller;

import com.xinyan.device.core.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by tuze on 2017/12/4.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(DeviceDetailController.class)
public class DeviceDetailControllerWebMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DemoService demoService;

    @Test
    public void hello() throws Exception {

        mockMvc.perform(get("/hello").contentType(MediaType.ALL))
                .andDo(print())
                .andExpect(status().isOk());

    }

}
