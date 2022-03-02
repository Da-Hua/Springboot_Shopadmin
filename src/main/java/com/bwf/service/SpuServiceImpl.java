package com.bwf.service;

import com.bwf.bean.bo.SpuSearchBo;
import com.bwf.bean.po.Spu;
import com.bwf.mapper.SpuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hua
 */
@Service("/spuService")
public class SpuServiceImpl implements SpuService {

    @Autowired
    private SpuMapper spuMapper;

    @Override
    public List<Spu> getSpuList(SpuSearchBo bo) {
        return spuMapper.getSpuList(bo);
    }

    @Override
    public Spu getSpuBySkuId(Long skuId) {
        return spuMapper.getSpuBySkuId(skuId);
    }
}
