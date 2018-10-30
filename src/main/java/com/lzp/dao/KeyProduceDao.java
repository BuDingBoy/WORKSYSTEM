package com.lzp.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface KeyProduceDao {
    public int findNowMaxID ();
}
