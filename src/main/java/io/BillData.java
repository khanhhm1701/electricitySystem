package io;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bill;
import model.CauHinh;
import model.User;

public class BillData {
	
	public static List<Bill> all(){
		List<Bill> list = new ArrayList<Bill>();
		try {
			String sql = "SELECT hoadon.*, user.username FROM hoadon INNER JOIN user on user.id=hoadon.userId";
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				Bill bill = new Bill();
				bill.setId(res.getInt("id"));
				bill.setUserId(res.getInt("userId"));
				bill.setStatus(res.getInt("status"));
				bill.setSodien(res.getInt("sodien"));
				bill.setTongtien(res.getInt("tongtien"));
				bill.setMonth(res.getInt("month"));
				bill.setYear(res.getInt("year"));
				
				User user = new User();
				user.setUsername(res.getString("username"));
				bill.setUser(user);
				
				list.add(bill);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	
	public static List<Bill> withUserId(int userId){
		List<Bill> list = new ArrayList<Bill>();
		try {
			String sql = "SELECT * FROM hoadon WHERE userId=" + userId;
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				Bill bill = new Bill();
				bill.setId(res.getInt("id"));
				bill.setUserId(res.getInt("userId"));
				bill.setStatus(res.getInt("status"));
				bill.setSodien(res.getInt("sodien"));
				bill.setTongtien(res.getInt("tongtien"));
				bill.setMonth(res.getInt("month"));
				bill.setYear(res.getInt("year"));
				list.add(bill);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	public static List<Bill> withStatusAndMonth(int status, int month){
		List<Bill> list = new ArrayList<Bill>();
		try {
			String sql = "SELECT hoadon.*, user.email FROM hoadon INNER JOIN user on user.id = hoadon.userId WHERE hoadon.status=" + status + " and hoadon.month = " + month;
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				Bill bill = new Bill();
				bill.setId(res.getInt("id"));
				bill.setUserId(res.getInt("userId"));
				bill.setStatus(res.getInt("status"));
				bill.setSodien(res.getInt("sodien"));
				bill.setTongtien(res.getInt("tongtien"));
				bill.setMonth(res.getInt("month"));
				bill.setYear(res.getInt("year"));
				bill.setReceiveEmai(res.getString("email"));
				list.add(bill);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	public static List<Bill> withStatus(int status){
		List<Bill> list = new ArrayList<Bill>();
		try {
			String sql = "SELECT hoadon.*, user.email FROM hoadon INNER JOIN user on user.id = hoadon.userId WHERE hoadon.status=" + status;
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				Bill bill = new Bill();
				bill.setId(res.getInt("id"));
				bill.setUserId(res.getInt("userId"));
				bill.setStatus(res.getInt("status"));
				bill.setSodien(res.getInt("sodien"));
				bill.setTongtien(res.getInt("tongtien"));
				bill.setMonth(res.getInt("month"));
				bill.setYear(res.getInt("year"));
				bill.setReceiveEmai(res.getString("email"));
				list.add(bill);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	public static boolean insert(Bill b) {
		try {
			String sql = "INSERT INTO hoadon(id, sodien, tongtien, month, year, status, userId) VALUES(null, ?, ?, ?, ?, ?, ?)";
			var ps = DBConnect.getConn().prepareStatement(sql);
			ps.setInt(1, b.getSodien());
			ps.setInt(2, b.getTongtien());
			ps.setInt(3, b.getMonth());
			ps.setInt(4, b.getYear());
			ps.setInt(5, b.getStatus());
			ps.setInt(6, b.getUserId());
			int row = ps.executeUpdate();
			return row == 1;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	
	
	public static final int STATUS_CHUA_NOP_TIEN = 0;
	
	public static final int STATUS_DA_NOP_TIEN = 1;
	
	public static final int STATUS_QUA_HAN = 2;
}