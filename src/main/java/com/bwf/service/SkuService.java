package com.bwf.service;

import com.bwf.bean.bo.SkuAddBo;
import com.bwf.bean.bo.SkuSearchBo;
import com.bwf.bean.po.Sku;

import java.util.List;

/**
 * @author Hua
 */
public interface SkuService {

    List<Sku> getSkuList(SkuSearchBo bo);

    int updateSku(Long skuId);

    int addSku(SkuAddBo bo);
}
