package com.zwm.whitejotter.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: Result
 * @Description: 结果类
 * @Author: zhangweiming
 * @Date: 20:20 2021/3/6
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class Result {

    private Integer code;
    private String message;
    private Object data;
}
