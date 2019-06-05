package com.doak.springbootdemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doak.springbootdemo.mapper.ResourceMapper;

@Service
public class ResourceService {
	
	@Autowired
	ResourceMapper resourceMapper;
	
	public List<com.doak.springbootdemo.entity.Resource> list(){
		return resourceMapper.selectByPage(0L, 10L);
	}

}
