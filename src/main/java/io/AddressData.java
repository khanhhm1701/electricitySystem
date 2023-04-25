package io;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import commom.Util;
import model.Item;


public class AddressData {
		
	public HashMap<String, String> city = new HashMap<String, String>();
	
	public HashMap<String, String> district = new HashMap<String, String>();
	
	public HashMap<String, String> ward = new HashMap<String, String>();
	
	public static AddressData instance = null;
	
	public AddressData() {
		try {
			Statement ps = DBConnect.getConn().createStatement();
			ResultSet res = ps.executeQuery("SELECT * FROM address WHERE id=1");
			if (res.next()) {
				String text = res.getString("data");
				JSONArray jsa = (JSONArray) JSONValue.parse(text);
				for (var item : jsa) {
					JSONObject job = (JSONObject) item;
					String cityId = job.get("Id").toString();
					String cityName = job.get("Name").toString();
					String cityDistricte = job.get("Districts").toString();
					city.put(cityId, cityName);
					JSONArray jsa2 = (JSONArray) JSONValue.parse(cityDistricte);
					for (var item2 : jsa2) {
						JSONObject job2 = (JSONObject) item2;
						String districteId = job2.get("Id").toString();
						String districteName = job2.get("Name").toString();
						String districteWards = job2.get("Wards").toString();
						district.put(districteId, districteName);
						JSONArray jsa3 = (JSONArray) JSONValue.parse(districteWards);
						for (var item3 : jsa3) {
							JSONObject job3 = (JSONObject) item3;
							try {
								String wardId = job3.get("Id").toString();
								String wardName = job3.get("Name").toString();
								ward.put(wardId, wardName);
							} catch (Exception e){
							}
						}
						
					}
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
	}
	
	public static AddressData gI() {
		if (instance == null) {
			instance = new AddressData();
		}
		return instance;
	}
	public static void main(String[] args) {
		AddressData.gI();
		System.out.println(AddressData.gI().city.size() + " | " + AddressData.gI().district.size() + " | " + AddressData.gI().ward.size());
	}
	
}