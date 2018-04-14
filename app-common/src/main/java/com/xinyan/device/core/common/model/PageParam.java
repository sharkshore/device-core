package com.xinyan.device.core.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by tuze on 2017/11/24.
 */
@ApiModel(value = "分页参数")
@Data
public class PageParam implements Serializable{

    /** 串行版本ID*/
    private static final long serialVersionUID = -120953557496316923L;

    @ApiModelProperty(value = "第几页")
    @NotNull(message = "pageNum不能为空",groups = {JsrGroup.Get.class})
    private Integer pageNum;

    @ApiModelProperty(value = "每页显示几行")
    @NotNull(message = "pageSize不能为空",groups = {JsrGroup.Get.class})
    private Integer pageSize;

}
