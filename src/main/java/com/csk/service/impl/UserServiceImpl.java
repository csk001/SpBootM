package com.csk.service.impl;

import com.csk.dao.mapper.CourseMapper;
import com.csk.dao.mapper.UserMapper;
import com.csk.domain.Course;
import com.csk.domain.UserInfo;
import com.csk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    public Course queryCourseALL(String id) {
        return courseMapper.queryAllCourse(id);
    }

    @Override
    public String save(UserInfo user) {
        userMapper.addUser(user);
        return String.valueOf(user.getId());
    }

}
