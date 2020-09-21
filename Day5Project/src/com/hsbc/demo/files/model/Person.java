package com.hsbc.demo.files.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

	
	 private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
		 ois.defaultReadObject();
		 //setDoj(new Date());
		 
	 }
	 private void writeObject(ObjectOutputStream oos) throws IOException,ClassNotFoundException{
		 oos.defaultWriteObject();
		 
		 
	 }

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name;
	
	 int age;
	Address address;
	transient Date doj;
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Person(String name, int age, Address address, Date doj) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.doj = doj;
	}
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", doj=" + doj + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
