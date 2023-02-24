package threads;

public class FirstHomeworkMain {

	public static void main(String[] args) {

		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		// Remove
		Thread thread1 = new Thread(() -> {
			threadLocal.set("Thread 1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String value = threadLocal.get();
			System.out.println(value);
			threadLocal.remove();
			value = threadLocal.get();
			System.out.println(value);
		});

		Thread thread2 = new Thread(() -> {
			threadLocal.set("Thread 2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String value = threadLocal.get();
			System.out.println(value);
		});
		thread1.start();
		thread2.start();

		for (int i = 0; i <= 5; i++) {
			Car car = new Car(i);
			car.start();
		}
		Person person = new Person();
		Thread thread3 = new Thread(person, "Thread 3");
		Thread thread4 = new Thread(person, "Thread 4");

		Car car2 = new Car(2);
		car2.start();
	}

}
