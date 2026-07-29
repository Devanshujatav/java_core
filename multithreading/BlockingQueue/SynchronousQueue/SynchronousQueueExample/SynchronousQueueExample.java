import java.util.concurrent.*;

public class SynchronousQueueExample{
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        Thread producer = new Thread(() -> {
            try{
                System.out.println("Producer Trying to put 100");
                queue.put(100);
                System.out.println("Producer put 100");
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });


        Thread consumer = new Thread(() -> {
            try{
                Thread.sleep(2000);
                System.out.println("Consumer took " + queue.take());
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}