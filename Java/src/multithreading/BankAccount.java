package multithreading;

public class BankAccount {

	private int balance = 1000;

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

}