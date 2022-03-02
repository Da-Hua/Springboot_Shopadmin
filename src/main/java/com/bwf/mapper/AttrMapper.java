package com.bwf.mapper;

import com.bwf.bean.bo.AttrSearchBo;
import com.bwf.bean.po.Attr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AttrMapper {

    List<Attr> getAttrList(@Param("bo") AttrSearchBo bo);

}
