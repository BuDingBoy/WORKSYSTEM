package com.lzp.control;

import com.lzp.service.WorkRecordService;
import com.lzp.vo.StaffVO;
import com.lzp.vo.WorkRecordVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.mail.Message;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/workRecord")
public class WorkRecordController {
    @Resource
    WorkRecordService workRecordService;
    @ResponseBody
    @RequestMapping(value = "insertWorkRecord")
    public String insertWorkRecord( HttpServletRequest request,WorkRecordVO workRecordVO){
        StaffVO staffVO;
        staffVO=(StaffVO) request.getSession().getAttribute("staffVO");
        workRecordVO.setStaffID(staffVO.getStaffID());
       boolean flag= workRecordService.insertWrokRecord(workRecordVO);
       if (flag){
           return "1";
       }else{
           return "0";
       }
    }
    @ResponseBody
    @RequestMapping(value = "updateWorkRecordByKey")
    public String updateWorkRecordByKey(WorkRecordVO workRecordVO){
      if (workRecordService.updateWorkRecordByKey(workRecordVO)){
          return "1";
      }else
          return "0";
    }

    @ResponseBody
    @RequestMapping(value = "deleteWorkRecordByKey")
    public String deleteWorkRecordByKey(WorkRecordVO workRecordVO){
        String[] recordIds = workRecordVO.getRecordID().split(",");
        try {
            for (String recordID:recordIds) {
                workRecordVO.setRecordID(recordID);
                workRecordService.deleteWorkRecordByKey(workRecordVO);
            }
        }catch (Exception e){
            e.getMessage();
            return "0";
        }
        return "1";
    }
    @ResponseBody
    @RequestMapping(value = "findWorkRecordByWhere")
    public List<WorkRecordVO> findWorkRecordByWhere(HttpServletRequest request, WorkRecordVO workRecordVO){
        StaffVO staffVO = (StaffVO) request.getSession().getAttribute("staffVO");
        workRecordVO.setStaffID(staffVO.getStaffID());
        return workRecordService.findWorkReportByWhere(workRecordVO);
    }

}
