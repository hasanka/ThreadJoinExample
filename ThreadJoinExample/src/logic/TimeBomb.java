package logic;

public class TimeBomb implements Runnable{

	private String[] array = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	
	@Override
	public void run() {
		for (int i = 9 ; i >= 0 ; i--) {
			try {
				System.out.println(array[i]);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
