package com.zithara.dto;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableDeatils 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sNo;
	
	private String customerName;
	
	private int age;
	
	private long phone;
	
	private String location;
	
	private Date createdAt;

}
