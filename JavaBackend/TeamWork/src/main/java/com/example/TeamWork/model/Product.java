package com.example.TeamWork.model;

public class Product {
	
	int ProId;
	int ProCatId;
	String ProName;
	String ProDes;
	int ProPrice;
	String ProdImg;
	public int getProId() {
		return ProId;
	}
	public void setProId(int proId) {
		ProId = proId;
	}
	public int getProCatId() {
		return ProCatId;
	}
	public void setProCatId(int proCatId) {
		ProCatId = proCatId;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	public String getProDes() {
		return ProDes;
	}
	public void setProDes(String proDes) {
		ProDes = proDes;
	}
	public int getProPrice() {
		return ProPrice;
	}
	public void setProPrice(int proPrice) {
		ProPrice = proPrice;
	}
	public String getProdImg() {
		return ProdImg;
	}
	public void setProdImg(String prodImg) {
		ProdImg = prodImg;
	}
	public Product(int proId, int proCatId, String proName, String proDes, int proPrice, String prodImg) {
		super();
		ProId = proId;
		ProCatId = proCatId;
		ProName = proName;
		ProDes = proDes;
		ProPrice = proPrice;
		ProdImg = prodImg;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [ProId=" + ProId + ", ProCatId=" + ProCatId + ", ProName=" + ProName + ", ProDes=" + ProDes
				+ ", ProPrice=" + ProPrice + ", ProdImg=" + ProdImg + "]";
	}
	
	

}
