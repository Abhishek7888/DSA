package multithreading;

class SharedResource {

	private int data;

	private boolean hasData;

	public void produce(int value) {

		while (hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
		data = value;
		hasData = true;
		notify();
	}

	public synchronized int consume() {

		while (hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}

		hasData = false;
		notify();
		return data;

	}
}

class Consumer implements Runnable {

	private SharedResource resource;

	public Consumer(SharedResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			int value = resource.consume();
			System.out.println(" Consumed : " + value);
		}
	}

}

class Producer implements Runnable {

	private SharedResource resource;

	public Producer(SharedResource resource) {
		super();
		// TODO Auto-generated constructor stub
		this.resource = resource;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			resource.produce(i);
			System.out.println(" Produce " + i);
		}
	}

}

public class ThreadCommunication {

	public static void main(String[] args) {

		SharedResource resource = new SharedResource();

		Thread thread1 = new Thread(new Producer(resource));

		Thread thread2 = new Thread(new Consumer(resource));

	}
}
