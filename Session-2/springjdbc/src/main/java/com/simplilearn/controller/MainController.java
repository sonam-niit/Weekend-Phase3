package com.simplilearn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.dao.EProductDao;
import com.simplilearn.entity.EProductEntity;

@Controller
public class MainController {

	@Autowired
	private EProductDao dao;
	
	@GetMapping("/getdata")
	public String getData(ModelMap map) {
		List<EProductEntity> list= dao.getAllProducts();
		map.addAttribute("list",list);
		return "display";
	}
	@GetMapping("/details")
	public String getById(ModelMap map,HttpServletRequest request)
	{
		String id= request.getParameter("id");
		long uid= Long.parseLong(id);
		EProductEntity entity=dao.getProductById(uid);
		if(entity!=null)
		{
			map.addAttribute("product",entity);
			return "details";
		}
		else
		{
			return "error";
		}
			
	}
}
