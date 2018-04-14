package com.xinyan.device.core.dal.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tuze on 2018/4/13.
 */
@Data
public class DeviceDetailDTO  implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 5984941423268833430L;


    /** 主键ID */
    private Long id;
    /** * 商户号 */
    private String merchantNo;
    /** 请求时间 */
    private Date reqTime;
    /** 新颜设备指纹 */
    private String xyid;
    /** 查询设备指纹的token */
    private String token;
    /** 设备信誉 */
    private Integer deviceScore;
    /** 设备类型,pc或者mobile */
    private String deviceType;
    /** 操作系统名称 */
    private String os;
    /** 操作版本 */
    private String osVersion;
    /** 访问的app名称 */
    private String accessApp;
    /** 是否虚拟机 */
    private Boolean isVm;
    /** * 是否为模拟器 */
    private Boolean isEmulator;
    /** * 是否为代理 */
    private Boolean isProxy;
    /** * 是否为VPN */
    private Boolean isVpn;
    /** * android设备是否root */
    private Boolean isRoot;
    /** * ios设备是否越狱 */
    private Boolean isJailbreak;
    /** 设备访问时所在国家 */
    private String country;
    /** 设备访问时所在省份或区域 */
    private String region;
    /** 设备访问时所在城市 */
    private String city;
    /** 设备访问时所在IP */
    private String ip;
    /** * 是否服务代理 */
    private Boolean isAgent;
    /** 请求时间 */
    private Date createdAt;

}
