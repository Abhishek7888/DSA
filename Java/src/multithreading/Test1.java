package multithreading;

public class Test1 {
	public static void main(String[] args) {
		Counter c = new Counter();
		Thread1 t = new Thread1(c);
		Thread1 t2 = new Thread1(c);
		t.start();
		t2.start();
		try {
			t.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(c.getCount());

	}
}
