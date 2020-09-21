package com.hsbc.demo.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
			BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("demo.txt"));
			String str="";
			while((str=br.readLine())!=null) {
				bw.write(str);
				bw.write("\n");
			}
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
