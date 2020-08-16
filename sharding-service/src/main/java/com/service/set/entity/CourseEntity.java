package com.service.set.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @author cg
 * @description desc
 * @date 2020-08-15 17:16
 */
@Data
@TableName("t_course")
public class CourseEntity {
    private Long courseId ;
    private String courseName ;
    private String courseDesc ;
    private Integer courseStatus ;
    private Date createTime ;
    private Date lastUpdateTime ;

    @Override
    public String toString() {
        return "CourseEntity{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDesc='" + courseDesc + '\'' +
                ", courseStatus=" + courseStatus +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}
