package threads;

public class ConnectionPool implements Runnable {

	public Runnable newRunnable(String message) {
		return new Runnable() {
			public void run() {
				System.out.println(message);
				try {	
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}

	@Override
	public void run() {

	}

}
