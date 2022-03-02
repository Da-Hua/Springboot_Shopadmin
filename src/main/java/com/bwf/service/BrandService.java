package com.bwf.service;

import com.bwf.bean.bo.BrandAddBo;
import com.bwf.bean.bo.BrandSearchBo;
import com.bwf.bean.po.Brand;

import java.util.List;

/**
 * @author Hua
 */
public interface BrandService {

    public List<Brand> getBrandList(BrandSearchBo bo);

    public int updateBrand(BrandSearchBo bo);

    public int addBrand(BrandAddBo bo);

    public int deleteBrand(String brandId);
}
