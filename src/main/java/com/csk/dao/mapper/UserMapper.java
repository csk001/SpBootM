package com.csk.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.csk.domain.UserInfo;

@Mapper
public interface UserMapper {
    /* *
     * 功能描述 :查询
     * @author csk
     * @date 2019/3/8
     * @param [name]
     * @return com.csk.domain.UserInfo
     */
    UserInfo queryUser(String name);

    /* *
     * 功能描述 ；查询所有用户
     * @author csk
     * @date 2019/3/8
     * @param
     * @return
     */
    UserInfo queryAllUser(String name);
    /* *
     * 功能描述 ：新增
     * @author csk
     * @date 2019/3/8
     * @param
     * @return
     */
    Integer addUser(UserInfo user);
}
