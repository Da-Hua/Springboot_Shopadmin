package com.bwf.service;

import com.bwf.bean.bo.BrandAddBo;
import com.bwf.bean.bo.BrandSearchBo;
import com.bwf.bean.po.Brand;

import java.util.List;

/**
 * @author Hua
 */
public interface BrandService {

    List<Brand> getBrandList(BrandSearchBo bo);

    int updateBrand(BrandSearchBo bo);

    int addBrand(BrandAddBo bo);

    int deleteBrand(String brandId);
}
