package com.example.dao.impl;

import com.example.dao.Restaurant;

public class IndianRestaurantImpl implements Restaurant {

	@Override
	public String prepareFood(String item) {
		return item+" prepared by Indian Restaurant";
	}

}
