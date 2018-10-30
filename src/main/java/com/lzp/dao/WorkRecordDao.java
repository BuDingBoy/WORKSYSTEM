package com.lzp.dao;

import com.lzp.domain.WorkRecordDomain;
import com.lzp.vo.WorkRecordVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRecordDao {
    List<WorkRecordDomain> findWorkReportByWhere(WorkRecordDomain workRecordDomain);
    boolean insertWorkRecord(WorkRecordDomain workRecordDomain);
    boolean updateWorkRecordByKey(WorkRecordDomain workRecordDomain);
    boolean deleteWorkRecordByKey(WorkRecordDomain workRecordDomain);
}
