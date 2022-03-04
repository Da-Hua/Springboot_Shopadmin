package com.bwf.mapper;

import com.bwf.bean.bo.SpuSearchBo;
import com.bwf.bean.po.Spu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface SpuMapper {

    List<Spu> getSpuList(@Param("bo") SpuSearchBo bo);

    Spu getSpuBySkuId(Long skuId);
}
