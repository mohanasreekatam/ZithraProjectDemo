package com.zithara.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zithara.dto.TableDeatils;
import com.zithara.service.TableService;

@RestController
@RequestMapping("/Zithra")
public class TableController 
{
	@Autowired
	private TableService service;
	
	
	@PostMapping("/insert")
	public TableDeatils create(TableDeatils table)
	{
		return service.save(table);
	}
	
	@GetMapping("/name/{sNo}")
	public String getNameTable(int sNo)
	{
		return service.getNameBysNo(sNo);
	}
	
	@GetMapping("/location/{sNo}")
	public String getLocationTable(int sNo)
	{
		return service.getLocationBySNo(sNo);
	}
}





