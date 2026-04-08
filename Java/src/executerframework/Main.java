package executerframework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {

		Long starTime = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(9);

		for (int i = 1; i < 10; i++) {

			int finaI = i;

			executor.submit(() -> {
				long result = factorail(finaI);
				System.out.println(result);

			});

		}
		executor.shutdown();
		try {
			executor.awaitTermination(100, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" Total time :" + (System.currentTimeMillis() - starTime));
	}

	public static long factorail(int n) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		return result;

	}

}
