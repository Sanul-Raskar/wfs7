package com.hsbc.demo.files;

import java.io.File;

public class FileMeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("demo");
		System.out.println("Directory : "+(f.isDirectory()?"True":"False"));
		System.out.println("Executable "+f.canExecute());
		f.setWritable(true);
		//f.setReadOnly();
		System.out.println("Readable "+f.canRead());
		System.out.println("Writable "+f.canWrite());
		System.out.println("Size "+f.length());
		if(f.isDirectory()) {
			System.out.println(f.getAbsolutePath());
			String [] files =f.list();
			for(String s:files) {
			File temp=new File(f.getPath()+"/"+s);
			System.out.println("File/Directory : "+temp.getName());
			 getDetails(temp);
			}
			
		}
		File f2=new File("demo1.txt");
		f.renameTo(f2);
		
		
		
	}
	
	public static void getDetails(File fo) {
		
		System.out.println("\t\tDirectory : "+(fo.isDirectory()?"True":"False"));
		System.out.println("\t\tExecutable "+fo.canExecute());
		System.out.println("\t\tReadable "+fo.canRead());
		System.out.println("\t\tWritable "+fo.canWrite());
		System.out.println("\t\tSize "+fo.length());
	}

}
