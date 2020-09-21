package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public double add(double a,double b)
    {
    	return a+b;
    }
    public double sub(double a,double b)
    {
    	return a-b;
    }
    public double multiply(double a,double b)
    {
    	return a*b;
    }
    public double div(double a,double b)throws ArithmeticException
    {
    	if(b==0)
    		throw new ArithmeticException();
    	return a/b;
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	Calculator cal=new Calculator();
    	String st;
    	double a,b;
    	try
    	{
    		while(true)
    		{
    		st=sc.nextLine();
    		a=Double.parseDouble(st);
    		if(a==0)
    			break;
    		st=sc.nextLine();
    		b=Double.parseDouble(st);
    		System.out.println(" Addition of "+a+" + "+b+" = "+cal.add(a, b));
    		System.out.println(" Subtraction of "+a+" - "+b+" = "+cal.sub(a, b));
    		System.out.println(" Multiply of "+a+" * "+b+" = "+cal.multiply(a, b));
    		System.out.println(" Division of "+a+" / "+b+" = "+cal.div(a, b));
    		}
    	}
    	catch(NumberFormatException ex)
    	{
    		System.out.println("Enter only numbers");
    	}
    	catch(ArithmeticException ex)
    	{
    		System.out.println("Cannot divide with zero");
    	}
    	sc.close();
    }
}
