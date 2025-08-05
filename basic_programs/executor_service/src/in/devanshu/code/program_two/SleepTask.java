package in.devanshu.code.program_two;

import java.time.chrono.ThaiBuddhistEra;

public class SleepTask implements Runnable{

    private int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int) random;
    }

    @Override
    public void run(){
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread : %s \n" , current.getName());
        try{
            Thread.sleep(getRandom() * 1000);
        } catch (RuntimeException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended with Thread : %s \n" , current.getName());
    }
}
