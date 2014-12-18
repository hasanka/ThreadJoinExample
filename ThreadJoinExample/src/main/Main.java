package main;

import logic.TimeBomb;

public class Main {

	public static void main(String[] args) {
		Thread t = new Thread(new TimeBomb(), "THREAD_ONE");
		try {
			t.start();
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Boom Boom");		
	}
}
