package com.example.service;

import com.example.dao.Restaurant;

public class RoomService {

	Restaurant restaurant;

	public RoomService(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	public String takeOrder(String order) {
		return restaurant.prepareFood(order);
	}
}
