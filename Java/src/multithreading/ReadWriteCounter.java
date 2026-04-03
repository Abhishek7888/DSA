package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {

	private int count = 0;
	private final ReadWriteLock lock = new ReentrantReadWriteLock();
	private final Lock readLock = lock.readLock();
	private final Lock writeLock = lock.writeLock();

	public void increament() {
		writeLock.lock();
		try {
			count++;
		} finally {
			writeLock.unlock();
		}
	}

	public int getCount() {
		readLock.lock();
		try {
			return count;
		} finally {
			readLock.unlock();
		}
	}

	public static void main(String[] args) {

		ReadWriteCounter counter = new ReadWriteCounter();

		Runnable readTask = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + " read : " + counter.getCount());
				}
			}
		};

		Runnable writeTask = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					counter.increament();
					System.out.println(Thread.currentThread().getName() + " incremented ");
				}
			}
		};

		Thread writerThread = new Thread(writeTask);
		Thread readerThread1 = new Thread(readTask);
		Thread readerThread2 = new Thread(readTask);

		writerThread.start();
		readerThread1.start();
		readerThread2.start();

		try {
			writerThread.join();
			readerThread1.join();
			readerThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Final count : " + counter.getCount());

	}
}
