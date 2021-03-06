package com.zwm.whitejotter.result;

/**
 * @ClassName: ResultFactory
 * @Description: 结果工厂类
 * @Author: zhangweiming
 * @Date: 20:20 2021/3/6
 * @Version: 1.0
 */
public class ResultFactory {

    /**
     * @MethodName: buildFailResult
     * @Description: 创建失败结果类
     * @Param: [message]
     * @Return: com.zwm.whitejotter.result.Result
     * @Author: zhangweiming
     * @Date: 20:25 2021/3/6
     * @Version: 1.0
     */
    public static Result buildFailResult(String message) {
        return buildResult(ResultCode.FAIL, message, null);
    }

    /**
     * @MethodName: buildSuccessResult
     * @Description: 创建成功结果类
     * @Param: [data]
     * @Return: com.zwm.whitejotter.result.Result
     * @Author: zhangweiming
     * @Date: 20:24 2021/3/6
     * @Version: 1.0
     */
    public static Result buildSuccessResult(Object data) {
        return buildResult(ResultCode.SUCCESS, "Success", data);
    }

    /**
     * @MethodName: buildResult
     * @Description: 根据结果状态码创建结果
     * @Param: [resultCode, message, data]
     * @Return: com.zwm.whitejotter.result.Result
     * @Author: zhangweiming
     * @Date: 20:23 2021/3/6
     * @Version: 1.0
     */
    public static Result buildResult(ResultCode resultCode, String message, Object data) {
        return buildResult(resultCode.code, message, data);
    }

    /**
     * @MethodName: buildResult
     * @Description: 创建结果
     * @Param: [code, message, data]
     * @Return: com.zwm.whitejotter.result.Result
     * @Author: zhangweiming
     * @Date: 20:21 2021/3/6
     * @Version: 1.0
     */
    public static Result buildResult(Integer code, String message, Object data) {
        return new Result(code, message, data);
    }
}
