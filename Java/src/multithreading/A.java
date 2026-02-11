package multithreading;

public class A extends Thread {

	A(String name) {
		super(name);
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority()
					+ " - Count: " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		A a = new A("LOW PRIORITY THREAD");
		A b = new A("MEDIUM PRIORITY THREAD");
		A c = new A("HIGH PRIORITY THREAD");
		a.setPriority(MIN_PRIORITY);
		b.setPriority(NORM_PRIORITY);
		c.setPriority(MAX_PRIORITY);
		a.start();
		b.start();
		c.start();
		a.join();
		System.out.println("Hello");
	}
}
