package com.hsbc.demo.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.io.File f=new java.io.File("sample.txt");
		byte b[]=new byte[(int) f.length()];
		
		try {
			FileInputStream frs=new FileInputStream("sample.txt");
			frs.read(b);
			
			FileChannel fr=new FileInputStream("sample.txt").getChannel();
			FileChannel fw=new FileOutputStream("demoSample.txt").getChannel();
			
			
			System.out.println(fr.size());
			ByteBuffer buff=java.nio.ByteBuffer.allocate((int) fr.size());
			fr.read(buff);
			buff.position(6);
			fw.write(buff);
			
			fw.write(buff);
			
			

			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
