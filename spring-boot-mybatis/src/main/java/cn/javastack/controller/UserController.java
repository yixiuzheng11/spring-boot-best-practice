package cn.javastack.controller;

import cn.javastack.dto.UserDto;
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

    @RequestMapping("/findAll")
    public List<User> findAll(UserDto userDto){
        return userService.findAll(userDto);
    }

    @RequestMapping("/findPage")
    public PageInfo<User> findPage(UserDto userDto){
        return userService.findPage(userDto);
    }
}
