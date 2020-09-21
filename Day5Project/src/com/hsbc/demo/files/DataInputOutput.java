package com.hsbc.demo.files;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataInputOutput {

	public static void main(String[] args) {

		try {

			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

//			DataOutputStream dos = new DataOutputStream(new FileOutputStream("employee.txt"));
//			while (true) {
//				System.out.print("Enter Name : ");
//				String name = b.readLine();
//				dos.writeUTF(name);
//				
//				System.out.print("Enter Age : ");
//				int age = Integer.parseInt(b.readLine().trim());
//				dos.writeInt(age);
//
//				System.out.print("Enter Salary : ");
//				int salary = Integer.parseInt(b.readLine().trim());
//				dos.writeInt(salary);
//
//				System.out.print("Enter More (Y/N) : ");
//				String choice = b.readLine();
//				if (!choice.toUpperCase().equals("Y")) {
//					break;
//				}
//			}
//			dos.close();
			DataInputStream di=new DataInputStream(new FileInputStream("employee.txt"));
			
			while(true) {
				
				System.out.print(di.readUTF()+", ");
				System.out.print(di.readInt()+", ");
				System.out.print(di.readInt()+"\n");
				
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		catch (EOFException e) {
			// TODO: handle exception
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
