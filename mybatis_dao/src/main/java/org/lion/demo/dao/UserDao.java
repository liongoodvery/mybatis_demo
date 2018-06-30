package org.lion.demo.dao;

import org.lion.demo.pojo.User;

public interface UserDao {
    User findUserById(Integer id);
}
