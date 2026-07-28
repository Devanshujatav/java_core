import java.util.concurrent.*;

class Worker implements Callable<String> {
    private BlockingQueue<Integer> queue;

    Worker(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public String call() throws Exception{
        Integer value = queue.take();
        int square = value * value;

        return Thread.currentThread().getName() + " processed" + value + " -> " + square;
    }
}

public class Main{
    public static void main(String[] args) throws Exception{
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        queue.put(5);
        queue.put(8);
        queue.put(10);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<String> f1 = executor.submit(new Worker(queue));
        Future<String> f2 = executor.submit(new Worker(queue));
        Future<String> f3 = executor.submit(new Worker(queue));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        executor.shutdown();
    }
}