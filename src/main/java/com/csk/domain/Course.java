package com.csk.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: csk
 * @Date: 2019/3/6 16:01
 * @Version: 1.0
 */
//如果是代理类，由于无法标记在属性或方法上，所以，可以标记在类声明上；也作用于反序列化时的字段解析；
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Course implements Serializable {

    private static final long serialVersionUID = -8784728410441803053L;

    private String cname;

    private String cid;

    private String teacher;
    //关联用户集合
    private List<UserInfo> users;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<UserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<UserInfo> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("cname='").append(cname).append('\'');
        sb.append(", cid='").append(cid).append('\'');
        sb.append(", teacher='").append(teacher).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
