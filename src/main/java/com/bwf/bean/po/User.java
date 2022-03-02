package com.bwf.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
    private Integer userId;
    private String userName;
    private String userAvatarUrl;
    private String userPhone;
    private String userEmail;
    private String userPassword;
    private String userSalt;
    private Integer userSecurityLevel;
    private Integer userGender;
    private Date userBirthday;
    private String userRegion;
    private String userMotto;
    private Integer userStatus;
    private String userToken;
    private String userExpireTime;
    private String userLoggedTime;
    private String userLoggedIp;
    private Integer userCreateFrom;
    private String createTime;
    private String updateTime;
}

