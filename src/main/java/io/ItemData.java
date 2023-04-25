package io;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import model.Item;

public class ItemData {
	
	public static String parseJson(Item[] data) {
		JSONArray arr = new JSONArray();
		for (var item : data) {
			JSONObject job = new JSONObject();
			job.put("id", Integer.valueOf(item.getId()));
			job.put("price", Float.valueOf(item.getPrice()));
			arr.add(job);
		}
		return arr.toJSONString();
	}
	
	public static Item[] parseItems(String data){
		JSONArray job = (JSONArray) JSONValue.parse(data);
		Item[] items = new Item[job.size()];
		int index = 0;
		for (var obj : job) {
			JSONObject job2 = (JSONObject) obj;
			items[index++]  = new Item(Integer.parseInt(job2.get("id").toString()), Float.parseFloat(job2.get("price").toString()));
		}
		return items;
	}


}
