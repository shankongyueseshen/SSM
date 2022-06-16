package com.training.dao;

import com.training.domain.In;
import com.training.domain.InExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InMapper {
    long countByExample(InExample example);

    int deleteByExample(InExample example);

    int insert(In record);

    int insertSelective(In record);

    List<In> selectByExample(InExample example);

    int updateByExampleSelective(@Param("record") In record, @Param("example") InExample example);

    int updateByExample(@Param("record") In record, @Param("example") InExample example);
}