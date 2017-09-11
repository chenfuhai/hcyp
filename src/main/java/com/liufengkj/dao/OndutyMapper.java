package com.liufengkj.dao;

import com.liufengkj.pojo.Onduty;
import com.liufengkj.pojo.OndutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OndutyMapper {
    long countByExample(OndutyExample example);

    int deleteByExample(OndutyExample example);

    int deleteByPrimaryKey(Integer odId);

    int insert(Onduty record);

    int insertSelective(Onduty record);

    List<Onduty> selectByExample(OndutyExample example);

    Onduty selectByPrimaryKey(Integer odId);

    int updateByExampleSelective(@Param("record") Onduty record, @Param("example") OndutyExample example);

    int updateByExample(@Param("record") Onduty record, @Param("example") OndutyExample example);

    int updateByPrimaryKeySelective(Onduty record);

    int updateByPrimaryKey(Onduty record);
}