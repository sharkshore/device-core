package com.xinyan.device.core.service;

import com.github.pagehelper.PageHelper;
import com.xinyan.device.core.dal.mapper.DeviceDetailMapper;
import com.xinyan.device.core.dal.model.DeviceDetailDTO;
import com.xinyan.device.core.dal.model.DeviceDetailQUERY;
import com.xinyan.device.core.service.model.DeviceDetailReqDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tuze on 2018/4/14.
 */
@Service
public class DeviceDetailService {

    @Autowired
    DeviceDetailMapper mapper;

    /**
     * 动态查询
     * @param reqDto
     * @return
     */
    public List<DeviceDetailDTO> selectBySelective(DeviceDetailReqDTO reqDto){
        PageHelper.startPage(reqDto.getPageParam());
        return mapper.selectBySelective(reqDto);
    }

}
