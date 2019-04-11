package com.hx.vr.sharddemo.model;


import lombok.Data;

import java.util.Date;

@Data
public class BoxOperationLog {
    private Integer id;
    private Byte sysType;
    private Short stateCode;
    private Byte subCode;
    private Integer boxId;
    private String macAddr;
    private String deviceModel;
    private String channelId;
    private String appVersion;

    private String label1;

    private String label2;

    private String label3;

    private String label4;

    private String label5;

    private String label6;

    private String jsonMsg;

    private String message;
    private Date operateTime;

}