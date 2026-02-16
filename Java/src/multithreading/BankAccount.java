package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class BankAccount {

	private int balance = 1000;

	private final Lock lock = new ReentrantLock();

	public synchronized void withDraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + "Withdraw completed remaining balalnce " + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + " insufficient balance ");
		}
	}

	public void withDraw2(int amount) {
		System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
		try {
			if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
				try {
					if (balance >= amount) {
						System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
						Thread.sleep(3000);
						balance -= amount;
						System.out.println(
								Thread.currentThread().getName() + " withdraw completed, remaining balance " + balance);
					} else {
						System.out.println(Thread.currentThread().getName() + " insufficient balance ");
					}
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println(
						Thread.currentThread().getName() + " could not acquire the lock, will try again later");
			}
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		if (Thread.currentThread().isInterrupted()) {
			System.out.println("");
		}
	}

}