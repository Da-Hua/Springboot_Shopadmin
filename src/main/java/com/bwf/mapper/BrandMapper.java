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

//    @Select("SELECT " +
//            "brand_id brandId," +
//            "brand_name brandName," +
//            "brand_introduction brandIntroduction," +
//            "brand_logourl brandLogoUrl," +
//            "sortno sortNo," +
//            "DATE_FORMAT(createtime, '%Y-%m-%d %T') createTime," +
//            "DATE_FORMAT(updatetime, '%Y-%m-%d %T') updateTime " +
//            "FROM `brand` " +
//            "WHERE is_delete = 0")
    public List<Brand> getBrandList(@Param("bo") BrandSearchBo bo);

    @Update("update `brand` set brand_name = #{bo.brandName}, updatetime = #{bo.updateTime} where brand_id = #{bo.brandId}")
    public int updateBrand(@Param("bo") BrandSearchBo bo);

    @Update("update `brand` set is_delete = 1 where brand_id = #{brandId}")
    public int deleteBrand(@Param("brandId") String brandId);

    @Insert("insert into brand(brand_id, brand_name, brand_introduction, brand_logourl, sortno, createtime, updatetime)" +
            "values(#{bo.brandId}, #{bo.brandName}, #{bo.brandIntroduction}, 'group1/M00/00/00/59f8ab69N648c77ad.jpg', #{bo.sortNo}," +
            "#{bo.createTime}, #{bo.updateTime})")
    public int addBrand(@Param("bo") BrandAddBo bo);
}
