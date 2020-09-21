package student;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.print(" Enter Student Id : ");
       String st=sc.nextLine();
       int id=Integer.parseInt(st);
       System.out.print(" Enter Student Name : ");
       String name=sc.nextLine();
       System.out.print(" Enter Student Age : ");
       st=sc.nextLine();
       int age=Integer.parseInt(st);
       System.out.print(" Enter Student Degree : ");
       String degree=sc.nextLine();
       System.out.print(" Enter Student Toatl Marks : ");
       st=sc.nextLine();
       double tm=Double.parseDouble(st);
       System.out.print(" Enter Student Percentage : ");
       st=sc.nextLine();
       double per=Double.parseDouble(st);
       Student student=new Student(id, age, name, degree, tm, per);
       System.out.println(student);
       sc.close();
	}

}
