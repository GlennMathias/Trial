package com.example.TeamWork.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TeamWork.DAO.ProCatDAO;
import com.example.TeamWork.model.ProCat;

@CrossOrigin(origins="*")
@RestController
public class ProCatController {
	
	@Autowired
	ProCatDAO proCatDao;

	@GetMapping("/getCategory")
	public List<ProCat> getCat()
	{
		return proCatDao.viewCat();
	}
	
	@PostMapping("/addCategory")
	public void addCategory(@RequestBody ProCat proCat)
	{
		proCatDao.addCategory(proCat);
	}
	
	@PutMapping("/updateCategory")
	public void changeCategory(@RequestBody ProCat proCat)
	{
		proCatDao.updateCategory(proCat);
	}
}
