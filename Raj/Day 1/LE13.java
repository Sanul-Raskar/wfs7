import java.util.*;
class Eggs{
	Eggs(){
		this.gross = 0;
		this.dozen = 0;
		this.left = 0;
	}
	int gross,dozen,left;
	static Scanner input = new Scanner(System.in);
	public static void main(String array[]){
		//number of eggs
		int n;
		System.out.print("Enter the number of Eggs: ");
		n = input.nextInt();
		//encapsulating the egg data;
		Eggs eggs = new Eggs();
		eggs.gross = n/144;
		n = n%144;		//left
		eggs.dozen = n/12;	
		n = n%12;   		//left
		eggs.left = n;
  		System.out.println("Your number of eggs is "+eggs.gross+" gross, "+eggs.dozen+" dozen, and "+eggs.left);
	}	
}