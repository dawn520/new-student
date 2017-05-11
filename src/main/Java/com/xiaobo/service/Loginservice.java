package com.xiaobo.service;

import java.util.List;

import com.xiaobo.pojo.Login;
import com.xiaobo.pojo.User;

public interface Loginservice {

public List<Login> list() throws Exception;
	
	public User findUserById(Integer id) throws Exception;
	
	public void updateUser(Login login) throws Exception;
}
