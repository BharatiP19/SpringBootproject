package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException {
	
private static final long serialVersionUID=1L;
private String Resource;
private String Fieldname;
private Object FieldValue;
public ResourceNotFoundException(String resource, String fieldname, Object fieldValue) {
	super();
	Resource = resource;
	Fieldname = fieldname;
	FieldValue = fieldValue;
}
public String getResource() {
	return Resource;
}
public void setResource(String resource) {
	Resource = resource;
}
public String getFieldname() {
	return Fieldname;
}
public void setFieldname(String fieldname) {
	Fieldname = fieldname;
}
public Object getFieldValue() {
	return FieldValue;
}
public void setFieldValue(Object fieldValue) {
	FieldValue = fieldValue;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

}
