package com.example.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

import com.example.dao.interfaces.IRecord;
import com.example.model.Address;
import com.example.model.Customer;
import com.example.model.Product;
import com.example.model.Record;

public class Caller {

	public static void main(String[] args) {

		String cName, city, state, pName, flag = "y", num;
		int price;
		ArrayList<Record> recordList = new ArrayList<>();

		Properties prop = new Properties();
		String strs = "";
		try {
			prop.load(new FileInputStream("application.properties"));
			strs = (String) prop.get("com.example.dao.impl.RecordDAO");
		} catch (IOException e) {
			e.printStackTrace();
		}

		IRecord fileImplObj = null;
		try {
			fileImplObj = (IRecord) Class.forName(strs).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (flag.equals("y")) {
			try {
				System.out.println("Enter customer name");
				cName = br.readLine();

				System.out.println("Enter customer city");
				city = br.readLine();

				System.out.println("Enter customer state");
				state = br.readLine();

				System.out.println("How many products you purchased?");
				num = br.readLine();
				int n = Integer.parseInt(num);

				ArrayList<Product> productList = new ArrayList<>();
				for (int i = 0; i < n; i++) {
					System.out.println("Enter product name");
					pName = br.readLine();
					System.out.println("Enter product price");
					price = Integer.parseInt(br.readLine());
					productList.add(new Product(pName, price));
				}

				recordList.add(new Record(new Customer(cName, new Address(city, state)), productList));

				System.out.println("Do you want to enter more records? [y/n]");
				flag = br.readLine();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		fileImplObj.sortRecords(recordList);
		fileImplObj.saveRecord(recordList);
		ArrayList<Record> fileRecords = fileImplObj.readRecords();

		System.out.println("\nRecords retrieved from file");
		for (int i = 0; i < fileRecords.size(); i++) {
			System.out.println(fileRecords.get(i));
		}
	}

}
