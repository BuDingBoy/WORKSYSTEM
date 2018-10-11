package com.lzp.service.impl;

import com.lzp.dao.WorkRecordDao;
import com.lzp.domain.WorkRecordDomain;
import com.lzp.service.StaffService;
import com.lzp.service.WorkRecordService;
import com.lzp.util.ConvertBuilder;
import com.lzp.vo.StaffVO;
import com.lzp.vo.WorkRecordVO;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:springMVC.xml"})
public class StaffServiceImplTest {
    @Autowired
    private StaffService staffService;
    @Autowired
    private WorkRecordDao workRecordDao;
    @Autowired
    private WorkRecordService workRecordService;

    @Test
    public void selectStaffByWhere() {
        List<StaffVO> staffVOS =staffService.selectStaffByWhere(new StaffVO());
        for( StaffVO staffVO :staffVOS){
            System.out.println(staffVO.getStaffName());
        }
    }
    @Test
    public void findWorkRecordByWhere(){
//        List<WorkRecordDomain> workRecordDomains = workRecordDao.findWorkReportByWhere(new WorkRecordDomain());
//        System.out.println(workRecordDomains.size());
//        for (WorkRecordDomain workrecord: workRecordDomains) {
//            System.out.println(workrecord.getRecordID());
//            System.out.println(workrecord.getRecordDate());
//            System.out.println(ConvertBuilder.dateToString(workrecord.getRecordDate()));
//        }

        List<WorkRecordVO> workRecordVOList = workRecordService.findWorkReportByWhere(new WorkRecordVO());

        for(WorkRecordVO workRecordVO: workRecordVOList){
            System.out.println(workRecordVO.getRecordDate());
        }
    }
    @Test
    public void testdateconvert(){
        Date date =ConvertBuilder.stringToDate("2018-10-09 23:37:17");
        System.out.println(date);
    }
}