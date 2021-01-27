package cn.javastack.controller;

import cn.javastack.dto.UserDto;
import cn.javastack.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value="/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    //@RequestMapping("/add")
    public int addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

    @RequestMapping("/list")
    public Object findAllUser(@RequestBody UserDto userDto){
        return userService.findAllUser(userDto);
    }
}
