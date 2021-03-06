package com.zwm.whitejotter.result;

import lombok.AllArgsConstructor;

/**
 * @ClassName: ResultCode
 * @Description: 结果状态码枚举类
 * @Author: zhangweiming
 * @Date: 20:17 2021/3/6
 * @Version: 1.0
 */
@AllArgsConstructor
public enum ResultCode {

    SUCCESS(200),
    FAIL(400),
    INTERNAL_ERROR(500);
    public Integer code;
}
