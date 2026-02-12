package multithreading;

public class Thread1 extends Thread {

	private Counter counter;

	public Thread1(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}
}
