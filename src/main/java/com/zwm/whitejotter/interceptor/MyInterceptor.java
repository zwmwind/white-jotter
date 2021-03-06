package com.zwm.whitejotter.interceptor;

import com.zwm.whitejotter.config.InitConfig;
import com.zwm.whitejotter.utils.MyStringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: MyInterceptor
 * @Description: 后端拦截器
 * @Author: zhangweiming
 * @Date: 21:42 2021/3/6
 * @Version: 1.0
 */
@Slf4j
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String uri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String page = StringUtils.remove(uri, contextPath + "/");
        // log.info("current request page: " + page);
        String username = (String) request.getSession().getAttribute("username");
        if (MyStringUtils.startsWith(page, InitConfig.requireAuthPages) && username == null) {
            response.sendRedirect("/login?redirect=" + page);
            return false;
        }
        return true;
    }
}
