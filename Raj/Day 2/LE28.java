import java.util.Scanner;
class Calculator{
	static Scanner input = new Scanner(System.in);
	public static void main(String ara[]){
		System.out.print("Enter the number of elements you want to enter: ");
		int n = new input.nextInt();		
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = input.nextInt();
		}
		Calculator cal = new Calculator();
		//calling the add function
		cal.add(arr);
		//diff function	
		cal.diff(arr);
	}
	void add(int var[]){
		int sum = 0;
		//finding the arithmatic sum
		for(int i=0;i<var.length;i++)
			sum+=var[i];
		System.out.println("Sum: "+sum);
	}
	void diff(int var[]){
		int sum = 0;
		//finding the arithmatic sum
		for(int i=0;i<var.length;i++)
			sum-=var[i];
		System.out.println("Sum: "+sum);
	}
}