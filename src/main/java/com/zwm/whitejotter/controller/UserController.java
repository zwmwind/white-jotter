package com.zwm.whitejotter.controller;

import com.zwm.whitejotter.bean.po.User;
import com.zwm.whitejotter.result.Result;
import com.zwm.whitejotter.result.ResultFactory;
import com.zwm.whitejotter.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

/**
 * @ClassName: UserController
 * @Description: 用户相关控制器
 * @Author: zhangweiming
 * @Date: 19:31 2021/3/6
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpSession httpSession;

    @PostMapping("/login")
    public Result login(@RequestBody User requestUser) {
        String username = HtmlUtils.htmlEscape(requestUser.getUsername());
        User user = userService.findByUsernameAndPassword(username, requestUser.getPassword());
        if (user != null) {
            httpSession.setAttribute("username", username);
            log.info("login success, username: " + username);
            return ResultFactory.buildSuccessResult(username);
        }
        String message = "login fail, incorrect account or password";
        log.info("login fail, username: " + username);
        return ResultFactory.buildFailResult(message);
    }
}
