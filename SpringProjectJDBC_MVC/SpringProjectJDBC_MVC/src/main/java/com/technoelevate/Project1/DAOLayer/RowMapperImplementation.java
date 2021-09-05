package com.technoelevate.Project1.DAOLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.Project1.DTO.DTO_Class;

public class RowMapperImplementation implements RowMapper<DTO_Class>{

	public DTO_Class mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		DTO_Class dto=new DTO_Class();
		
		dto.setUsername(rs.getString(1));
		dto.setPasskey(rs.getString(2));
		dto.setUserid(rs.getString(3));
		
		return dto;
	}

	
}
