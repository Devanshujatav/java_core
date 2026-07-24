package single_callable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{
    @Override 
    public String call() throws Exception {
        System.out.println("Task Started By : " + Thread.currentThread().getName());
        Thread.sleep(3000);
        return "Task Completed Successfully";
    }
}

public class CallableExample {
    public static void main(String[] args) throws Exception {
        // Creating Executor Service with one thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create Callable Object
        Callable<String> task = new MyCallable();

        // Submit the task to the executor
        Future<String> future = executor.submit(task);

        System.out.println("Main thread is doing some work...");

        // get result from the future object
        String result = future.get(); // This will block until the result is available
    
        System.out.println("Result : " + result);

        executor.shutdown(); // Shutdown the executor service
    }
}

