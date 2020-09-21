package com.hsbc.demo.files;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			FileWriter fw=new FileWriter("sample.txt");
			
			String str=br.readLine();
			if(str.equals("exit")) {
				br.close();
				fw.close();
				System.exit(0);
			}
			else {
				fw.write(str);
				fw.write("\n");
				while(true) {
					System.out.println(str);
					str=br.readLine();
					if(str.equals("exit"))
						{
						br.close();
						fw.close();
						System.exit(0);
						}
					else
						fw.write(str);
					fw.write("\n");
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
