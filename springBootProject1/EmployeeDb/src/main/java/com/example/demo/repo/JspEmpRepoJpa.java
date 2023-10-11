package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Jspemp;

public interface JspEmpRepoJpa  extends JpaRepository<Jspemp,Long>{
@Query(value="select * from Jspemp order by ename",nativeQuery=true)
	List<Jspemp> JspEmpByName();
@Query(value="select * from Jspemp where esubject='springboot' ",nativeQuery=true)
List<Jspemp> JspEmpspringBoot();
	
}
