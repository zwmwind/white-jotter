package com.zwm.whitejotter.config;

import com.zwm.whitejotter.bean.po.RequireAuthPage;
import com.zwm.whitejotter.mapper.RequireAuthPageMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: InitConfig
 * @Description: 初始化配置类
 * @Author: zhangweiming
 * @Date: 21:47 2021/3/6
 * @Version: 1.0
 */
@Slf4j
@Configuration
public class InitConfig {

    @Autowired
    private RequireAuthPageMapper requireAuthPageMapper;

    public final static List<String> requireAuthPages = new ArrayList<>();

    /**
     * @ClassName: InitConfig
     * @Description: 在构造servlet结束后执行，只进行一次
     * @Author: zhangweiming
     * @Date: 21:50 2021/3/6
     * @Version: 1.0
     */
    @PostConstruct
    public void init() {
        initRequireAuthPages();
    }

    // 初始化需要拦截的数据
    public void initRequireAuthPages() {
        List<RequireAuthPage> requireAuthPagesDB = requireAuthPageMapper.selectAll();
        requireAuthPagesDB.forEach(requireAuthPageDB -> {
            requireAuthPages.add(requireAuthPageDB.getPage());
        });
    }
}
