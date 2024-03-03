package com.zithara.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zithara.dto.TableDeatils;
import com.zithara.repository.Tablerepo;

@Service
public class TableService 
{
	@Autowired
	private Tablerepo  tablerepo;
	
	public TableDeatils  save(TableDeatils table)
	{
		return tablerepo.save(table);
	}
	
	
	public String getNameBysNo(int sNo)
	{
		return tablerepo.getNameBysNo(sNo);
	}
	
	public String getLocationBySNo(int sNo)
	{
		return tablerepo.getLocationBysNo(sNo);
	}

}
