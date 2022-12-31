package threads;

import java.time.LocalDateTime;

public class Task implements Runnable {

	private final String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println("Task [" + name + "] executed on : " + LocalDateTime.now().toString());
		}

}
