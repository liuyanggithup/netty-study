package com.githup.liuyanggithup.user.controller;

import com.githup.liuyanggithup.netty.annotation.Action;
import com.githup.liuyanggithup.user.model.User;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	
	
	@Action("saveUser")
	public Object save(User user){
		System.out.println(user.getName());
		return user.getName();
	}

}
