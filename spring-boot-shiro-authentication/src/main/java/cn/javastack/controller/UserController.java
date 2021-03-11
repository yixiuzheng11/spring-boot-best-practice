package cn.javastack.controller;

import cn.javastack.dto.UserDto;
import cn.javastack.entity.User;
import cn.javastack.service.IUserService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    //@RequestMapping(value="/addUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @RequestMapping("/addUser")
    public int addUser(@RequestBody UserDto userDto){
        logger.info("新增用户{}", JSON.toJSONString(userDto));
        return userService.addUser(userDto);
    }

    @RequestMapping("/findUserList")
    public List<User> findUserList(UserDto userDto){
        logger.info("查询用户列表{}", JSON.toJSONString(userDto));
        return userService.findUserList(userDto);
    }

    @RequestMapping("/findUserPage")
    public PageInfo<User> findUserPage(UserDto userDto){
        logger.info("分页查询用户{}", JSON.toJSONString(userDto));
        return userService.findUserPage(userDto);
    }
}
