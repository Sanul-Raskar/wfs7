import java.util.*;
class Palindrome{
	static Scanner input = new Scanner(System.in);
	public static void main(String array[]){
		String inputValue;
		System.out.println("Enter the Value to check whether the number is Palindrome or not: ");
		inputValue = input.nextLine();
		if(check(inputValue)){
			System.out.println("Given number is a Palindrome");
		}else{
			System.out.println("Given number is not a Palindrome");
		}
	}
	static boolean check(String inputValue){
		//taking pointer to starting and the end coordinate corresponding
		int i = 0,j = inputValue.length()-1;
		//by default considering the string to be a palindrome
		boolean found = true;
		while(i<j){
			//This condition means the number is not a palindrome
			if(inputValue.charAt(i)!=inputValue.charAt(j)){
				found = false;
				break;
			}
			//incrementing the pointers
			i++;
			j--;
		}
		return found;
	}
}