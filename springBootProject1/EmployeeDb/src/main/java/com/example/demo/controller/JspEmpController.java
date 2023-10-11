package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Jspemp;
import com.example.demo.service.JspEmpService;

@RestController
@RequestMapping("/api")
public class JspEmpController {
	@Autowired
	JspEmpService service;
	@PostMapping("/Jspemp")
	public ResponseEntity<Jspemp> saveJspEmp( @RequestBody Jspemp emp){
		return new ResponseEntity<Jspemp>(service.saveJspEmp(emp),HttpStatus.CREATED);
		
	}
	
	public List<Jspemp>getAllEmp(){
	return service.getAllEmp();
	}

	public ResponseEntity<Jspemp>JspEmpById(@PathVariable("id") long id){
		return new ResponseEntity<Jspemp>(service.JspEmpById(id),HttpStatus.OK);
	}
	@GetMapping("Employee/Byname")
	public List<Jspemp> JspEmpByName(){
		return service.JspEmpByName();
		
	}
	@GetMapping("Employee/Springboot")
	public List<Jspemp> JspEmpSpringBoot()
	{
		return service.JspEmpSpringBoot();
	}
	
	public ResponseEntity<Jspemp> updateJspEmp( @RequestBody Jspemp emp ,@PathVariable("id") long id){
		return new ResponseEntity(service.updatejspEmp(emp,id),HttpStatus.OK);
}
}
