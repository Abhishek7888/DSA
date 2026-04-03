package multithreading;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class UnfairLock {

	private final Lock unfairlock = new ReentrantLock(true);

	public void accessResource() {
		unfairlock.lock();
		System.out.println(Thread.currentThread().getName() + " Acquired the lock :");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			unfairlock.unlock();
			System.err.println(Thread.currentThread().getName() + " Release the lock ");
		}
	}

	public static void main(String[] args) {

		UnfairLock example = new UnfairLock();

		Runnable task = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				example.accessResource();
			}
		};

		Thread t1 = new Thread(task, "Thread 1 ");
		Thread t2 = new Thread(task, "Thread 2 ");
		Thread t3 = new Thread(task, "Thread 3 ");

		t1.start();
		t2.start();
		t3.start();
	}
}
