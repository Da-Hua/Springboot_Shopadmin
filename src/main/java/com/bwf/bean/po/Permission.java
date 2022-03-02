package com.bwf.bean.po;

import com.alibaba.fastjson.annotation.JSONField;
import com.bwf.bean.vo.State;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class Permission {

    private Integer permissionId;
    @JSONField(name = "text")
    private String permissionName;
    private Integer pid;
    @JSONField(name = "nodes")
    private List<Permission> children;
    private State state;
}
