package com.xinyan.device.core.service.model;

import com.xinyan.device.core.common.model.PageParam;
import com.xinyan.device.core.dal.model.DeviceDetailQUERY;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by tuze on 2018/4/14.
 */
@Data
@ApiModel("DeviceDetailReqDTO")
public class DeviceDetailReqDTO extends DeviceDetailQUERY{

    @ApiModelProperty("分页参数")
    PageParam pageParam;

}
