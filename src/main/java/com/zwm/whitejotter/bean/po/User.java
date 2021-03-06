package com.zwm.whitejotter.bean.po;

import lombok.Data;

/**
 * @ClassName: User
 * @Description: 用户实体类
 * @Author: zhangweiming
 * @Date: 19:19 2021/3/6
 * @Version: 1.0
 */
@Data
public class User {

    private Integer id;
    private String username;
    private String password;
}
