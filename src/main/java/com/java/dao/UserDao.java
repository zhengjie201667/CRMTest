package com.java.dao;

import java.util.List;
import java.util.Map;

import com.java.entity.User;

/**
 * 
 * @author Administrator
 *
 */
public interface UserDao {

	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User login(User user);
	
	/**
	 * 查询用户集合
	 * @param map
	 * @return
	 */
	public List<User> find(Map<String, Object> map);
	
	/**
	 * 查询总记录数
	 * @param map
	 * @return
	 */
	public long getTotal(Map<String, Object> map);
}
