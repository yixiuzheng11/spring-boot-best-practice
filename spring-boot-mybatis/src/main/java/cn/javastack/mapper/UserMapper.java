package cn.javastack.mapper;

import cn.javastack.entity.User;
import cn.javastack.entity.UserExample;
import cn.javastack.utils.MyMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends MyMapper<User> {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}