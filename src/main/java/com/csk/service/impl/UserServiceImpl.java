package com.csk.service.impl;

import com.csk.dao.mapper.CourseMapper;
import com.csk.dao.mapper.UserMapper;
import com.csk.domain.Course;
import com.csk.domain.UserInfo;
import com.csk.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private CourseMapper courseMapper;

    @Override
    public UserInfo query(String name) {
        return userMapper.queryUser(name);
    }

    @Override
    public UserInfo queryALL(String name) {
        return userMapper.queryAllUser(name);
    }

    @Override
    public List<Course> queryCourseALL(String id) {
        return courseMapper.queryAllCourse(id);
    }

    @Override
    public String save(UserInfo user) {
        userMapper.addUser(user);
        return String.valueOf(user.getId());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    //Transactional :默认RuntimeException（运行时异常），这种异常时才会进行数据回滚
    public String saveTrans(UserInfo user) {
        userMapper.addUser(user);
        System.out.println("addUser success");
        int a = Integer.valueOf(user.getClassId());
        return "add success";
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    //@Transactional 直接这样，sql异常不起作用
    public String saveSqlExce(UserInfo user) {
        userMapper.addUser(user);
        System.out.println("saveSqlExce success");
        try {
            int a = Integer.valueOf(user.getClassId());
        }catch (Exception ex){
            System.out.println("saveSqlExce 捕捉了异常，不起作用，不回滚");
        }

        return "add success";
    }
//    @Override
//    @Transactional
//    //@Transactional 直接这样，sql异常spring处理了能捕捉到回滚
//    public String saveSqlExce(UserInfo user) {
//        userMapper.addUser(user);
//        System.out.println("saveSqlExce success");
//        user.setGender(1002912);
//        userMapper.addUser(user);
//        return "add success";
//    }

}
