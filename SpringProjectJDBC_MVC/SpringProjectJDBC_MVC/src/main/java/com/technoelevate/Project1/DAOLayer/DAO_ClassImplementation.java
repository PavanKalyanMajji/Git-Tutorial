package com.technoelevate.Project1.DAOLayer;


import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.Project1.DTO.DTO_Class;

public class DAO_ClassImplementation implements DAO_Class{
	
	JdbcTemplate template;


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public boolean addEmployee(DTO_Class dto,String userName,String userPassword,String user_id) {
		String query="insert into jdbc.register values(?,?,?)";
		int add=template.update(query,userName,userPassword,user_id);
		return true;
	}

	public List<DTO_Class> getEmployee() {
		RowMapper<DTO_Class> rowmap=new RowMapperImplementation();
		String query1="select * from jdbc.register";
		List<DTO_Class> list=template.query(query1, rowmap);
		return list;
	}

	public boolean deleteEmployee(String name) {
		String query="delete from jdbc.register where userName=?";
		template.update(query,name);
		return true;
	}

	public List<DTO_Class> authentication(String name,String password) {
		
		String query="select * from jdbc.register where username='"+name+"' and userpassword='"+password+"'";
		List<DTO_Class> list=template.query(query,new RowMapperImplementation());
		
		return list.size()>0 ? list:null;
	}

	public List<DTO_Class> search(String name) {
		
		String query="select * from jdbc.register where username='"+name+"'";
		List<DTO_Class> list=template.query(query,new RowMapperImplementation());
		return list.size()>0 ? list:null;
	}

	public boolean update(String name, String password) {
		String query="update  jdbc.register set userPassword=? where userName='"+name+"'";
		template.update(query,password);
		return true;
	}

}
