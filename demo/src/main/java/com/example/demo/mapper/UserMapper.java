package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author JiZehan
 * @since 2020-09-04
 */
public interface UserMapper extends BaseMapper<User> {

    User selectAll();

}
