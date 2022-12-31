package threads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		
		ThreadPoolExecutor fixedExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		ThreadPoolExecutor fixedExecutor2 = (ThreadPoolExecutor) Executors.newFixedThreadPool(7);
		
		ThreadPoolExecutor cachedExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		ThreadPoolExecutor scheduleExecutor = (ThreadPoolExecutor) Executors.newScheduledThreadPool(7);
	//	ThreadPoolExecutor singleThreadExecutor = (ThreadPoolExecutor) Executors.newSingleThreadExecutor();
	//	ThreadPoolExecutor workStealingExecutor = (ThreadPoolExecutor) Executors.newWorkStealingPool(7);
		
		
		
		ConnectionPool pool1 = new ConnectionPool();
		ConnectionPool pool2 = new ConnectionPool();
		ConnectionPool pool3 = new ConnectionPool();
		ConnectionPool pool4 = new ConnectionPool();
		ConnectionPool pool5 = new ConnectionPool();
		ConnectionPool pool6 = new ConnectionPool();
		ConnectionPool pool7 = new ConnectionPool();
		fixedExecutor.execute(pool1.newRunnable("Getting Connection - thread 1"));
		fixedExecutor.execute(pool2.newRunnable("Getting Connection - thread 2"));
		fixedExecutor.execute(pool3.newRunnable("Getting Connection - thread 3"));
		fixedExecutor.execute(pool4.newRunnable("Getting Connection - thread 4"));
		fixedExecutor.execute(pool5.newRunnable("Getting Connection - thread 5"));
		fixedExecutor.execute(pool6.newRunnable("Getting Connection - thread 6"));
		fixedExecutor.execute(pool7.newRunnable("Getting Connection - thread 7"));


	
	}

	
}
