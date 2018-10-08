package com.lzp.service.impl;

import com.lzp.service.StaffService;
import com.lzp.vo.StaffVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:springMVC.xml"})
public class StaffServiceImplTest {
    @Autowired
    private StaffService staffService;

    @Test
    public void selectStaffByWhere() {
        List<StaffVO> staffVOS =staffService.selectStaffByWhere(new StaffVO());
        for( StaffVO staffVO :staffVOS){
            System.out.println(staffVO.getStaffName());
        }
    }
}