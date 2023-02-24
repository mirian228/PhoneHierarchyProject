package threads;

public class ThreadSafeAndLazyInitialiazedPool {

	ThreadLocal<String> threadLocal = new ThreadLocal<>();

	public synchronized String lazyInitialize(String value, String message) {
		value = threadLocal.get();
		if (value == null) {
			threadLocal.set(message);
			value = threadLocal.get();
		}

		return threadLocal.get();
	}

}
