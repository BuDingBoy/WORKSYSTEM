package com.lzp.dao;

import com.lzp.domain.KeyProduceDomain;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyProduceDao {
    KeyProduceDomain findNowMaxID (@Param("keyID") int keyID);
    boolean updateTableKey (KeyProduceDomain keyProduceDomain);
    int findMaxIDByKey(@Param("keyID") int keyID,@Param("num") int num );
}
