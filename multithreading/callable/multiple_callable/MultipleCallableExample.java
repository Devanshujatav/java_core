package multiple_callable;
import java.util.concurrent.*;

class SquareCalculator implements Callable<Integer> {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Calculating square of " + number + " by " + Thread.currentThread().getName());
        Thread.sleep(2000); // Simulate time-consuming task
        return number * number;
    }
}

public class MultipleCallableExample {
    public static void main(String[] args) {
        // Creating Executor Service with a fixed thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> future1 = executor.submit(new SquareCalculator(5));
        Future<Integer> future2 = executor.submit(new SquareCalculator(10));
        Future<Integer> future3 = executor.submit(new SquareCalculator(15));

        System.out.println("Main thread is doing some work...");

        try {
            // get results from the future objects
            Integer result1 = future1.get(); // This will block until the result is available
            Integer result2 = future2.get();
            Integer result3 = future3.get();

            System.out.println("Result of square of 5: " + result1);
            System.out.println("Result of square of 10: " + result2);
            System.out.println("Result of square of 15: " + result3);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Shutdown the executor service
        }
    }
}
