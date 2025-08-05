package in.devanshu.code.program_three;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintThread t1 = new PrintThread(1);
        PrintThread t2 = new PrintThread(2);
        PrintThread t3 = new PrintThread(3);

        // t1 : start and end
        t1.start();
        t1.join();

        // t2 : start and end
        t2.start();
        t2.join();

        // t3 : start and end
        t3.start();
        t3.join();


    }
}
