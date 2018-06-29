package org.lion.demo.basic;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.lion.demo.basic.mapper.OrderMapper;

import java.io.InputStream;

public class OrderTest {

    private OrderMapper orderMapper;

    @Before
    public void before() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = sqlSessionFactory.openSession();
        orderMapper = session.getMapper(OrderMapper.class);
    }

    @Test
    public void test29() throws Exception {
        orderMapper.selectOrdersList().stream()
                .forEach(System.out::println);
    }
}
