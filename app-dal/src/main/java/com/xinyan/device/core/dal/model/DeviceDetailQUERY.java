package com.xinyan.device.core.dal.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by tuze on 2018/4/14.
 */
@Data
public class DeviceDetailQUERY extends DeviceDetailDTO{

    /** 开始的查询时间 */
    @ApiModelProperty(value = "起始查询时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "GMT+8")
    private Date beginReqTime;

    /** 结束的查询时间 */
    @ApiModelProperty(value = "结束查询时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "GMT+8")
    private Date endReqTime;

}
