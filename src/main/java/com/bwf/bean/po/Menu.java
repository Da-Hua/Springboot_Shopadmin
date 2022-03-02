package com.bwf.bean.po;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class Menu {
    private Integer menuId;
    private String menuName;
    private String menuUrl;
    private Integer pid;
}
