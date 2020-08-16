package com.service.set.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author cg
 * @description desc
 * @date 2020-08-16 10:26
 */
@Data
@TableName("t_dict")
public class DictEntity {
    private Long dictId ;
    private String dictKey ;
    private String dictValue ;
    private Integer dictStatus ;
    private Date createTime ;
    private Date lastUpdateTime ;

    @Override
    public String toString() {
        return "DictEntity{" +
                "dictId=" + dictId +
                ", dictKey='" + dictKey + '\'' +
                ", dictValue='" + dictValue + '\'' +
                ", dictStatus=" + dictStatus +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}
