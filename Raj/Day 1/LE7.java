import java.util.*;
class LargestNumber{
    	static Scanner input = new Scanner(System.in);
	public static void main(String useLessArray[]){
		int var1,var2,var3;
		//taking input of all the three variable
		System.out.print("input first variable: ");
		var1 = input.nextInt();
		System.out.print("input second variable: ");
		var2 = input.nextInt();
		System.out.print("input third variable: ");
		var3 = input.nextInt();
		//mentaining the highest value in var3
		System.out.println(var1+"  "+var2+"  "+var3);
		if(var1>=var2){
			if(var3<var1)
				var3=var1;
		}else{
			if(var3<var2)
				var3 = var2;
		}
		System.out.println("The Largest value is: "+var3);
	}
}