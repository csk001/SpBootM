package com.csk.dao.mapper;


import com.csk.domain.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
    Course queryCourseInfo(String id);
    Course queryAllCourse(String id);
}
