package com.doak.springbootdemo.common;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.Versioned;


@Component
public class Constants {

	@Value("${usr.usrname}")
	public  String usrname ; 
	@Value("${usr.age}")
	public  String  age;
	
	@Value("${spring.datasource.username}")
	public String datasourceUsername;
	
	
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


	public String getDatasourceUsername() {
		return datasourceUsername;
	}


	public void setDatasourceUsername(String datasourceUsername) {
		this.datasourceUsername = datasourceUsername;
	}
	
	
	
	
	
	
	
	
}
