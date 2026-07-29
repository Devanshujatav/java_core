import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;


class Producer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        try{
            for(int i=1 ; i<=10 ; i++){
                System.err.println("Producing : " + i);
                queue.put(i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Producer Interrupted");
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        try{
            while (true) {
                Integer value = queue.take();
                System.out.println("Consuming Value : " + value);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("COnnsumer Interrupted");
        }
    }
}

public class BlockingQueueExample{
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));
    
        producerThread.start();
        consumerThread.start();
    }
}