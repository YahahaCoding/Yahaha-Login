package com.yahaha.cloud.auth.dao;

import com.yahaha.cloud.auth.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
	int createUser(User user);

	User selectOneByAccount(@Param("account") String account);

	int updatePassword(User user);
}
