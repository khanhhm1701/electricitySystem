package model;

import java.sql.Timestamp;

public class Bill {
	
	public Bill() {
		
	}
	
	public Bill(int id, int sodien, int tongtien, int month, int year, int status, int userId) {
		this.id = id;
		this.sodien = sodien;
		this.tongtien = tongtien;
		this.month = month;
		this.year = year;
		this.status = status;
		this.userId = userId;
	}
	
	private int id;
	
	private int sodien;
	
	private int tongtien;
	
	private int month;
	
	private int year;
	
	private int status;
	
	private int userId;
	
	private String receiveEmai;
	
	private User user;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public String getReceiveEmai() {
		return receiveEmai;
	}

	public void setReceiveEmai(String receiveEmai) {
		this.receiveEmai = receiveEmai;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSodien() {
		return sodien;
	}

	public void setSodien(int sodien) {
		this.sodien = sodien;
	}

	public int getTongtien() {
		return tongtien;
	}

	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}