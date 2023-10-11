package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Jspemp;
import com.example.demo.repo.JspEmpRepoJpa;
import com.example.demo.service.JspEmpService;
@Service
public class JspEmpServiceImpl implements JspEmpService {
	@Autowired
JspEmpRepoJpa repo;
	@Override
	public Jspemp saveJspEmp(Jspemp emp) {
		repo.save(emp);
		return repo.save(emp) ;
		
	}
	@Override
	public List<Jspemp> getAllEmp() {
		
		return repo.findAll();
	}
	@Override
	public Jspemp JspEmpById(long id) {
		Optional<Jspemp> emp=repo.findById(id);
		if(emp.isPresent())
		{
			return emp.get();
		}
	
		else
		{
			throw new ResourceNotFoundException("Employee","ID",id);
		}
	}
	@Override
	public List<Jspemp> JspEmpByName() {
		
		return repo.JspEmpByName();
	}
	public List<Jspemp> JspEmpSpringBoot()
	{
		return repo.JspEmpspringBoot();
	}
	@Override
	public Jspemp updatejspEmp(Jspemp emp, long id) {
		
	 Jspemp existingEmp=repo.findById(id).orElseThrow (() -> new ResourceNotFoundException("Employee","ID",id));
	existingEmp.setEsubject(emp.getEsubject());
	existingEmp.setEname(emp.getEname());
	existingEmp.setEmail(emp.getEmail());
	existingEmp.setPhone(emp.getPhone());
	repo.save(existingEmp);
	return existingEmp;
	}

}
