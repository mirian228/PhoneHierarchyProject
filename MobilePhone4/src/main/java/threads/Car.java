package threads;

public class Car extends Thread {
	
	private int number;
	public Car(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("Car with index: " + i + " - Thread: " + number);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
