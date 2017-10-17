package com.mpf.dianping.dao;

import com.mpf.dianping.po.SysGroupMenu;
import com.mpf.dianping.po.SysGroupMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysGroupMenuMapper {
    long countByExample(SysGroupMenuExample example);

    int deleteByExample(SysGroupMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysGroupMenu record);

    int insertSelective(SysGroupMenu record);

    List<SysGroupMenu> selectByExample(SysGroupMenuExample example);

    SysGroupMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysGroupMenu record, @Param("example") SysGroupMenuExample example);

    int updateByExample(@Param("record") SysGroupMenu record, @Param("example") SysGroupMenuExample example);

    int updateByPrimaryKeySelective(SysGroupMenu record);

    int updateByPrimaryKey(SysGroupMenu record);
}