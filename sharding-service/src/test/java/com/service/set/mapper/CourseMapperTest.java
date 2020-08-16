package com.service.set.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.service.set.entity.CourseEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cg
 * @description desc
 * @date 2020-08-15 19:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseMapperTest {

    @Autowired
    CourseMapper courseMapper ;

    /**
     * 测试水平分表insert
     */
    @Test
    public void addTest(){
        CourseEntity entity = new CourseEntity() ;
        entity.setCourseName("语文");
        entity.setCourseDesc("中国近代文学");
        entity.setCourseStatus(1);
        courseMapper.insert(entity);
    }

    /**
     * 测试水平分表批量insert
     */
    @Test
    public void addBatchTest(){
        for (int i=1;i<=10;i++){
            CourseEntity entity = new CourseEntity() ;
            entity.setCourseName("course"+i);
            entity.setCourseDesc("desc"+i);
            courseMapper.insert(entity);
        }
    }

    /**
     * 测试水平分表query
     */
    @Test
    public void queryTest(){
        QueryWrapper<CourseEntity> queryWrapper = new QueryWrapper<>() ;
        queryWrapper.eq("course_id",501500970283302913L) ;
        CourseEntity entity = courseMapper.selectOne(queryWrapper) ;
        System.out.println(entity.toString());
    }

    /**
     * 测试水平分库分表insert
     */
    @Test
    public void addHorizontalTest(){
        CourseEntity entity = new CourseEntity() ;
        entity.setCourseName("数学");
        entity.setCourseDesc("微积分的使用");
        entity.setCourseStatus(1);
        courseMapper.insert(entity);
    }

    /**
     * 测试水平分库分表insert
     */
    @Test
    public void addBatchHorizontalTest(){
        for (int i=1;i<=10;i++){
            CourseEntity entity = new CourseEntity() ;
            entity.setCourseName("newCourseName"+i);
            entity.setCourseDesc("newDesc"+i);
            entity.setCourseStatus((int) (System.currentTimeMillis()%2));
            courseMapper.insert(entity);
        }
    }

    /**
     * 测试水平分库分表query
     */
    @Test
    public void queryHorizontalTest(){
        QueryWrapper<CourseEntity> queryWrapper = new QueryWrapper<>() ;
        queryWrapper.eq("course_status",1);
        queryWrapper.eq("course_id",501511416377769985L);
        CourseEntity entity = courseMapper.selectOne(queryWrapper) ;
        System.out.println(entity.toString());
    }
}
