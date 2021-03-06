package com.zwm.whitejotter.utils;

import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @ClassName: MyStringUtils
 * @Description: 字符串工具类
 * @Author: zhangweiming
 * @Date: 22:22 2021/3/6
 * @Version: 1.0
 */
public class MyStringUtils {

    /**
     * @MethodName: startsWith
     * @Description: 判断str是否由prefixs中的prefix开头
     * @Param: [str, prefixs]
     * @Return: java.lang.Boolean
     * @Author: zhangweiming
     * @Date: 22:28 2021/3/6
     * @Version: 1.0
     */
    public static Boolean startsWith(String str, List<String> prefixs) {

        for (String prefix: prefixs) {
            if (StringUtils.startsWith(str, prefix)) {
                return true;
            }
        }
        return false;
    }
}
