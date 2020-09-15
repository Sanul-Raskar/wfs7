package com.hsbc.pack;

class SeventhOOP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		p1.name="Vinay";
		p1.age=24;
		p1.address="Delhi";
		
		Person p2=new Person();
		p2.name="Vinay";
		p2.age=28;
		p2.address="Delhi";
		
		Person p3=new Person();
		Person p4=new Person();
		
		if(p1.equals(p2)) {
			System.out.println("Person are same");
		}
		else
			System.out.println("Different Persons");
		System.out.println("Person 1 : "+p1);
		System.out.println("Person 2 : "+p2);
	
		
		if(p3==p4)
			System.out.println("Both objects are same means having same existence");
		else
			System.out.println("Objects have different existence");
	}

	
	
}
class Person{
	String name="";
	int age=0;
	String address="";
	
	@Override
	public boolean equals(Object obj) {
		Person tempPerson=(Person)obj;
		return tempPerson.age==this.age;
		
	}
	
	
	
}