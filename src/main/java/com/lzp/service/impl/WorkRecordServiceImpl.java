package com.lzp.service.impl;

import com.lzp.dao.WorkRecordDao;
import com.lzp.domain.WorkRecordDomain;
import com.lzp.service.WorkRecordService;
import com.lzp.util.ConvertBuilder;
import com.lzp.vo.WorkRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("workRecordService")
public class WorkRecordServiceImpl implements WorkRecordService {
    @Autowired
    private WorkRecordDao workRecordDao;
    @Override
    public List<WorkRecordVO> findWorkReportByWhere(WorkRecordVO workRecordVO) {

        return toWorkrecordVOlist(workRecordDao.findWorkReportByWhere(new WorkRecordDomain()));
    }

    public List<WorkRecordVO> toWorkrecordVOlist(List<WorkRecordDomain> workRecordDomainList){
        List<WorkRecordVO> workRecordVOList = new ArrayList<>();
        int size=workRecordDomainList.size();
        for (int i=0;i<size;i++){
            workRecordVOList.add(toWorkRecordVO(workRecordDomainList.get(i)));
        }
        return  workRecordVOList;
    }

    /**
     * domain转VO
     * @param workRecordDomain
     * @return
     */
    public WorkRecordVO toWorkRecordVO(WorkRecordDomain workRecordDomain){
        WorkRecordVO workRecordVO = new WorkRecordVO();
        workRecordVO.setRecordID(String.valueOf(workRecordDomain.getRecordID()));
        workRecordVO.setStaffID(String.valueOf(workRecordDomain.getStaffID()));
        if (workRecordDomain.getRecordDate()!=null){
            workRecordVO.setRecordDate(ConvertBuilder.dateToString(workRecordDomain.getRecordDate()));
        }
        workRecordVO.setCompleted(workRecordDomain.getCompleted());
        workRecordVO.setNoCompleted(workRecordDomain.getNoCompleted());
        workRecordVO.setComments(workRecordDomain.getComments());

        return workRecordVO;
    }
}
