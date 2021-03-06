package com.zwm.whitejotter.service;

import com.zwm.whitejotter.bean.po.RequireAuthPage;

import java.util.List;

/**
 * @InterfaceName: RequireAuthPageService
 * @Description: 后端权限数据Service接口
 * @Author: zhangweiming
 * @Date: 21:56 2021/3/6
 * @Version: 1.0
 */
public interface RequireAuthPageService {

    List<RequireAuthPage> getRequireAuthPages();
}
