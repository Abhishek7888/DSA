package Multithreading;

public class Multithreading extends Thread {

	@Override
	public void run() {
		System.out.println("Running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Multithreading m = new Multithreading();
		System.out.println(m.getState());
		m.start();
		System.out.println(m.getState());
		Thread.sleep(100);
		System.out.println(m.getState());
		m.join();
		System.out.println(m.getState());

	}

}
