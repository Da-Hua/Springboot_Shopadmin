package com.bwf.service;

import com.bwf.bean.bo.CategoryAddBo;
import com.bwf.bean.bo.CategorySearchBo;
import com.bwf.bean.po.Category;

import java.util.List;

/**
 * @author Hua
 */
public interface CategoryService {

    List<Category> getCategoryListByParentId(Integer parentId);

    List<Category> getCategoryListBySpuId(Long spuId);

    int addCategory(CategoryAddBo bo);

    List<Category> getCategoryList(CategorySearchBo bo);
}
