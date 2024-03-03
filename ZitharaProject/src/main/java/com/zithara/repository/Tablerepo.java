package com.zithara.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zithara.dto.TableDeatils;

@Repository
public interface Tablerepo extends JpaRepository<TableDeatils , Integer>
{
	
	@Query("SELECT name FROM table_deatils WHERE sNo=?1")
	String getNameBysNo(int sNo);
	
	@Query("SELECT location FROM table_deatils WHERE sNo=?1")
	String getLocationBysNo(int sNo);

}
