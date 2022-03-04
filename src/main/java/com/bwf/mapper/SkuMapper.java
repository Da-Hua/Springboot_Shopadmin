package com.bwf.mapper;

import com.bwf.bean.bo.SkuAddBo;
import com.bwf.bean.bo.SkuSearchBo;
import com.bwf.bean.po.Sku;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface SkuMapper {

    List<Sku> getSkuList(@Param("bo") SkuSearchBo bo);


    int updateSku(@Param("skuId") Long skuId);

    @Insert("insert into " +
            "sku(sku_spu_id, sku_name, sortno, sku_originalprice, sku_costprice, sku_price, " +
            "sku_quantity, sku_warning_quantity, sku_max_quantity, createtime, updatetime) " +
            "values(#{bo.skuSpuId}, #{bo.skuName}, #{bo.sortNo}, #{bo.skuOriginalPrice}, " +
            "#{bo.skuCostPrice}, #{bo.skuPrice}, #{bo.skuQuantity}, " +
            "#{bo.skuWarningQuantity}, #{bo.skuMaxQuantity}, " +
            "#{bo.createTime}, #{bo.updateTime})")
    int addSku(SkuAddBo bo);
}
