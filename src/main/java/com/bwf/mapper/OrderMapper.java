package com.bwf.mapper;

import com.bwf.bean.bo.OrderSearchBo;
import com.bwf.bean.po.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface OrderMapper {

//    @Select("select " +
//            "o.id orderId," +
//            "o.order_no orderNo," +
//            "o.order_status orderStatus," +
//            "o.order_spuamount orderSpuAmount," +
//            "o.order_expressfee orderExpressFee," +
//            "o.order_totalamount orderTotalAmount," +
//            "o.order_discountamount orderDiscountAmount," +
//            "o.order_payamount orderPayAmount," +
//            "o.order_paymode orderPayMode," +
//            "o.order_payplatform orderPayPlatform," +
//            "o.order_ipaddress orderIpAddress," +
//            "o.order_paymentno orderPaymentNo," +
//            "o.order_remark orderRemark," +
//            "o.createtime createTime," +
//            "o.updatetime updateTime," +
//            "o.order_user_id orderUserId," +
//            "u.user_id userId," +
//            "u.user_name userName," +
//            "u.user_avatarurl userAvatarUrl," +
//            "u.user_phone userPhone," +
//            "u.user_email userEmail," +
//            "u.user_password userPassword," +
//            "u.user_salt userSalt," +
//            "u.user_securitylevel userSecurityLevel," +
//            "u.user_gender userGender," +
//            "u.user_birthday userBirthday," +
//            "u.user_region userRegion," +
//            "u.user_motto userMotto," +
//            "u.user_status userStatus," +
//            "u.user_token userToken," +
//            "u.user_expiretime userExpireTime," +
//            "u.user_loggedtime userLoggedTime," +
//            "u.user_loggedip userLoggedIp," +
//            "u.user_createfrom userCreateFrom," +
//            "u.createtime createTime," +
//            "u.updatetime updateTime " +
//            "from `order` o " +
//            "left join `user` u " +
//            "on o.order_user_id=u.user_id")
//    @Results(id = "getOrderList", value = {
//        @Result(id = true, property = "orderId", column = "id"),
//        @Result(property="orderNo", column="order_no"),
//        @Result(property="orderStatus", column="order_status"),
//        @Result(property="orderSpuAmount", column="order_spuamount"),
//        @Result(property="orderExpressFee", column="order_expressfee"),
//        @Result(property="orderTotalAmount", column="order_totalamount"),
//        @Result(property="orderDiscountAmount", column="order_discountamount"),
//        @Result(property="orderPayAmount", column="order_payamount"),
//        @Result(property="orderPayMode", column="order_paymode"),
//        @Result(property="orderPayPlatform", column="order_payplatform"),
//        @Result(property="orderIpAddress", column="order_ipaddress"),
//        @Result(property="orderPaymentNo", column="order_paymentno"),
//        @Result(property="orderRemark", column="order_remark"),
//        @Result(property="createTime", column="createtime"),
//        @Result(property="updateTime", column="updatetime"),
//        @Result(property="orderUserId", column="order_user_id", one = @One(select = ))
//    })
    public List<Order> getOrderList(@Param("bo") OrderSearchBo bo);

    @Update("update `order` set order_status = #{bo.orderStatus}, updatetime = #{bo.updateTime} where id = #{bo.orderId}")
    public int saveOrder(@Param("bo") OrderSearchBo bo);
}
