package com.xiaobo.service;

import java.util.List;

import com.xiaobo.pojo.Login;
import com.xiaobo.pojo.User;

public interface Userservice {

public List<User> list() throws Exception;
	
	public User findUserById(Integer id) throws Exception;
	
	public void updateUser(User userInformation) throws Exception;
}
