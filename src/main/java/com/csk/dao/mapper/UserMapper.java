package com.csk.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.csk.domain.UserInfo;

@Mapper
public interface UserMapper {
 
   UserInfo queryUser(String name);
}
