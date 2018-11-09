package com.lzp.service;

import org.springframework.stereotype.Service;

@Service
public interface KeyProduceService {
    String getTableKey(String tableName);
}
