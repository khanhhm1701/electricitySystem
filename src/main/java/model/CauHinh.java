package model;

import java.sql.Timestamp;

public class CauHinh {
	
	private int id;
	
	private Item[] data;
	
	private Timestamp time;
	
	private int status;
	
	private int type;
	
	private String name = "";
	
	public String getName() {
		if (this.name.equals("")) {
			String[] arr = {"Kh?i sinh ho?t", "Kh?i hành chính", "Kh?i s?n xu?t", "Kh?i kinh doanh"};
			this.name = arr[this.type - 1];
		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CauHinh() {
		
	}
	
	public CauHinh(int id, Item[] data, Timestamp time, int status, int type) {
		this.id = id;
		this.data = data; 
		this.time = time;
		this.status = status;
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Item[] getData() {
		return data;
	}

	public void setData(Item[] data) {
		this.data = data;
	}
	
	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}