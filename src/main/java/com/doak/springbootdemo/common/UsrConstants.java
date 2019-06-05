package com.doak.springbootdemo.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="usr")
public class UsrConstants {
	
	public static String usrname ; 
	public  static String  age;
	
	//写上getter和setter方法
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	} 

}
