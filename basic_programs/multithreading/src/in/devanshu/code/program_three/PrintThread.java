package in.devanshu.code.program_three;

public class PrintThread extends Thread{
    private final int threadNumber;

    public PrintThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        System.out.printf("%s Thread Starte : %d\n", Thread.currentThread().getName() , threadNumber);

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread End : %d\n", Thread.currentThread().getName() , threadNumber);

    }
}
