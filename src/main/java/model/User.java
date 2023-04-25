package model;

import io.AddressData;

public class User {
	private int id;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String tinh;
	
	private String huyen;
	
	private String xa;
	
	private String txtTinh;
	
	private String txtHuyen;
	
	private String txtXa;
	
	private int role;

	public User() {
		
	}
	
	public User(int id, String username, String password, String email, String tinh, String huyen, String xa,
			int role) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.tinh = tinh;
		this.huyen = huyen;
		this.xa = xa;
		this.role = role;
	}

	public String getTxtTinh() {
		if (txtTinh == null) {
			txtTinh = AddressData.gI().city.get(tinh);
		}
		return txtTinh;
	}
	
	public String getTxtHuyen() {
		if (txtHuyen == null) {
			txtHuyen = AddressData.gI().district.get(huyen);
		}
		return txtHuyen;
	}
	
	public String getTxtXa() {
		if (txtXa == null) {
			txtXa = AddressData.gI().ward.get(xa);
		}
		return txtXa;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTinh() {
		return tinh;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	
}
