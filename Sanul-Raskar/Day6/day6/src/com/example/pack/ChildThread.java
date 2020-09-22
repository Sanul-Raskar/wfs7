package com.example.pack;

public class ChildThread implements Runnable {

	private Thread t;

	String message;

	public ChildThread(String name) {
		super();
		this.message = name;
		System.out.println("Message: " + message);
	}

	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Running :" + message +" "+i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		t = new Thread(this,message);
		t.start();
	}
}
