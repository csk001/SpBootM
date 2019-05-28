package com.csk.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 *
 * @Author: 88397353
 * @Date: 2019/5/28
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response handleMethod(Exception ex) {
        log.error("ExceptionHandle -->>", ex);
        Response response = new Response();
        response.setError("E0001", ex.getMessage());
        return response;
    }
}
