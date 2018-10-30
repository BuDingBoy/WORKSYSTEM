package com.lzp.service;

import com.lzp.vo.WorkRecordVO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface WorkRecordService {

    List<WorkRecordVO> findWorkReportByWhere(WorkRecordVO workRecordVO);
    boolean insertWrokRecord(WorkRecordVO workRecordVO);
    boolean updateWorkRecordByKey(WorkRecordVO workRecordVO);
    boolean deleteWorkRecordByKey(WorkRecordVO workRecordVO);
}
