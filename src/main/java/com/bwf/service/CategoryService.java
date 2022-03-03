package com.bwf.service;

import com.bwf.bean.bo.CategoryAddBo;
import com.bwf.bean.bo.CategorySearchBo;
import com.bwf.bean.po.Category;

import java.util.List;

/**
 * @author Hua
 */
public interface CategoryService {

    public List<Category> getCategoryListByParentId(Integer parentId );

    public List<Category> getCategoryListBySpuId(Long spuId);

    public int addCategory(CategoryAddBo bo);

    public List<Category> getCategoryList(CategorySearchBo bo);
}
