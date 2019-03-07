package com.csk.controller;

import com.csk.domain.UserInfo;
import com.csk.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Locale;

/**
 * RestController相当于@Controller+@ResponseBody两个注解的结合，返回json数据;
 * 方法无法返回jsp页面，或者html，配置的视图解析器 InternalResourceViewResolver不起作用
 */
@RestController
@RequestMapping("customer")
public class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Value("${config.name}")
    private String name;

    private MessageSource messageSource;

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Resource
    UserServiceImpl userService;

    Locale locale = LocaleContextHolder.getLocale();

    @RequestMapping("/hello")
    public String hello() {

        return "Hello Spring Boot!";
    }

    @RequestMapping("/speak")
    public String speak() {

        return "Hello，" + name;
    }

    //	@RequestParam
//	这个注解用来绑定单个请求数据，既可以是url中的参数，也可以是表单提交的参数和上传的文件,不能处理JSON格式
    @RequestMapping("/lang")
    public String lang(@RequestParam(required = false) String lang) {
        if (lang == null) {
            return "null";
        }
        String msg = messageSource.getMessage(lang, null, locale);
        return msg;
    }

    @RequestMapping("/query")
    public String query(String name) {
        UserInfo user = userService.query(name);
        LOG.info("query success");
        if (user == null) {
            return "Fail" + name;
        }

        return "Hello，" + user.getUsername() + " beforeTime: " + user.getLoginTime();
    }

    @RequestMapping("/info")
    public UserInfo info(String name) {
        UserInfo user = userService.query(name);

        return user;
    }
}
