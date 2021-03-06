package com.zwm.whitejotter.service.impl;

import com.zwm.whitejotter.bean.po.RequireAuthPage;
import com.zwm.whitejotter.service.RequireAuthPageService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: RequireAuthPageServiceImpl
 * @Description: 后端拦截器数据接口实现类
 * @Author: zhangweiming
 * @Date: 22:11 2021/3/6
 * @Version: 1.0
 */
@Service
public class RequireAuthPageServiceImpl implements RequireAuthPageService {
    @Override
    public List<RequireAuthPage> getRequireAuthPages() {
        return null;
    }
}
