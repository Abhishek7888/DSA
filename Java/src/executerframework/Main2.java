package executerframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main2 {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Callable<Integer> callable1 = () -> {
			Thread.sleep(1000);
			System.out.println("Task 1");
			return 1;
		};

		Callable<Integer> callable2 = () -> {
			Thread.sleep(1000);
			System.out.println("Task 2");
			return 2;
		};

		Callable<Integer> callable3 = () -> {
			Thread.sleep(1000);
			System.out.println("Task 3");
			return 3;
		};

		List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

		try {
			// 🔥 Increase timeout (or remove it completely)
			List<Future<Integer>> futures = executorService.invokeAll(list, 4, TimeUnit.SECONDS);

			for (Future<Integer> future : futures) {
				if (!future.isCancelled()) {
					System.out.println(future.get());
				} else {
					System.out.println("Task was cancelled");
				}
			}

			// ✅ Use fresh tasks for invokeAny (best practice)
			List<Callable<Integer>> newList = Arrays.asList(callable1, callable2, callable3);

			Integer result = executorService.invokeAny(newList);
			System.out.println("First completed: " + result);

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
	}
}