package com.example.l010userlistview;


public class CustomListCellData {

	private String userName;
	private String dsc;
	private int iconid;
	
	public CustomListCellData(String userName, String dsc, int iconid) {
		this.userName = userName;
		this.dsc = dsc;
		this.iconid = iconid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	public int getIconid() {
		return iconid;
	}

	public void setIconid(int iconid) {
		this.iconid = iconid;
	}

	
}
