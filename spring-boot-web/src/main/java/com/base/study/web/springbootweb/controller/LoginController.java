package com.base.study.web.springbootweb.controller;

import com.base.study.web.springbootweb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 上午10:32 2020/4/15
 * Created By CC.Z
 * Version:1.0.
 */
@RestController
public class LoginController {

	@Autowired
	private TestService testService;

	@RequestMapping("/login-success")
	public String login(HttpServletRequest request){
		return "登陆成功";
	}

	@RequestMapping("/getTest")
	public Object getData(){
      return this.testService.getData();
	}

}
