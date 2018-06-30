package org.lion.demo.dao;

import org.lion.demo.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(Integer id) {
        return getSqlSession().selectOne("select * from user where id =" + id);
    }
}
