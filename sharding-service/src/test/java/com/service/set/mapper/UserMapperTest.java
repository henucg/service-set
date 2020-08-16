package com.service.set.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.service.set.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cg
 * @description desc
 * @date 2020-08-16 09:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper ;

    /**
     * 测试专库专表insert
     */
    @Test
    public void addTest(){
        UserEntity entity = new UserEntity();
        entity.setUserName("李寻欢");
        entity.setUserStatus(1);
        userMapper.insert(entity);
    }

    /**
     * 测试专库专表query
     */
    @Test
    public void queryTest(){
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",501695715014082561L);
        UserEntity user = userMapper.selectOne(queryWrapper);
        System.out.println(user.toString());
    }

}
