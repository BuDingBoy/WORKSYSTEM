package com.lzp.service;

import com.lzp.vo.WorkRecordVO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface WorkRecordService {

    List<WorkRecordVO> findWorkReportByWhere(WorkRecordVO workRecordVO);
}
