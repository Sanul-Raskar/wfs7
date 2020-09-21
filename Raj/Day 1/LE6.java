import java.util.*;
class LeapYear{
	static Scanner input = new Scanner(System.in);
	public static void main(String array[]){
		System.out.print("Enter the year: ");
		int inputYear= input.nextInt();
		if(inputYear<0){
			System.out.println("Enter a valid Year");
			//Calling the main Method again
			LeapYear.main(new String[1]);
		}
		else{
			//Year devisible by 4 is always a leap Year 
			if(inputYear%4==0)
				System.out.println("It is a Leap Year!!");
			else
				System.out.println("Not A Leap Year");
		}
	}

}