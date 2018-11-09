package com.lzp.service.impl;

import com.lzp.dao.KeyProduceDao;
import com.lzp.dao.WorkRecordDao;
import com.lzp.domain.KeyProduceDomain;
import com.lzp.domain.WorkRecordDomain;
import com.lzp.service.KeyProduceService;
import com.lzp.service.StaffService;
import com.lzp.service.WorkRecordService;
import com.lzp.util.Constant;
import com.lzp.util.ConvertBuilder;
import com.lzp.vo.StaffVO;
import com.lzp.vo.WorkRecordVO;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
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
    @Autowired
    private KeyProduceDao keyProduceDao;
    @Autowired
    private KeyProduceService keyProduceService;

    @Test
    public void selectStaffByWhere() {
        List<StaffVO> staffVOS =staffService.selectStaffByWhere(new StaffVO());
        for( StaffVO staffVO :staffVOS){
            System.out.println(staffVO.getStaffName());
        }
    }
    @Test
    public void login(){
        StaffVO staffVO = new StaffVO();
        staffVO.setStaffID("1");
        staffVO.setStaffPWD("123");
        List<StaffVO> staffVOS=staffService.loginByStaff(staffVO);
        System.out.println(staffVOS.size());
    }
    @Test
    public void findWorkRecordByWhere(){
        List<WorkRecordVO> workRecordVOList = workRecordService.findWorkReportByWhere(new WorkRecordVO());

        for(WorkRecordVO workRecordVO: workRecordVOList){
            System.out.println(workRecordVO.getRecordDate());
            System.out.println(workRecordVO.getRecordID());
        }
    }
    @Test
    public void testdateconvert(){
        Date dates = new Date();
        System.out.println(ConvertBuilder.dateToString(dates));
        Date date =ConvertBuilder.stringToDate("2018-10-12 22:22:22");
        System.out.println(date);
    }
    @Test
    public void insertWorkrecord(){
        WorkRecordVO workRecordVO = new WorkRecordVO();
        workRecordVO.setStaffID("1");
        workRecordVO.setRecordID("1009");
        workRecordVO.setContent("已完成");
        workRecordVO.setNoCompleted("d");
        workRecordVO.setTitle("sd");
        workRecordVO.setRecordDate("2018-10-12 22:22:22");
        workRecordService.insertWrokRecord(workRecordVO);
//        workRecordService.findWorkReportByWhere(workRecordVO);
        findWorkRecordByWhere();
    }

    @Test
    public void getkey(){
        String  key =keyProduceService.getTableKey("WORK_RECORD");
        System.out.println(key);

    }

}