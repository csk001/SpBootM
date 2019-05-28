package com.csk.controller;

import com.csk.domain.Course;
import com.csk.domain.UserInfo;
import com.csk.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
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
    private UserServiceImpl userService;

    private Locale locale = LocaleContextHolder.getLocale();

    @RequestMapping("/hello")
    public String hello() {

        return "Hello Spring Boot!";
    }

    @RequestMapping("/speak")
    public String speak() {

        return "Hello，" + name;
    }

    @RequestMapping("/null")
    public String testNull(String value) {

        if (value.equals("aaa")) {
            return "null  in....";
        }
        return "error......";
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

    @RequestMapping("/addUserTest")
    public String addUserTest(@RequestBody UserInfo user2) {
        LOG.info(" ===> start addUserTest:{}", user2);
        if (user2 == null) {
            return "Is fail";
        }
        user2.setLoginTime(new Date());
        return userService.saveTrans(user2);
    }

    @RequestMapping("/userAll")
    public UserInfo info(String name) {
        //如果开启延迟加载，则这里只会查询user信息，不查询关联信息
        UserInfo user = userService.queryALL(name);
        LOG.info("...queryALL success");
        //这里用到关联信息，所以会查询sql
        String teacher = user.getCourseInfo().getTeacher();
        LOG.info("...teacher:{}", teacher);
        return null;
    }

    @RequestMapping("/courseAll")
    public List<Course> courseAll(String id) {
        List<Course> cs = userService.queryCourseALL(id);
        LOG.info("...courseAll success");
        return cs;
    }

    @RequestMapping("/addUserSqlTest")
    public String addUserSqlTest(@RequestBody UserInfo user) {
        LOG.info(" --> start addUserSqlTest:{}", user);
        if (user == null) {
            return "Fail";
        }
        user.setLoginTime(new Date());
        return userService.saveSqlExce(user);
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody UserInfo user) {
        LOG.info(" --> start addUser:{}", user);
        if (user == null) {
            return "Fail";
        }
        user.setLoginTime(new Date());
        return userService.save(user);
    }
}
