import java.util.Scanner;
class ArrayManipulation{
	static int sum = 0;
	static float avg;
	static Scanner input = new Scanner(System.in);
	public static void main(String ar[]){
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			sum += input.nextInt();
		}
		avg = (float)sum/(float)n;
		System.out.println("sum: "+sum + "   average: "+avg);
	}
}