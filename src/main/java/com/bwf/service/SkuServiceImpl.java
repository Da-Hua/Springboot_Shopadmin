package com.bwf.service;

import com.bwf.bean.bo.SkuAddBo;
import com.bwf.bean.bo.SkuSearchBo;
import com.bwf.bean.po.Sku;
import com.bwf.mapper.SkuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Hua
 */
@Service("skuService")
public class SkuServiceImpl implements SkuService {

    @Autowired
    private SkuMapper skuMapper;

    @Override
    public List<Sku> getSkuList(SkuSearchBo bo) {
        return skuMapper.getSkuList(bo);
    }

    @Override
    public int updateSku(Long skuId) {
        return skuMapper.updateSku(skuId);
    }

    @Override
    public int addSku(SkuAddBo bo) {
        bo.setCreateTime(LocalDateTime.now());
        bo.setUpdateTime(LocalDateTime.now());
        return skuMapper.addSku(bo);
    }
}
