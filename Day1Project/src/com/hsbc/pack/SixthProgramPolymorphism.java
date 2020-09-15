package com.hsbc.pack;

public class SixthProgramPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persons p=new Persons();
		Employee  e=new Employee();
		
	}

}

class Parent{
	
}
class APerson{
	String name="";
	int age=0;
	String address ="";
	
}

class Employee extends APerson{
	
	int salary=0;
	String location="";
	
}

class Sibling{}
class Friend{}
class Persons{
	
	public void anger(Parent p) {
		
	}
	public void anger(Sibling p) {
		
	}
	public void anger(Friend p) {
		
	}
}