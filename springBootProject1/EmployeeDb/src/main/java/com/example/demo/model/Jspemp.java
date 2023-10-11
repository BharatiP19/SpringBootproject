package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Jspemp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long empid;
private long phone;
private String ename;
private String esubject;
private String email;
public long getEmpid() {
	return empid;
}
public void setEmpid(long empid) {
	this.empid = empid;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEsubject() {
	return esubject;
}
public void setEsubject(String esubject) {
	this.esubject = esubject;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
