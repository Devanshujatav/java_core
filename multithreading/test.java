class test extends Thread {
    public void run(){
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.start();
    }
}