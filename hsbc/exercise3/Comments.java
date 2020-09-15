package com.hsbc.exercise3;			//Package name

//Class name
public class Comments {

	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Datatypes
		int a=9;		//Integer Datatype
		String d="";	//String Datatype
		char c='d';		//Character Datatype
		int MaxValue=9999;		//Pascal case variable name
		System.out.println("This is java program with Comments.");		//Printing value on console
		
		//Class, object and its method
		PascalCaseClass p = new PascalCaseClass();			//Creating object of the class
		p.otherMethod();									//Calling method of using object of that class
	
		//Loop
		for(int t=0;t<2;t++) {								//for loop 
			System.out.println("The value of t is::"+t);	//Printing values
		}
	}

}

//Class name as per Pascal Standard of naming conventions
class PascalCaseClass {
	
	//Method name with camelCase standard of naming conventions
	public void otherMethod() {
		System.out.println("In other method with camelCase naming convention of the method");
	}
}
