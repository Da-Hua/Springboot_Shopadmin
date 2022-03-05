package com.bwf.bean.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class Menu implements Serializable {
    private Integer menuId;
    private String menuName;
    private String menuUrl;
    private Integer pid;
}
