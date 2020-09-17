import java.io.*;
class Conventions{
	//default constructor
	Conventions(){}
	//all are Primitive datatype;
	int intVariable = 1;
	double doubleVariable = 1;
	float floatVariable = 1;
	
	final long LONG_CONSTANT= 1;
	
	static PrintStream display = System.out;
	public static void main(String dfb[]){
		Conventions conventions = new Conventions();
		display.print("All are Primitive data types: ");
		display.println("Integer variable: " + conventions.intVariable);
		display.println("Double Variable: "+ conventions.doubleVariable);
		display.println("Float Variable: "+conventions.floatVariable);
		display.println("Constent Long Variable: "+conventions.LONG_CONSTANT);
	}
}