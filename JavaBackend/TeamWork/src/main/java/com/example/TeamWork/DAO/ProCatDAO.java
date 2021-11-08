package com.example.TeamWork.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.TeamWork.model.ProCat;

@Repository
public interface ProCatDAO {
	
	public List<ProCat> viewCat();
	
	public void addCategory(ProCat pc);
	
	public void updateCategory(ProCat pc);

}
