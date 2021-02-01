package cn.javastack.service;

import cn.javastack.dto.UserDto;
import cn.javastack.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author 0164631
 */
public interface IUserService {
    /**
     * 新增用户
     *
     * @param userDto 查询参数
     * @return
     */
    int addUser(UserDto userDto);

    /**
     * 查询用户列表
     *
     * @param userDto 查询参数
     * @return
     */
    List<User> findUserList(UserDto userDto);

    /**
     * 分页查询用户
     *
     * @param userDto 查询参数
     * @return
     */
    PageInfo<User> findUserPage(UserDto userDto);
}
