package multithreading;

public class DeamonThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		while (true) {
			System.out.println("Hello world");
			
		}
	}

	public static void main(String[] args) {

		DeamonThread d = new DeamonThread();
		
		d.setDaemon(true);
		DeamonThread d2 = new DeamonThread();
		d.start();
		System.out.println("Done");
	}

}
