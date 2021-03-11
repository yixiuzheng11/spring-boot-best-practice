package cn.javastack.service.impl;

import cn.javastack.dto.UserDto;
import cn.javastack.entity.User;
import cn.javastack.mapper.UserMapper;
import cn.javastack.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 0164631
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return userMapper.insert(user);
    }

    @Override
    public List<User> findUserList(UserDto userDto) {
        List<User> userList = userMapper.findUserList(userDto);
        return userList;
    }

    @Override
    public PageInfo<User> findUserPage(UserDto userDto) {
        //将参数传给这个方法就可以实现物理分页了，非常简单
        PageHelper.startPage(2, 10);
        List<User> userList = userMapper.findUserList(userDto);
        PageInfo result = new PageInfo(userList);
        return result;
    }

    /**
     * 根据用户名称查询用户
     *
     * @param userName 查询参数
     * @return
     */
    @Override
    public User findByName(String userName) {
        return userMapper.findByName(userName);
    }
}
