class Calculator {

	public  static void main(String arra[]){
		Calculator cal = new Calculator();
		//both int
		cal.add(1,2);
		//both double
		cal.add((double)1,(double)2);
		//first double and second int
		cal.add((double)1,2);
		//first int sencond double 
		cal.add(1,(double)2);
	}
	void add(int num1,int num2){
		System.out.println(num1+" + "+num2+" = "+(num1 + num2));
	}
	void add(double num1,double num2){
		System.out.println(num1+" + "+num2+" = "+(num1 + num2));
	}
	void add(double num1,int num2){
		System.out.println(num1+" + "+num2+" = "+(num1 + num2));
	}
	void add(int num1,double num2){
		System.out.println(num1+" + "+num2+" = "+(num1 + num2));
	}
}	