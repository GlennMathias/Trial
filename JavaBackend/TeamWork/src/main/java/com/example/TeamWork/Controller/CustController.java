package com.example.TeamWork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TeamWork.DAO.CustDAO;
import com.example.TeamWork.model.Customer;
import com.example.TeamWork.model.Product;

@RestController
public class CustController {
	
	@Autowired
	public CustDAO custDao ;
	
	
	
	@GetMapping("/name/{id}")
	public String getName(@PathVariable("id") int id)
	{
		return custDao.getName(id);
	}
	
	@GetMapping("/update/{oldPassword}/{newPassword}/{id}")
	public boolean updatePassword(@PathVariable("oldPassword") String oldPass,@PathVariable("newPassword") String newPass,@PathVariable("id") int id)
	{
		return custDao.updatePassword(oldPass, newPass, id);	
		
	}
	
	
	@PostMapping("/addCustomer")
	public void addCustomer(@RequestBody Customer c)
	{
		custDao.signup(c);
	}
	
	
	@GetMapping("/name/{name}/{password}")
	public String getName(@PathVariable("name") String name,@PathVariable("password") String password)
	{
		return custDao.loginValidation(name,password);
	}
	
	
	
}
