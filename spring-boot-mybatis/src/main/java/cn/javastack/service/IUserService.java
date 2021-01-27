package cn.javastack.service;

import cn.javastack.dto.UserDto;
import cn.javastack.model.User;
import com.github.pagehelper.PageInfo;

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
     * 分页查询用户
     *
     * @param userDto 查询参数
     * @return
     */
    PageInfo<User> findAllUser(UserDto userDto);
}
