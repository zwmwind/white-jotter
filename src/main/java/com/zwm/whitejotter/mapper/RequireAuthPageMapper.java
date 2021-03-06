package com.zwm.whitejotter.mapper;

import com.zwm.whitejotter.bean.po.RequireAuthPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @InterfaceName: RequireAuthPageMapper
 * @Description: 后端拦截器数据Mapper
 * @Author: zhangweiming
 * @Date: 22:12 2021/3/6
 * @Version: 1.0
 */
@Mapper
public interface RequireAuthPageMapper {

    /**
     * @MethodName: selectAll
     * @Description: 查询所有requireAuthPage
     * @Param: []
     * @Return: java.util.List<com.zwm.whitejotter.bean.po.RequireAuthPage>
     * @Author: zhangweiming
     * @Date: 22:17 2021/3/6
     * @Version: 1.0
     */
    List<RequireAuthPage> selectAll();
}
