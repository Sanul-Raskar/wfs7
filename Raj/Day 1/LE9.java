import java.util.*;
class Loops{
	public static void main(String uselessArray[]){
		//given limit in question
		int n = 200;
		//starting values:  keeping it in double datatype so as to avoid overflow
		double value1=0,value2=1;
		System.out.println(value1+" ");
		//staring the loop from 0 and ending till 200
		for(int i=0;i<=200;i++){
			System.out.println(value1+" ");
			//next number 
			value1 = value2;
			value2 = value2+value1;
		}
	}
}