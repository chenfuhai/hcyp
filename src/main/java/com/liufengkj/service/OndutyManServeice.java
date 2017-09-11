package com.liufengkj.service;

import com.liufengkj.pojo.OndutyMan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OndutyManServeice {
    //添加排班人员信息 排班人员类
    //删除排班人信息 排班人ID ID--
    //修改排班人员信息 排班人员类
    //查询所有排班人信息，姓名 手机 短号 号等
    //上面一层是Controller在调用
    boolean saveDutyMan(OndutyMan ondutyMan);

    //删除用户 批量删除 判断用户是否存在
    int delDutyMan(int id);
    int delDutyManBatch(String ids);
    int delAll();
    boolean idExist(String name);
    //修改用户
    int modDutyMan(OndutyMan ondutyMan);
    //查询用户
    OndutyMan getByID(int id);
    List<OndutyMan> getByName(String name);
    List<OndutyMan> getByNameFuzzy(String name);
    List<OndutyMan> getByPhone(String phone);
    List<OndutyMan> getByPhoneFuzzy(String phone);
    List<OndutyMan> getByShortNumber(String number);
    List<OndutyMan> getByShortNumberFuzzy(String number);
    List<OndutyMan> getAll();

}
