package multithreading;

public class Main {
	public static void main(String[] args) {

		BankAccount ba = new BankAccount();
		Runnable run = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ba.withDraw(500);

			}
		};

		Thread t1 = new Thread(run, " Thred 1 ");
		Thread t2 = new Thread(run, " Thred 2 ");
		
		t1.start();
		t2.start();	

	}
}
