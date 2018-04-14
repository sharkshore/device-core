package com.xinyan.device.core.dal.mapper;

import com.xinyan.device.core.dal.model.DeviceDetailDTO;
import com.xinyan.device.core.dal.model.DeviceDetailQUERY;

import java.util.List;

/**
 * 设备指纹查询信息
 * Created by tuze on 2017/8/23.
 */
public interface DeviceDetailMapper {

    List<DeviceDetailDTO> selectBySelective(DeviceDetailQUERY query);
}
