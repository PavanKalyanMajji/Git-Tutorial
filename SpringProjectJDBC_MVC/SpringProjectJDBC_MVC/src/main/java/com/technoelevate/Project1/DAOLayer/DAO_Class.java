package com.technoelevate.Project1.DAOLayer;

import com.technoelevate.Project1.DTO.DTO_Class;

import java.util.*;

import org.springframework.jdbc.core.RowMapper;

public interface DAO_Class {
	
	public boolean addEmployee(DTO_Class dto,String userName,String userPassword,String user_id);
	
	public List<DTO_Class> getEmployee();
	
	public boolean deleteEmployee(String name);
	
	public List<DTO_Class> authentication(String name,String password);
	
	public List<DTO_Class> search(String name);
	
	public boolean update(String name,String password);
}
