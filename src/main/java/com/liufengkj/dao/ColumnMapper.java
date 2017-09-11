package com.liufengkj.dao;

import com.liufengkj.pojo.Column;
import com.liufengkj.pojo.ColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnMapper {
    long countByExample(ColumnExample example);

    int deleteByExample(ColumnExample example);

    int deleteByPrimaryKey(Integer coId);

    int insert(Column record);

    int insertSelective(Column record);

    List<Column> selectByExample(ColumnExample example);

    Column selectByPrimaryKey(Integer coId);

    int updateByExampleSelective(@Param("record") Column record, @Param("example") ColumnExample example);

    int updateByExample(@Param("record") Column record, @Param("example") ColumnExample example);

    int updateByPrimaryKeySelective(Column record);

    int updateByPrimaryKey(Column record);
}