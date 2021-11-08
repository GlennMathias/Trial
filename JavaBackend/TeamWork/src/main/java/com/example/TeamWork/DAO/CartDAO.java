package com.example.TeamWork.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.TeamWork.model.Cart;

@Repository
public interface CartDAO {
	
	public void addToCart(int prodId,int qty);
	public void createOrder(int CustId);
	public void payOut();
	public List<Cart> viewCart(int CustId);
}
