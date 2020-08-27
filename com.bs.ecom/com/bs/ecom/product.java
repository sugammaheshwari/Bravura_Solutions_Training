package com.bs.ecom;

public class product {

	int pId;
	String pName;
	int pCost;
	
	public product()
	{
		super();
	}
	
	public product(int pId, String pName, int pCost) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
	}
	@Override
	public String toString() {
		return "product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + "]";
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpCost() {
		return pCost;
	}
	public void setpCost(int pCost) {
		this.pCost = pCost;
	}
	
	
	
}
