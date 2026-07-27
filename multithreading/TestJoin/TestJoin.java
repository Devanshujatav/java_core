class TestJoin extends Thread{
    public void run(){
        for (int i=1 ; i<=3 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (java.lang.Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        TestJoin t1 = new TestJoin();
        TestJoin t2 = new TestJoin();

        t1.start();

        try {
            t1.join(); // wait for t1 to finish
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }

        t2.start(); // starts after t1 completes
    }
}