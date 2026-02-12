package multithreading;

public class ThreadMethods extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "Running");
			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {

		ThreadMethods t = new ThreadMethods();
		ThreadMethods t2 = new ThreadMethods();
		t.start();
		t2.start();
		t2.interrupt();

	}
}
