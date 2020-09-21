package com.example.dao.impl;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import com.example.dao.interfaces.IRecord;
import com.example.model.Record;

public class RecordFileImplementation implements IRecord {

	@Override
	public void saveRecord(ArrayList<Record> recordList) {
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream("records.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

			for (int i = 0; i < recordList.size(); i++) {
				objectOut.writeObject(recordList.get(i));
			}

			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("The records were succesfully written to file records.txt");

	}

	@Override
	public void sortRecords(ArrayList<Record> recordList) {
		Collections.sort(recordList);
		System.out.println("\nSorting Records:");
		for (int i = 0; i < recordList.size(); i++) {
			System.out.println(recordList.get(i));
		}
	}

	@Override
	public ArrayList<Record> readRecords() {
		boolean flag = false;
		ArrayList<Record> records = new ArrayList<>();
		FileInputStream fis;

		try {
			fis = new FileInputStream("records.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (!flag) {
				try {
					Record r = (Record) ois.readObject();
					records.add(r);
				} catch (EOFException e) {
					flag = true;
				}
			}

			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return records;
	}

}
