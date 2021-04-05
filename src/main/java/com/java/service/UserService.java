package com.java.service;

import java.util.List;
import java.util.Map;

import com.java.dao.UserDao;
import com.java.entity.User;

/**
 * 用户service接口
 * @author Administrator
 *
 */
public interface UserService {
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
