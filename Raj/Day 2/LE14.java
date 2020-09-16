import java.util.*;
class ObjectCreation{
	static Scanner input = new Scanner(System.in);
	int num;
	ObjectCreation(){
		
	}
	ObjectCreation(int x){
		this.num = x;
	}
	public static void main(String out[]){
		//creating the object and passing value in the constructor 
		System.out.println("Enter the first number: ");
		ObjectCreation object1 = new ObjectCreation(input.nextInt());
		System.out.println("Enter the first number: ");
		ObjectCreation object2 = new ObjectCreation(input.nextInt());
		//addition:
		object1.add(object2);
		object1.diff(object2);
		object1.mul(object2);
		object1.div(object2);
	}
	//member function;
	//add
	void add(ObjectCreation obj){
		System.out.println(this.num+" + "+obj.num+" = "+(this.num + obj.num));
	}
	//difference
	void diff(ObjectCreation obj){
		System.out.println(this.num+" - "+obj.num+" = "+(this.num - obj.num));
	}
	//multiplication	
	void mul(ObjectCreation obj){
		System.out.println(this.num+" * "+obj.num+" = "+(this.num * obj.num));
	}
	//division
	void div(ObjectCreation obj){
		System.out.println(this.num+" / "+obj.num+" = "+(this.num / obj.num));
	}
	
}