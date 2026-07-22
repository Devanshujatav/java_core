class MyTask extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();
        t1.start();
        t2.start();
    }
}