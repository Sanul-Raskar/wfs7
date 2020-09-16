import java.util.*;
class Swap{
	static Scanner input = new Scanner(System.in);
	public static void main(String str[]){
		int var1,var2;
		System.out.print("Enter the first variable : ");
		//Taking input
		var1 = input.nextInt();
		//Taking Sencond input
		System.out.print("Enter the Second variable : ");
		var2 = input.nextInt();
		//swaping without temperary variable
		var1 = var1+var2;
		var2 = var1-var2;
		var1 = var1-var2;
		System.out.println("First Variable: "+var1+"\nSecond Variable: "+var2);
	}
}