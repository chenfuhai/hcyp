package com.liufengkj.service;

import com.liufengkj.pojo.Onduty;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface OndutyService {
    //排班管理
    //添加排班 排班类
    //删除排班 排班ID 多个排班ID
    //修改排班信息 排班类
    //查询排班信息 起始时间 截止时间
    int saveDuty(Onduty onduty);
    int delAll();
    int delDutyBatch(String ids);
    int delDuty(int id);
    int modDuty(Onduty onduty);
    List<Onduty> getAll();
    Onduty getByid(int id);
    List<Onduty> getByTime(Date startTime,Date endTime);
    List<Onduty> getByManID(int id);


}
