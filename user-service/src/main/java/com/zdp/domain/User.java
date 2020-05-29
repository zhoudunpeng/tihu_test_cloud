package com.zdp.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author sesshomaru
 * @date 2020/5/29
 */
@TableName(value = "t_user")
public class User {

    private Long id;

    private String name;

    private Integer sex;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public User(Long id, String name, Integer sex, String remark) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.remark = remark;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", remark='" + remark + '\'' +
                '}';
    }
}
