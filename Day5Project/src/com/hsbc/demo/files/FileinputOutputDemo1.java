package com.hsbc.demo.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputOutputDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]=new byte[10];
		try {
			FileInputStream fi=new FileInputStream("myfile.txt");
			FileOutputStream fo=new FileOutputStream("newfile.txt");
			while(fi.read(b)!=-1) {
				fo.write(b);
				b=new byte[10];
			}
			//fo.flush();
			fo.close();
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
