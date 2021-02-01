package cn.javastack.controller;

import cn.javastack.dto.UserDto;
import cn.javastack.entity.User;
import cn.javastack.service.IUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    //@RequestMapping(value="/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @RequestMapping("/add")
    public int addUser(UserDto userDto){
        return userService.addUser(userDto);
    }

    @RequestMapping("/findUserList")
    public List<User> findUserList(UserDto userDto){
        return userService.findUserList(userDto);
    }

    @RequestMapping("/findUserPage")
    public PageInfo<User> findUserPage(UserDto userDto){
        return userService.findUserPage(userDto);
    }
}
