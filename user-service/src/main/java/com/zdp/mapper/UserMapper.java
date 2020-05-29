package com.zdp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zdp.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author sesshomaru
 * @date 2020/5/29
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Delete("delete from t_user where id = #{id}")
    int myDel(@Param("id")Integer id);
}
