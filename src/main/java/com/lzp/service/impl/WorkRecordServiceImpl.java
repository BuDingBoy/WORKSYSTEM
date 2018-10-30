package com.lzp.service.impl;

import com.lzp.dao.WorkRecordDao;
import com.lzp.domain.WorkRecordDomain;
import com.lzp.service.WorkRecordService;
import com.lzp.util.ConvertBuilder;
import com.lzp.vo.WorkRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("workRecordService")
public class WorkRecordServiceImpl implements WorkRecordService {
    @Autowired
    private WorkRecordDao workRecordDao;

    @Override
    public List<WorkRecordVO> findWorkReportByWhere(WorkRecordVO workRecordVO) {

        return toWorkrecordVOlist(workRecordDao.findWorkReportByWhere(toWorkRecordDomain(workRecordVO)));
    }


    @Override
    public boolean insertWrokRecord(WorkRecordVO workRecordVO) {
        return workRecordDao.insertWorkRecord(toWorkRecordDomain(workRecordVO));
    }

    @Override
    public boolean updateWorkRecordByKey(WorkRecordVO workRecordVO) {

        return workRecordDao.updateWorkRecordByKey(toWorkRecordDomain(workRecordVO));
    }

    @Override
    public boolean deleteWorkRecordByKey(WorkRecordVO workRecordVO) {
        return workRecordDao.deleteWorkRecordByKey(toWorkRecordDomain(workRecordVO));
    }

    public List<WorkRecordVO> toWorkrecordVOlist(List<WorkRecordDomain> workRecordDomainList) {
        List<WorkRecordVO> workRecordVOList = new ArrayList<>();
        int size = workRecordDomainList.size();
        for (int i = 0; i < size; i++) {
            workRecordVOList.add(toWorkRecordVO(workRecordDomainList.get(i)));
        }
        return workRecordVOList;
    }

    /**
     * domain转VO
     *
     * @param workRecordDomain
     * @return
     */
    public WorkRecordVO toWorkRecordVO(WorkRecordDomain workRecordDomain) {
        WorkRecordVO workRecordVO = new WorkRecordVO();
        workRecordVO.setRecordID(String.valueOf(workRecordDomain.getRecordID()));
        workRecordVO.setStaffID(String.valueOf(workRecordDomain.getStaffID()));
        if (workRecordDomain.getRecordDate() != null) {
            workRecordVO.setRecordDate(ConvertBuilder.dateToString(workRecordDomain.getRecordDate()));
        }
        workRecordVO.setContent(workRecordDomain.getContent());
        workRecordVO.setNoCompleted(workRecordDomain.getNoCompleted());
        workRecordVO.setTitle(workRecordDomain.getTitle());

        return workRecordVO;
    }

    /**
     * vo转domain类型
     *
     * @param workRecordVO
     * @return workRecordDoamin
     */
    public WorkRecordDomain toWorkRecordDomain(WorkRecordVO workRecordVO) {
        WorkRecordDomain workRecordDomain = new WorkRecordDomain();
        if (workRecordVO.getRecordID() != null) {
            workRecordDomain.setRecordID(Integer.parseInt(workRecordVO.getRecordID()));
        }
        if (workRecordVO.getStaffID() != null) {
            workRecordDomain.setStaffID(Integer.parseInt(workRecordVO.getStaffID()));
        }
        if (workRecordVO.getRecordDate() != null) {
            workRecordDomain.setRecordDate(ConvertBuilder.stringToDate(workRecordVO.getRecordDate()));
        }
        workRecordDomain.setContent(workRecordVO.getContent());
        workRecordDomain.setNoCompleted(workRecordVO.getNoCompleted());
        workRecordDomain.setTitle(workRecordVO.getTitle());
        return workRecordDomain;
    }
}
