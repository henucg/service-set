package com.service.set.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.service.set.entity.DictEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cg
 * @description desc
 * @date 2020-08-16 10:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DictMapperTest {

    @Autowired
    DictMapper dictMapper ;

    /**
     * 测试公共表insert
     */
    @Test
    public void addTest(){
        DictEntity entity = new DictEntity() ;
        entity.setDictKey("adminId");
        entity.setDictValue("123124124");
        entity.setDictStatus(1);
        dictMapper.insert(entity) ;
    }

    /**
     * 测试公共表query
     */
    @Test
    public void queryTest(){
        QueryWrapper<DictEntity> queryWrapper = new QueryWrapper<>() ;
        queryWrapper.eq("dict_key","adminId") ;
        DictEntity entity = dictMapper.selectOne(queryWrapper) ;
        System.out.println(entity.toString());
    }
}
