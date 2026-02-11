package multithreading;

public class World implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
