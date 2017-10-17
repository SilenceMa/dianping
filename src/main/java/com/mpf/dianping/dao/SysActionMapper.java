package com.mpf.dianping.dao;

import com.mpf.dianping.po.SysAction;
import com.mpf.dianping.po.SysActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActionMapper {
    long countByExample(SysActionExample example);

    int deleteByExample(SysActionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAction record);

    int insertSelective(SysAction record);

    List<SysAction> selectByExample(SysActionExample example);

    SysAction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAction record, @Param("example") SysActionExample example);

    int updateByExample(@Param("record") SysAction record, @Param("example") SysActionExample example);

    int updateByPrimaryKeySelective(SysAction record);

    int updateByPrimaryKey(SysAction record);
}