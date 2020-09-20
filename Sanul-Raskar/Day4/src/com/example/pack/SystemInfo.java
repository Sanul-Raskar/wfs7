package com.example.pack;

public class SystemInfo {

	public static void main(String[] args) {
		System.out.println("JAVA Version: " + System.getProperty("java.version"));
		System.out.println("JAVA Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Class Path: " + System.getProperty("java.class.path"));
		System.out.println("Installed HOME Directory: " + System.getProperty("java.home"));
		System.out.println("Operating System: " + System.getProperty("os.name"));
	}

}
