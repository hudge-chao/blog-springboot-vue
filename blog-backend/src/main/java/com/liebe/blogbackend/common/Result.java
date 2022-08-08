package com.liebe.blogbackend.common;

import com.liebe.blogbackend.utils.ConstMsg;

public class Result {

    private static final long serialVersionUID = 1L;

    private int res = ConstMsg.failure;
    private String resMsg = ConstMsg.DATA_FAILURE;
    private Object obj = null;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void setSucceed(Object obj) {
        this.obj = obj;
        this.setRes(ConstMsg.success);
    }

    public void setSucceed(Object obj, String msg) {
        this.setSucceed(obj);
        this.setResMsg(msg);
    }

    public void setSucceedMsg(String msg) {
        this.setResMsg(ConstMsg.DATA_SUCCESS);
    }

    public void setFailureMsg(String msg) {
        this.setResMsg(msg);
        this.setRes(ConstMsg.failure);
    }

}
