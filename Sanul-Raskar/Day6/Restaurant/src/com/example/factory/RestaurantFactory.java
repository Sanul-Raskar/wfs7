package com.example.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.example.dao.Restaurant;

public class RestaurantFactory {

	static Properties prop = new Properties();
	
	static {
		try {
			prop.load(new FileInputStream("factory.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Restaurant create(String type) {
		
		String strs = (String) prop.get(type);
		try {
			Restaurant obj = (Restaurant) Class.forName(strs).newInstance();
			return obj;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
