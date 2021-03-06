package com.zwm.whitejotter.service;

import com.zwm.whitejotter.bean.po.User;

/**
 * @ClassName: UserService
 * @Description: 用户Service接口
 * @Author: zhangweiming
 * @Date: 19:33 2021/3/6
 * @Version: 1.0
 */
public interface UserService {

    /**
     * @MethodName: findById
     * @Description: 根据用户id查找用户
     * @Param: [id]
     * @Return: com.zwm.whitejotter.bean.po.User
     * @Author: zhangweiming
     * @Date: 19:35 2021/3/6
     * @Version: 1.0
     */
    User findById(Integer id);

    /**
     * @MethodName: exist
     * @Description: 是否存在该用户名
     * @Param: [username]
     * @Return: java.lang.Boolean
     * @Author: zhangweiming
     * @Date: 20:13 2021/3/6
     * @Version: 1.0
     */
    Boolean exist(String username);

    /**
     * @MethodName: findByUsername
     * @Description: 根据用户名查找用户
     * @Param: [username]
     * @Return: com.zwm.whitejotter.bean.po.User
     * @Author: zhangweiming
     * @Date: 20:13 2021/3/6
     * @Version: 1.0
     */
    User findByUsername(String username);

    /**
     * @MethodName: get
     * @Description: 根据用户名和密码查找用户
     * @Param: [username, password]
     * @Return: com.zwm.whitejotter.bean.po.User
     * @Author: zhangweiming
     * @Date: 20:14 2021/3/6
     * @Version: 1.0
     */
    User findByUsernameAndPassword(String username, String password);
}
