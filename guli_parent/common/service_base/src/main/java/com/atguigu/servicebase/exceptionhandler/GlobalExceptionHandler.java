package com.atguigu.servicebase.exceptionhandler;

import com.atguigu.commonutils.R;
<<<<<<< HEAD
import lombok.extern.slf4j.Slf4j;
=======
>>>>>>> edcf48c36b644807e6857cfcd9f39068ee7b1f46
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
<<<<<<< HEAD
@Slf4j
=======
>>>>>>> edcf48c36b644807e6857cfcd9f39068ee7b1f46
public class GlobalExceptionHandler {

    //指定出现什么异常执行这个方法
    @ExceptionHandler(Exception.class)
    @ResponseBody //为了返回数据
    public R error(Exception e) {
        e.printStackTrace();
        return R.error().message("执行了全局异常处理..");
    }
<<<<<<< HEAD

    //特定异常
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody //为了返回数据
    public R error(ArithmeticException e) {
        e.printStackTrace();
        return R.error().message("执行了ArithmeticException异常处理..");
    }

    //自定义异常
    @ExceptionHandler(GuliException.class)
    @ResponseBody //为了返回数据
    public R error(GuliException e) {
        log.error(e.getMessage());
        e.printStackTrace();

        return R.error().code(e.getCode()).message(e.getMsg());
    }

=======
>>>>>>> edcf48c36b644807e6857cfcd9f39068ee7b1f46
}
