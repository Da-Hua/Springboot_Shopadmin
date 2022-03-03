package com.bwf.service;

import com.bwf.bean.bo.CategoryAddBo;
import com.bwf.bean.bo.CategorySearchBo;
import com.bwf.bean.po.Category;
import com.bwf.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author Hua
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryListByParentId(Integer parentId) {
        return categoryMapper.getCategoryListByParentId(parentId);
    }

    @Override
    public List<Category> getCategoryListBySpuId(Long spuId) {
        return categoryMapper.getCategoryListBySpuId(spuId);
    }

    @Override
    public int addCategory(CategoryAddBo bo) {
        return categoryMapper.addCategory(bo);
    }

    @Override
    public List<Category> getCategoryList(CategorySearchBo bo) {
        return categoryMapper.getCategoryList(bo);
    }
}
