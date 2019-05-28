package com.csk.dao.mapper;

import com.csk.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    Course queryCourseInfo(String id);
    List<Course> queryAllCourse(String id);
}
