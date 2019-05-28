package com.csk.service;

import com.csk.domain.Course;
import com.csk.domain.UserInfo;

import java.util.List;

public interface UserService {
	
	UserInfo query(String name);

	UserInfo queryALL(String name);

	List<Course> queryCourseALL(String id);

	String save(UserInfo user);

	String saveTrans(UserInfo user);

	String saveSqlExce(UserInfo user);

}
