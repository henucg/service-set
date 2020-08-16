package com.service.set.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.service.set.entity.OrderEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @author cg
 * @description desc
 * @date 2020-08-16 20:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTest {

    @Autowired
    OrderMapper orderMapper ;

    /**
     * 测试主从复制insert
     */
    @Test
    public void addTest(){
        OrderEntity entity = new OrderEntity() ;
        entity.setOrderCount(2);
        entity.setOrderPrice(new BigDecimal(99.999));
        entity.setStudentId(122L);
        entity.setOrderStatus(1);
        entity.setPayType(2);
        orderMapper.insert(entity);
    }

    /**
     * 测试主从复制query
     */
    @Test
    public void quertTest(){
        QueryWrapper<OrderEntity> queryWrapper = new QueryWrapper<>() ;
        queryWrapper.eq("order_id",111);
        OrderEntity entity = orderMapper.selectOne(queryWrapper);
        System.out.println(entity.toString());
    }

    /**
     * 测试主从复制delete
     */
    @Test
    public void deleteTest(){
        QueryWrapper<OrderEntity> queryWrapper = new QueryWrapper<>() ;
        queryWrapper.eq("order_id",111);
        orderMapper.delete(queryWrapper);
    }
}
