package io;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.CauHinh;
import model.User;

public class UserData {

	public static List<User> withAddress(String city, String district, String ward) {
		List<User> list = new ArrayList<User>();
		String sql = "";
		if (city != null && city.length() > 0) {
			if (district != null && district.length() > 0) {
				if (ward != null && ward.length() > 0) {
					sql = "SELECT id, email FROM user WHERE tinh='" + city + "' and huyen='" + district + "' and xa='"
							+ ward + "'";
				} else {
					sql = "SELECT id, email FROM user WHERE tinh='" + city + "' and huyen='" + district + "'";
				}
			} else {
				sql = "SELECT id, email FROM user WHERE tinh='" + city + "'";
			}
		} else {
			sql = "SELECT id, email FROM user";
		}
		try {
			System.out.println("SQL: " + sql);
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				User user = new User();
				user.setId(res.getInt("id"));
				user.setEmail(res.getString("email"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static List<User> all() {
		List<User> list = new ArrayList<User>();
		try {
			String sql = "SELECT * FROM user";
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			while (res.next()) {
				User user = new User();
				user.setId(res.getInt("id"));
				user.setUsername(res.getString("username"));
				user.setPassword(res.getString("password"));
				user.setEmail(res.getString("email"));
				user.setTinh(res.getString("tinh"));
				user.setHuyen(res.getString("huyen"));
				user.setXa(res.getString("xa"));
				user.setRole(res.getInt("role"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static User withId(int id) {
		try {
			String sql = "SELECT * FROM user WHERE id=" + id;
			var ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery(sql);
			if (res.next()) {
				User user = new User();
				user.setId(res.getInt("id"));
				user.setUsername(res.getString("username"));
				user.setPassword(res.getString("password"));
				user.setEmail(res.getString("email"));
				user.setTinh(res.getString("tinh"));
				user.setHuyen(res.getString("huyen"));
				user.setXa(res.getString("xa"));
				user.setRole(res.getInt("role"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean insert(User u) {
		try {
			String sql = "INSERT INTO user(id, username, password, email, tinh, huyen, xa, role) VALUES(null, ?, ?, ?, ?, ?, ?, ?)";
			var ps = DBConnect.getConn().prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getTinh());
			ps.setString(5, u.getHuyen());
			ps.setString(6, u.getXa());
			ps.setInt(7, u.getRole());
			int row = ps.executeUpdate();
			return row == 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
