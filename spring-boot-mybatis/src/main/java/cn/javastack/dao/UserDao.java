package cn.javastack.dao;

import cn.javastack.model.User;

import java.util.List;

/**
 * @author 0164631
 */
public interface UserDao {
    int insert(User record);

    List<User> selectUsers();
}
