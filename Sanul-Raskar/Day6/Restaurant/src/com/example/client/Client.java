package com.example.client;

import com.example.dao.Restaurant;
import com.example.dao.impl.IndianRestaurantImpl;
import com.example.factory.RestaurantFactory;
import com.example.service.RoomService;

public class Client {

	public static void main(String[] args) {

		//Restaurant r = new IndianRestaurantImpl();
		
		RoomService rs = new RoomService(new RestaurantFactory().create("ind"));
		
		System.out.println(rs.takeOrder("Dosa"));
	}

}
