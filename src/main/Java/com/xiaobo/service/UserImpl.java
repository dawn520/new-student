package com.xiaobo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaobo.dao.UserMapper;
import com.xiaobo.pojo.Login;
import com.xiaobo.pojo.User;

@Service
public class UserImpl implements Userservice {

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		int i = userMapper.insert(user);
		
		System.out.println(i+"success");
		
		
	}


}
