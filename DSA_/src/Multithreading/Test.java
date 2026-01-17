package Multithreading;

public class Test extends Thread {
	public static void main(String[] args) {
		Multithreading m = new Multithreading();
		Thread t = new Thread(m);
		
		t.start();
		System.out.println(Thread.currentThread().getName());
	}

}
