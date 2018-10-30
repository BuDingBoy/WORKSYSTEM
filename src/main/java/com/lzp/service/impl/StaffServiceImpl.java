package com.lzp.service.impl;

import com.lzp.dao.StaffDao;
import com.lzp.domain.StaffDomain;
import com.lzp.service.StaffService;
import com.lzp.vo.StaffVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service("staffService")
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;


    @Override
    public List<StaffVO> selectStaffByWhere(StaffVO staffVO) {
        return toStaffVOList(staffDao.selectStaffByWhere(toStaffDomain(staffVO)));
    }

    @Override
    public List<StaffVO> loginByStaff(StaffVO staffVO) {
        return toStaffVOList(staffDao.loginByStaff(toStaffDomain(staffVO)));
    }

    public StaffDomain toStaffDomain(StaffVO staffVO){
        StaffDomain staffDomain = new StaffDomain();
        if (staffVO.getStaffID()!=null && !staffVO.getStaffID().equals("")){
            staffDomain.setStaffID(Integer.parseInt(staffVO.getStaffID()));
        }
        staffDomain.setStaffName(staffVO.getStaffName());
        if (staffVO.getStaffORG()!=null && !staffVO.getStaffORG().equals("")){
            staffDomain.setStaffORG(Integer.parseInt(staffVO.getStaffORG()));
        }
        staffDomain.setEmail(staffVO.getEmail());
        staffDomain.setPhone(staffVO.getPhone());
        staffDomain.setStaffPWD(staffVO.getStaffPWD());
        staffDomain.setNickname(staffVO.getNickname());
        staffDomain.setLoginID(staffVO.getLoginID());
        return staffDomain;
    }

    public StaffVO toStaffVO(StaffDomain staffDomain){
        StaffVO staffVO =new StaffVO();
        staffVO.setStaffID(String.valueOf(staffDomain.getStaffID()));
        staffVO.setStaffName(staffDomain.getStaffName());
        staffVO.setStaffORG(String.valueOf(staffDomain.getStaffORG()));
        staffVO.setEmail(staffDomain.getEmail());
        staffVO.setPhone(staffDomain.getPhone());
        staffVO.setStaffPWD(staffDomain.getStaffPWD());
        staffVO.setLoginID(staffDomain.getLoginID());
        staffVO.setNickname(staffDomain.getNickname());
        return staffVO;
    }

    public List<StaffVO> toStaffVOList(List<StaffDomain> staffDomains){
        List<StaffVO> staffVOS = new ArrayList<>();
        int size=staffDomains.size();
        for (int i=0;i<size;i++){
            staffVOS.add(toStaffVO(staffDomains.get(i)));
        }
        return staffVOS;
    }
}
