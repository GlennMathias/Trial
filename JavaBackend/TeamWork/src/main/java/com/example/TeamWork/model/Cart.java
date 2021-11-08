package com.example.TeamWork.model;

public class Cart {
	
	int ordid;
	int prodid;
	int qty;
	int price;
	
	
	public int getOrdid() {
		return ordid;
	}
	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Cart(int ordid, int prodid, int qty, int price) {
		super();
		this.ordid = ordid;
		this.prodid = prodid;
		this.qty = qty;
		this.price = price;
	}
	public Cart() {
		super();
	}
	@Override
	public String toString() {
		return "Cart [ordid=" + ordid + ", prodid=" + prodid + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
	
	

}
