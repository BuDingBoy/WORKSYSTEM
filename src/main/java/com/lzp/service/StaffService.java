package com.lzp.service;

import com.lzp.domain.StaffDomain;
import com.lzp.vo.StaffVO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StaffService {
    List<StaffVO> selectStaffByWhere(StaffVO staffVO);
}
