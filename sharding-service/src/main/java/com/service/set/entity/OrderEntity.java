package com.service.set.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author cg
 * @description desc
 * @date 2020-08-16 20:36
 */
@Data
@TableName("t_order")
public class OrderEntity {
    private Long orderId ;
    private Integer orderCount;
    private BigDecimal orderPrice;
    private Long studentId;
    private Integer payType;
    private Integer orderStatus;
    private Date createTime ;
    private Date lastUpdateTime ;
}
