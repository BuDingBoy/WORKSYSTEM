package com.lzp.dao;

import com.lzp.domain.WorkRecordDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRecordDao {
    List<WorkRecordDomain> findWorkReportByWhere(WorkRecordDomain workRecordDomain);
}
