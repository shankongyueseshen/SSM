package com.training.dao;

import com.training.domain.Out;
import com.training.domain.OutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutMapper {
    long countByExample(OutExample example);

    int deleteByExample(OutExample example);

    int insert(Out record);

    int insertSelective(Out record);

    List<Out> selectByExample(OutExample example);

    int updateByExampleSelective(@Param("record") Out record, @Param("example") OutExample example);

    int updateByExample(@Param("record") Out record, @Param("example") OutExample example);
}