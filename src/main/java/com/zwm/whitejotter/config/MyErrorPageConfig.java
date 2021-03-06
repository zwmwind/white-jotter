package com.zwm.whitejotter.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @ClassName: MyErrorPageConfig
 * @Description: 错误页配置类，用于整合Vue3.0
 * @Author: zhangweiming
 * @Date: 22:31 2021/3/6
 * @Version: 1.0
 */
@Configuration
public class MyErrorPageConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        registry.addErrorPages(new ErrorPage(
                HttpStatus.NOT_FOUND,
                "/index.html"
        ));
    }
}
