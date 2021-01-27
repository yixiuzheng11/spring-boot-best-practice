package cn.javastack.service.impl;

import cn.javastack.dao.UserDao;
import cn.javastack.dto.UserDto;
import cn.javastack.model.User;
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
    private UserDao userDao;

    @Override
    public int addUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return userDao.insert(user);
    }

    @Override
    public PageInfo<User> findAllUser(UserDto userDto) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(userDto.getPageNum(), userDto.getPageSize());
        List<User> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }
}
