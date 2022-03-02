package com.bwf.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
    private Integer odtailsId;
    private String odtailsName;
    private String odtailsThumbUrl;
    private Double odtailsPrice;
    private Integer odtailsCount;
    private Double odtailsAmount;
    private Integer odtailsScoreStatus;
    private Double odtailsScore;
    private String odtailsComment;
    private String odtailsPhotoUrls;
    private String createTime;
    private String updateTime;
    private Integer odtailsOrderNoId;
    private String odtailsSku;
    private Long odtailsSpuId;
}

