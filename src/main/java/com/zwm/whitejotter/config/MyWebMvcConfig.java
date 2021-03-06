package com.zwm.whitejotter.config;

import com.zwm.whitejotter.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: MyWebMvcConfig
 * @Description: WebMvc配置类
 * @Author: zhangweiming
 * @Date: 21:07 2021/3/6
 * @Version: 1.0
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    /**
     * @ClassName: MyWebMvcConfig
     * @Description: CORS配置
     * @Author: zhangweiming
     * @Date: 21:08 2021/3/6
     * @Version: 1.0
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("*")
                // 开启后支持跨域下Cookie的传送
                .allowCredentials(true)
                .allowedOriginPatterns("*")
                .allowedHeaders("*");
    }

    /**
     * @MethodName: addInterceptors
     * @Description: 注册拦截器
     * @Param: [registry]
     * @Return: void
     * @Author: zhangweiming
     * @Date: 22:45 2021/3/6
     * @Version: 1.0
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/index.html");
    }

    /**
     * @MethodName: getMyInterceptor
     * @Description: MyInterceptor Bean
     * @Param: []
     * @Return: com.zwm.whitejotter.interceptor.MyInterceptor
     * @Author: zhangweiming
     * @Date: 22:46 2021/3/6
     * @Version: 1.0
     */
    @Bean
    public MyInterceptor getMyInterceptor() {
        return new MyInterceptor();
    }
}
