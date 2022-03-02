package com.bwf.service;

import com.bwf.bean.bo.SkuAddBo;
import com.bwf.bean.bo.SkuSearchBo;
import com.bwf.bean.po.Sku;

import java.util.List;

/**
 * @author Hua
 */
public interface SkuService {

    public List<Sku> getSkuList(SkuSearchBo bo);

    public int updateSku(Long skuId);

    public int addSku(SkuAddBo bo);
}
