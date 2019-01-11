package com.haut.bean;

public class GoodsList {

	private int gid;
	private String gname;
	private double gprice;
	private int gnum;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getGprice() {
		return gprice;
	}
	public void setGprice(double gprice) {
		this.gprice = gprice;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public GoodsList(int gid, String gname, double gprice, int gnum) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gnum = gnum;
	}
	public GoodsList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
