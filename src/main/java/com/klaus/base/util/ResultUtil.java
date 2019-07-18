package com.klaus.base.util;

import com.klaus.base.entity.Result;


/**
 * description:返回结果相关工具类
 *
 * @author klaus
 * @date 2019/7/3 11:35
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public static Result success(Object object,String msg) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage(msg);
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
