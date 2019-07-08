package com.klaus.base.controller;

import com.klaus.base.entity.Result;
import com.klaus.base.server.Controller;
import com.klaus.base.util.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 测试控制器
 *
 * @author klaus
 * @date 2019/7/8 18:16
 */
@RestController//相当于@Controller和@ResponseBody两个注解的结合，返回json数据 但不能返回jsp，html页面，视图解析器无法解析jsp html页面
public class TestController extends Controller {

    @RequestMapping(value = "/hello")
    private Result hello(){
        return ResultUtil.success("hello Klaus");
    }
}
