package com.bwf.service;

import com.bwf.bean.bo.AttrSearchBo;
import com.bwf.bean.po.Attr;
import com.bwf.mapper.AttrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("attrService")
public class AttrServiceImpl implements AttrService {

    @Autowired
    private AttrMapper attrMapper;

    @Override
    public List<Attr> getAttrList(AttrSearchBo bo) {
        return attrMapper.getAttrList(bo);
    }
}
