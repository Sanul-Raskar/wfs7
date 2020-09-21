package com.hsbc.demo.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.hsbc.demo.files.model.Address;
import com.hsbc.demo.files.model.Person;

public class ObjectReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address("Delhi","Delhi");
		Person p=new Person("Mohit",34,add,new Date(2015,9,01));
		//Person p=new Person();
		System.out.println(p);
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("person.dat"));
			out.writeObject(p);
			out.close();
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p=null;
		System.out.println(p);
		try {
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("person.dat"));
			p=(Person)oi.readObject();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p);
	}

}
