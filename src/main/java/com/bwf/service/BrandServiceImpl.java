package com.bwf.service;

import com.bwf.bean.bo.BrandAddBo;
import com.bwf.bean.bo.BrandSearchBo;
import com.bwf.bean.po.Brand;
import com.bwf.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author Hua
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getBrandList(BrandSearchBo bo) {
        return brandMapper.getBrandList(bo);
    }

    @Override
    public int updateBrand(BrandSearchBo bo) {
        bo.setUpdateTime(String.valueOf(LocalDateTime.now()));
        return brandMapper.updateBrand(bo);
    }

    @Override
    public int addBrand(BrandAddBo bo) {
        bo.setBrandId(String.valueOf(UUID.randomUUID()));
        bo.setCreateTime(LocalDateTime.now());
        bo.setUpdateTime(LocalDateTime.now());
        return brandMapper.addBrand(bo);
    }

    @Override
    public int deleteBrand(String brandId) {
        return brandMapper.deleteBrand(brandId);
    }
}
