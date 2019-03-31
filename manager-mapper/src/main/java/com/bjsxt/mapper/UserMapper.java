/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserMapper
 * Author:   mnelg
 * Date:     2019/3/30 0:52
 * Description: UserMapper
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bjsxt.mapper;

import com.bjsxt.pojo.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserMapper〉
 *
 * @author mnelg
 * @create 2019/3/30
 * @since 1.0.0
 */
public interface UserMapper {

    void insertUser(User user);

    List<User> selectUserAll();
}
