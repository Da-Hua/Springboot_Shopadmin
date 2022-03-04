package com.bwf.service;

import com.bwf.bean.bo.SpuSearchBo;
import com.bwf.bean.po.Spu;

import java.util.List;

/**
 * @author Hua
 */
public interface SpuService {

    List<Spu> getSpuList(SpuSearchBo bo);

    Spu getSpuBySkuId(Long skuId);
}
