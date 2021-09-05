package com.technoelevate.Project1.ServiceLayer;

import java.util.List;

import com.technoelevate.Project1.DTO.DTO_Class;

public interface ServiceInterface {

	
	public boolean addEmployee(DTO_Class dto);
	
	public List<DTO_Class> getEmployee();
	
	public boolean deleteEmployee(String name);
	
	public boolean authentication(String name,String password);
	
	public boolean search(String name);
	
	public boolean update(String name,String password);
}
