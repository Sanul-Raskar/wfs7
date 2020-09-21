package com.hsbc.day2;

public class VariableArgs {

			int add(int ...a){
				int b=0;
				for(int i : a)
					b = b + i;
				
				return b;
			}
			
			int sub(int ...a){
				int b=0;
				for(int i : a)
					b = i - b;
				
				return b;
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgs obj = new VariableArgs();
		
		System.out.println("Addition is "+ obj.add(1,2,3,4,5,6,7,8));
		System.out.println("Subtraction is "+ obj.sub(8,4,2));
		
	}

}
