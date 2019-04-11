package com.hx.vr.sharddemo.dao;


import com.hx.vr.sharddemo.model.BoxOperationLog;
import com.hx.vr.sharddemo.model.BoxOperationLogCriteria;

import java.util.List;

public interface BoxOperationLogMapper {
    long countByCriteria(BoxOperationLogCriteria example);

    int insert(BoxOperationLog record);

    int insertSelective(BoxOperationLog record);

    List<BoxOperationLog> selectByCriteria(BoxOperationLogCriteria example);
}