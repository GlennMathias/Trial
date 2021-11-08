package com.example.TeamWork.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.TeamWork.DAO.CartDAO;
import com.example.TeamWork.model.Cart;


@RestController
public class OrderDetailsController {
	int i=1;
	
	@Autowired
	CartDAO cartDao;
	
	@GetMapping("/userLogin/{id}")
	public void userLogin(@PathVariable ("id") int custId)
	{
		cartDao.createOrder(custId);
	}
	
	@GetMapping("/addCart/{id}/{qty}")
	public void addCart(@PathVariable ("id") int ProdId,@PathVariable ("qty") int qty)
	{
		
		cartDao.addToCart(ProdId,qty);
		
	}
	
	@GetMapping("/viewCart/{id}")
	public List<Cart> viewCart(@PathVariable ("id") int custId)
	{
		return cartDao.viewCart(custId);
	}
	
	
	
	@GetMapping("/remove")
	public void flush()
	{
		
		cartDao.payOut();
	}

}