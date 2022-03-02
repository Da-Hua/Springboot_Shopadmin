package com.bwf.mapper;

import com.bwf.bean.bo.CategoryAddBo;
import com.bwf.bean.bo.CategorySearchBo;
import com.bwf.bean.po.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface CategoryMapper {

    public List<Category> getCategoryListByParentId(@Param("parentId") Integer parentId );

    @Insert("insert into category(cate_name, cate_sort, cate_parentid) values()")
    public int addCategory(@Param("bo") CategoryAddBo bo);

    @Select("select " +
            "cate_id cateId," +
            "cate_name cateName " +
            "from category")
    public List<Category> getCategoryList(@Param("bo") CategorySearchBo bo);

    public List<Category> getCategoryListBySpuId(@Param("spuId") Long spuId);
}
