import java.util.concurrent.locks.*;

class DataStore{
    private int data = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    void read(){
        lock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() +" is Reading data: " + data);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();   
        }
    } 
    
    void write(int value){
        lock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() +" is Writing data: " + value);
            data = value;
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();   
        }
    }
}

public class Main{
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();

        Thread reader1 = new Thread(() -> {
            for(int i=0; i<3; i++){
                dataStore.read();
            }
        }, "Reader-1");

        Thread reader2 = new Thread(() -> {
            for(int i=0; i<3; i++){
                dataStore.read();
            }
        }, "Reader-2");

        Thread writer = new Thread(() -> {
            for(int i=1; i<=3; i++){
                dataStore.write(i*10);
            }
        }, "Writer");

        reader1.start();
        reader2.start();
        writer.start();

        try{
            reader1.join();
            reader2.join();
            writer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program finished.");
    }

}

