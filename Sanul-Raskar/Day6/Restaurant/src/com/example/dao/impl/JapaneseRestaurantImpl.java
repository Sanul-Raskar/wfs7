package com.example.dao.impl;

import com.example.dao.Restaurant;

public class JapaneseRestaurantImpl implements Restaurant {

	@Override
	public String prepareFood(String item) {
		// TODO Auto-generated method stub
		return item+" prepared by Japanese Restaurant";
	}

}
