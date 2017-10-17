package com.mpf.dianping.dao;

import com.mpf.dianping.po.Dic;
import com.mpf.dianping.po.DicExample;
import com.mpf.dianping.po.DicKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicMapper {
    long countByExample(DicExample example);

    int deleteByExample(DicExample example);

    int deleteByPrimaryKey(DicKey key);

    int insert(Dic record);

    int insertSelective(Dic record);

    List<Dic> selectByExample(DicExample example);

    Dic selectByPrimaryKey(DicKey key);

    int updateByExampleSelective(@Param("record") Dic record, @Param("example") DicExample example);

    int updateByExample(@Param("record") Dic record, @Param("example") DicExample example);

    int updateByPrimaryKeySelective(Dic record);

    int updateByPrimaryKey(Dic record);
}