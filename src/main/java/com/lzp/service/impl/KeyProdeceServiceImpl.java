package com.lzp.service.impl;

import com.lzp.dao.KeyProduceDao;
import com.lzp.domain.KeyProduceDomain;
import com.lzp.service.KeyProduceService;
import com.lzp.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("keyProduceService")
public class KeyProdeceServiceImpl implements KeyProduceService {
    @Autowired
    KeyProduceDao keyProduceDao;
    @Override
    public String getTableKey(String tableName) {
        int keyID=Constant.getInstance().getKeyMap().get(tableName);
        int tableKeyID=keyProduceDao.findMaxIDByKey(keyID,1);
        return String.valueOf(tableKeyID);
    }
}
