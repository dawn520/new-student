package com.xiaobo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaobo.pojo.Login;

import com.xiaobo.service.Loginservice;
import com.xiaobo.utils.MD5Utils;

@Controller
@RequestMapping("/login")
public class Logincontroller {
	
	//自动导入接口
	@Autowired
	private Loginservice loginservice;
	/**
	 * 
	 * @param login 登录对象
	 * @return 成功则跳转成功页面
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public String findall(String user,String pass) throws Exception
	{
		//1.判断账号或密码是否为空
		System.out.println(user+pass);
		//2.需要注意的是对同样的密码加密，得到的结果是一样的
		pass=MD5Utils.md5(pass);
		if(user!=null && pass!=null )
		{
			//2.获得从数据库得到的login对象列表
			List<Login> list = loginservice.list();
			//3.将传过来的login与数据库里的所有login对比，看是否匹配
			for (Login login2 : list) {
				
				if(user.equals(login2.getLoginUsername()) && 
						pass.equals(login2.getLoginPassword()))
				{
					//4.跳转成功页面
					return "redirect:/jsp/success.jsp";
				}
			}
			
		}
			//失败跳转失败页面
		return "redirect:/jsp/error.jsp";
	}

	


}
