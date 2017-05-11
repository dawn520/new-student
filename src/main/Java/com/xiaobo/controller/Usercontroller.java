package com.xiaobo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaobo.pojo.Login;
import com.xiaobo.pojo.User;
import com.xiaobo.service.Loginservice;
import com.xiaobo.service.Userservice;
import com.xiaobo.utils.MD5Utils;

@Controller
@RequestMapping("/user")
public class Usercontroller {

	@Autowired
	private Userservice userservice;
	@Autowired
	private Loginservice loginservice;
	
	/**
	 * 
	 * @param user 传进来的用户名
	 * @param password 传进来的用户密码
	 * @param sex	性别
	 * @param college 学院
	 * @param classes 班级
	 * @param phone 电话
	 * @param emali 邮件
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insert")
	public String insert(HttpServletRequest request,String user,String password,Integer sex,String college,String classes
			,String phone,String emali) throws Exception
	{
		//1.对密码进行加密
		password=MD5Utils.md5(password);
		//插入到登录表中
		User user1=new User();
		Login login=new Login();
		login.setLoginUsername(user);
		login.setLoginPassword(password);
		loginservice.updateUser(login);
	
		//2.获取数据库登录表的值，是一个list
		List<Login> list = loginservice.list();
	
		
		//将传过来的值填入到用户信息表
		user1.setUserClass(classes);
		user1.setUserCollege(college);
		user1.setUserEmail(emali);
		user1.setUserPassword(password);
		
		user1.setUserSex((byte)sex.intValue());
		user1.setUserPhone(phone);
		user1.setUserUsername(user);
		user1.setUserCreatetime(new Date().toString());
		//将将已经注册的登录id给用户表关联注册表的外键login_id
		user1.setUserLoginid(list.get(list.size()-1).getLoginId());
		userservice.updateUser(user1);
		
		//返回到登录页面
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/check")
	@ResponseBody
	public String check(Model model,HttpServletRequest request) throws Exception
	{
		String string = request.getParameter("user_code");
		
		List<Login> list = loginservice.list();
		for (Login login : list) {
			if(login.getLoginUsername().equals(string))
			{
				return "no";
			}
		}
		
		return "yes";
		
	}
	
}
