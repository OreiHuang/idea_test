/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MangerTest
 * Author:   mnelg
 * Date:     2019/3/30 22:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bjsxt.test;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mnelg
 * @create 2019/3/30
 * @since 1.0.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class MangerTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest(){
        User user = new User();
        user.setName("张飞");
        user.setBirthday(new Date());
        user.setAddress(null);
        this.userMapper.insertUser(user);
    }

}