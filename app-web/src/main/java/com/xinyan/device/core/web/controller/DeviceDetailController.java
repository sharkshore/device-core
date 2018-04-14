package com.xinyan.device.core.web.controller;

import com.github.pagehelper.PageHelper;
import com.xinyan.device.core.common.enums.ErrorMsgEnum;
import com.xinyan.device.core.common.exception.ServiceException;
import com.xinyan.device.core.common.model.Result;
import com.xinyan.device.core.dal.model.DeviceDetailDTO;
import com.xinyan.device.core.service.DemoService;
import com.xinyan.device.core.service.DeviceDetailService;
import com.xinyan.device.core.service.model.DeviceDetailReqDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by tuze on 2017/8/23.
 */
@CrossOrigin
@RestController
@RequestMapping("/")
@Slf4j
@Api(value = "deviceDetail", description = "设备信息查询", consumes = MediaType.APPLICATION_JSON_VALUE)
public class DeviceDetailController {

    @Autowired
    private DeviceDetailService service;

    @ApiOperation(value = "查询设备", notes = "查询设备", response = Result.class)
    @RequestMapping(value = "/select", method = {RequestMethod.POST}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<DeviceDetailDTO> select( @RequestBody DeviceDetailReqDTO reqDTO) {
        try {

            List<DeviceDetailDTO> deviceDetailDTOS = service.selectBySelective(reqDTO);
            log.info("查询demo,请求信息:{},返回信息:{}", "", deviceDetailDTOS);
            return new Result(deviceDetailDTOS);
        } catch (ServiceException se) {
            return new Result(se.getErrorMsgEnum());
        } catch (Exception e) {
            log.error("查询商户的轮播图片,{}", "", e);
            return new Result(ErrorMsgEnum.E0001);
        }
    }


}
