package com.example.dao.interfaces;

import java.util.ArrayList;

import com.example.model.Record;

public interface IRecord {
	public void saveRecord(ArrayList<Record> recordList);

	public void sortRecords(ArrayList<Record> recordList);

	public ArrayList<Record> readRecords();

}
