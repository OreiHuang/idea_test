/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   mnelg
 * Date:     2019/3/30 0:49
 * Description: User
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bjsxt.pojo;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈User〉
 *
 * @author mnelg
 * @create 2019/3/30
 * @since 1.0.0
 */
public class User {

    private Integer id;
    private String name;
    private Date birthday;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}