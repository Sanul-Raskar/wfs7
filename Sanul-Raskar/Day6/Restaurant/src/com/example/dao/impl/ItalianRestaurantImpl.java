package com.example.dao.impl;

import com.example.dao.Restaurant;

public class ItalianRestaurantImpl implements Restaurant {

	@Override
	public String prepareFood(String item) {
		// TODO Auto-generated method stub
		return item+" prepared by Italian Restaurant";
	}

}
