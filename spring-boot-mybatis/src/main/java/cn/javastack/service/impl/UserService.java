package cn.javastack.service.impl;

import cn.javastack.dto.UserDto;
import cn.javastack.entity.User;
import cn.javastack.entity.UserExample;
import cn.javastack.mapper.UserMapper;
import cn.javastack.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 0164631
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public int addUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return userMapper.insert(user);
    }

    @Override
    public List<User> findUserList(UserDto userDto) {
        UserExample userExample = this.initExample(userDto);
        List<User> userList = userMapper.selectByExample(userExample);
        return userList;
    }

    @Override
    public PageInfo<User> findUserPage(UserDto userDto) {
        //将参数传给这个方法就可以实现物理分页了，非常简单
        PageHelper.startPage(userDto.getPageNum(), userDto.getPageSize());
        UserExample userExample = this.initExample(userDto);
        List<User> userList = userMapper.selectByExample(userExample);
        PageInfo result = new PageInfo(userList);
        return result;
    }

    public UserExample initExample(UserDto userDto) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if(StringUtils.isNotEmpty(userDto.getUserName())) {
            criteria.andUserNameLike(userDto.getUserName());
        }
        return userExample;
    }
}
