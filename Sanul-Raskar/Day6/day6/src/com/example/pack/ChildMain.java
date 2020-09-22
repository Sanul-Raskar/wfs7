package com.example.pack;

public class ChildMain {

	public static void main(String[] args) {
		
		ChildThread c = new ChildThread("child1");
		c.start();
		
		ChildThread c1 = new ChildThread("child2");
		c1.start();

	}

}
