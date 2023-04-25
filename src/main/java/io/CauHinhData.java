package io;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.CauHinh;

public class CauHinhData {
	
	public static List<CauHinh> withsStatus(int status){
		List<CauHinh> list = new ArrayList<CauHinh>();
		try {
			Timestamp time = new Timestamp(System.currentTimeMillis());
			String sql = "SELECT * FROM cauhinh WHERE timestart > '" + time + "'";
			System.out.println(sql);
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				CauHinh c = new CauHinh();
				c.setId(res.getInt("id"));
				c.setData(ItemData.parseItems(res.getString("data")));
				c.setTime(res.getTimestamp("timestart"));
				c.setStatus(res.getInt("status"));
				c.setType(res.getInt("type"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	public static List<CauHinh> all(){
		List<CauHinh> list = new ArrayList<CauHinh>();
		try {
			String sql = "SELECT * FROM cauhinh ORDER BY timestart DESC";
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				CauHinh c = new CauHinh();
				c.setId(res.getInt("id"));
				c.setData(ItemData.parseItems(res.getString("data")));
				c.setTime(res.getTimestamp("timestart"));
				c.setStatus(res.getInt("status"));
				c.setType(res.getInt("type"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	public static boolean insert(CauHinh c) {
		try {
			String sql = "INSERT INTO cauhinh(id, data, timestart, type) VALUES(null, ?, ?, ?)";
			var ps = DBConnect.getConn().prepareStatement(sql);
			ps.setString(1, ItemData.parseJson(c.getData()));
			ps.setTimestamp(2,c.getTime());
			ps.setInt(3, c.getType());
			int row = ps.executeUpdate();
			return row == 1;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	public static final int STATUS_DANG_HOAT_DONG = 1;
	
	public static final int STATUS_CHO_THAY_DOI = 0;
	
	public static final int STATUS_DA_HUY = -1;
	
	public static final int TYPE_KHOI_SINH_HOAT = 1;
	
	public static final int TYPE_KHOI_HANH_CHINH = 2;
	
	public static final int TYPE_KHOI_KINH_DOANH = 3;
	
	public static final int TYPE_KHOI_SAN_XUAT = 4;
	

}
