package com.doak.springbootdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.doak.springbootdemo.common.Constants;
import com.doak.springbootdemo.common.UsrConstants;

@Controller
@RequestMapping
public class HelloController {
	
	@Autowired
	Constants  constants;
	
	@RequestMapping(value="/")
	public String index() {
//		System.out.println("hello  newFile");
		System.out.println( constants.getUsrname()  + ":::::: " + constants.getAge());
		System.out.println( constants.getDatasourceUsername());
		
//		System.out.println( Constants.usrname  + ":::::: " + constants.age);
		System.out.println( UsrConstants.usrname  + "******* " + UsrConstants.age);
		return "NewFile"; 
	}
	
	

	
}
