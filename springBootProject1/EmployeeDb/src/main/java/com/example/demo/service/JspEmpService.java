package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Jspemp;

public interface JspEmpService {
	//to save employee
	Jspemp saveJspEmp(Jspemp emp);
 //to get all employee
	List<Jspemp>getAllEmp();
	//to get employee by id
	Jspemp JspEmpById(long id);
//
	List<Jspemp> JspEmpByName();

	List<Jspemp> JspEmpSpringBoot();
	
	//edit employee deatails
	Jspemp updatejspEmp(Jspemp emp,long id);
	
}
