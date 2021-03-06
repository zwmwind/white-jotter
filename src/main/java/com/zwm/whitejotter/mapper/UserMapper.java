package com.zwm.whitejotter.mapper;

import com.zwm.whitejotter.bean.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: UserMapper
 * @Description: 用户Mapper接口
 * @Author: zhangweiming
 * @Date: 19:35 2021/3/6
 * @Version: 1.0
 */
@Mapper
public interface UserMapper {

    User selectById(Integer id);

    User selectByUsername(String username);

    User selectByUsernameAndPassword(String username, String password);
}
