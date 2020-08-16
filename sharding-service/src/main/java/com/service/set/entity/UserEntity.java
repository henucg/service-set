package com.service.set.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author cg
 * @description desc
 * @date 2020-08-16 09:45
 */
@Data
@TableName("t_user")
public class UserEntity {
    private Long userId ;
    private String userName ;
    private Integer userStatus ;
    private Date createTime ;
    private Date lastUpdateTime ;

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userStatus=" + userStatus +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}
