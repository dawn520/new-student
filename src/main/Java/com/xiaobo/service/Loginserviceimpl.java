package com.xiaobo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaobo.dao.LoginMapper;
import com.xiaobo.pojo.Login;
import com.xiaobo.pojo.LoginExample;
import com.xiaobo.pojo.User;

@Service
public class Loginserviceimpl implements Loginservice {

	@Autowired
	private LoginMapper loginMapper;
	@Override
	public List<Login> list() throws Exception {
		// TODO Auto-generated method stub
		LoginExample loginExample=new LoginExample();
		List<Login> list = loginMapper.selectByExample(loginExample);
		return list;
	}

	@Override
	public User findUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(Login login) throws Exception {
		// TODO Auto-generated method stub
		int i = loginMapper.insert(login);
	
		
	}

}
