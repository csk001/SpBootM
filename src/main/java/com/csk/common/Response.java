package com.csk.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: 88397353
 * @Date: 2019/5/28
 */
@Getter
@Setter
@ToString
public class Response implements Serializable {

    private static final long serialVersionUID = -8628150513296636783L;
    private static final String SUCCESS = "1";
    private static final String FAIL = "0";
    private String retFlag;
    private String errcode;
    private String errMsg;

    Response() {
        this.retFlag = SUCCESS;
    }

    public void setError(String errcode0, String errMsg0) {
        this.retFlag = FAIL;
        this.errcode = errcode0;
        this.errMsg = errMsg0;
    }
}
