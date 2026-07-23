class Shared{
    private int data;
    private boolean hasData = false;    

    synchronized void produce (int value) throws InterruptedException {
        while (hasData) {
            wait();
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
        notifyAll();
    }

    synchronized void consume () throws InterruptedException {
        while (!hasData) {
            wait();
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notifyAll();
    }
}

class Producer extends Thread {
    private Shared shared;

    Producer(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                shared.produce(i);
                Thread.sleep(500); // Simulate time taken to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Shared shared;

    Consumer(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                shared.consume();
                Thread.sleep(500); // Simulate time taken to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Producer producer = new Producer(shared);
        Consumer consumer = new Consumer(shared);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Production and Consumption completed.");
    }
}

