package com.csk.service;

import com.csk.domain.Course;
import com.csk.domain.UserInfo;

public interface UserService {
	
	UserInfo query(String name);

	UserInfo queryALL(String name);

	Course queryCourseALL(String id);

	String save(UserInfo user);

}
