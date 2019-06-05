package com.doak.springbootdemo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doak.springbootdemo.entity.Resource;

import com.doak.springbootdemo.service.ResourceService;

import lombok.NonNull;

@Controller
@RequestMapping(value ="/system/resource")
public class ResourceController {

	@Autowired
	ResourceService resourceService; 
	
	@RequestMapping(value="/list")
	public String list(Model model,@RequestParam(required=false) @NonNull String id ) {
		System.out.println("id=" + id );
//		ssoee(id);
		List<Resource>  list =  resourceService.list();
		System.out.println(list.size());
		for(Resource res : list) {
			System.out.println(res.toString());
		}
		model.addAttribute("list", list);
		return "list";
	}
	
	public void ssoee(@NonNull String id ) {
		System.out.println("here here!!");
	}
}
