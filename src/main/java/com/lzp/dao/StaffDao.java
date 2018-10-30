package com.lzp.dao;

import com.lzp.domain.StaffDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffDao {
    public List<StaffDomain> selectStaffByWhere(StaffDomain staffDomain);
    public List<StaffDomain> loginByStaff(StaffDomain staffDomain);
}
