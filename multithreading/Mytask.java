class Mytask extends Thread {
    public void run(){
        for (int i=1 ; i<=5 ; i++){
            System.out.println(Thread.currentThread().getName() + ";" + i);
        }
    }

    public static void main(String[] args) {
        Mytask t1 = new Mytask();
        Mytask t2 = new Mytask();

        t1.start();
        t2.start();
    }
}