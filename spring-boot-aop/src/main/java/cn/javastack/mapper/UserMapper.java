package cn.javastack.mapper;

import cn.javastack.dto.UserDto;
import cn.javastack.entity.User;
import cn.tk.MyMapper;

import java.util.List;

/**
 * @author 0164631
 */
public interface UserMapper extends MyMapper<User> {
    /**
     * @param userDto
     * @return
     */
    public List<User> findUserList(UserDto userDto);
}