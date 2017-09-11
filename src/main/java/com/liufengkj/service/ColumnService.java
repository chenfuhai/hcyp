package com.liufengkj.service;

import com.liufengkj.pojo.Column;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ColumnService {
    //新闻大类小类自定义
    //添加类 类别类
    //删除类 类别ID 批量删除类
    //修改类 类别类
    //查询子类 父类ID（查根类）
    //查询所有类

    int saveClassification(Column column);

    int delAll();
    int delBatch(String ids);
    int delByid(int id);

    int modifyClassification(Column column);

    List<Column> getAll();
    Column getByid(int id);
    List<Column> getByName(String name);
    List<Column> getByNameFuzzy(String name);
    List<Column> getByFatherID(int fatherID);
    List<Column> getRoot();

}
