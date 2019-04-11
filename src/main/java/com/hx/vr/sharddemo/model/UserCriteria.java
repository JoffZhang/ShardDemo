package com.hx.vr.sharddemo.model;

public class UserCriteria {
    private Integer limit;
    private Integer offset;
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getOffset() {
        return offset;
    }

}