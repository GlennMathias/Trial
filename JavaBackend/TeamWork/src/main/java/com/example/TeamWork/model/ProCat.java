package com.example.TeamWork.model;

public class ProCat {

	int ProCatid;
	String ProName;
	public int getProCatid() {
		return ProCatid;
	}
	public void setProCatid(int proCatid) {
		ProCatid = proCatid;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	public ProCat(int proCatid, String proName) {
		super();
		ProCatid = proCatid;
		ProName = proName;
	}
	public ProCat() {
		super();
	}
	@Override
	public String toString() {
		return "ProCat [ProCatid=" + ProCatid + ", ProName=" + ProName + "]";
	}
	
	
	
}
