package com.bwf.bean.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class Role implements Serializable {
    private Integer roleId;
    private String roleName;
    private String permissionId;
}
