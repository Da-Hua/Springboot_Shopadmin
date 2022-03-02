package com.bwf.service;

import com.bwf.bean.bo.AttrSearchBo;
import com.bwf.bean.po.Attr;

import java.util.List;

/**
 * @author Hua
 */
public interface AttrService {

    public List<Attr> getAttrList(AttrSearchBo bo);
}
