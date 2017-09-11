package com.liufengkj.dao;

import com.liufengkj.pojo.OndutyMan;
import com.liufengkj.pojo.OndutyManExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OndutyManMapper {
    long countByExample(OndutyManExample example);

    int deleteByExample(OndutyManExample example);

    int deleteByPrimaryKey(Integer omId);

    int insert(OndutyMan record);

    int insertSelective(OndutyMan record);

    List<OndutyMan> selectByExample(OndutyManExample example);

    OndutyMan selectByPrimaryKey(Integer omId);

    int updateByExampleSelective(@Param("record") OndutyMan record, @Param("example") OndutyManExample example);

    int updateByExample(@Param("record") OndutyMan record, @Param("example") OndutyManExample example);

    int updateByPrimaryKeySelective(OndutyMan record);

    int updateByPrimaryKey(OndutyMan record);
}