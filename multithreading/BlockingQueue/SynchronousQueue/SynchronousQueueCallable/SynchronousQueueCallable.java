import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;

class Producer implements Callable<String> {
    private SynchronousQueue<String> queue;

    public Producer(SynchronousQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public String call() throws Exception{
        String message = "Hello Consumer";

        System.out.println("System is trying to send message.");

        queue.put(message);

        System.out.println("Producer sent the message.");

        return "Producer task completed.";
    }
}

class Consumer implements Callable<String> {
    private SynchronousQueue<String> queue;

    public Consumer(SynchronousQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public String call() throws Exception{
        System.out.println("Consumer is waiting for message.");

        String message = queue.take();

        System.out.println("Consumer received : " + message);

        return "Consumer task completed.";
    }
}


public class SynchronousQueueCallable {
    public static void main(String[] args) throws Exception {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Future<String> producerResult = executor.submit(producer);
        Future<String> consumerResult = executor.submit(consumer);

        System.out.println(producerResult.get());
        System.out.println(consumerResult.get());

        executor.shutdown();
    }
}