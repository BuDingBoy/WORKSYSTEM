package com.lzp.control;

import com.lzp.domain.StaffDomain;
import com.lzp.service.StaffService;
import com.lzp.vo.StaffVO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Resource
    StaffService staffService;

    @ResponseBody
    @RequestMapping(value="/selectStaffByWhere",produces = "application/json")
    public List<StaffVO> selectStaffByWhere(HttpServletRequest request, StaffVO staffVO){

        return staffService.selectStaffByWhere(staffVO);
    }

    @ResponseBody
    @RequestMapping(value="/loginStaff")
    public String loginStaff(HttpServletRequest request, StaffVO staffVO){
        List<StaffVO> staffVOS = staffService.loginByStaff(staffVO);
        if (staffVOS.size()>0){
            StaffVO loginStaffVO=staffVOS.get(0);
            request.getSession().setAttribute("staffVO",loginStaffVO);
            return "1";
        }else {
            return "0";
        }
    }
    @ResponseBody
    @RequestMapping(value = "/getLoginStaffVO")
    public StaffVO getLoginStaffVO(HttpServletRequest request){
        return (StaffVO) request.getSession().getAttribute("staffVO");
    }

}
