package com.bwf.mapper;

import com.bwf.bean.bo.BrandAddBo;
import com.bwf.bean.bo.BrandSearchBo;
import com.bwf.bean.po.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface BrandMapper {

    List<Brand> getBrandList(@Param("bo") BrandSearchBo bo);

    @Update("update `brand` set brand_name = #{bo.brandName}, updatetime = #{bo.updateTime} where brand_id = #{bo.brandId}")
    int updateBrand(@Param("bo") BrandSearchBo bo);

    @Update("update `brand` set is_delete = 1 where brand_id = #{brandId}")
    int deleteBrand(@Param("brandId") String brandId);

    @Insert("insert into brand(brand_id, brand_name, brand_introduction, brand_logourl, sortno, createtime, updatetime)" +
            "values(#{bo.brandId}, #{bo.brandName}, #{bo.brandIntroduction}, 'logo.jpg', #{bo.sortNo}," +
            "#{bo.createTime}, #{bo.updateTime})")
    int addBrand(@Param("bo") BrandAddBo bo);
}
