class Table {
    synchronized void printTable(int n){
        for (int i=1 ; i<=5 ; i++){
            System.out.println(Thread.currentThread().getName() + " : " + n*i);

            try {
                Thread.sleep(500);
            } catch (java.lang.Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread{
    private Table table;
    private int number;

    MyThread(Table table , int n){
        this.table = table;
        this.number = n;
    }

    @Override
    public void run(){
        table.printTable(number);
    }
}

public class Test{
    public static void main(String[] args) {
        Table table = new Table();

        new MyThread(table, 5).start();
        new MyThread(table, 10).start();
        new MyThread(table, 15).start();
        new MyThread(table, 20).start();
        new MyThread(table, 25).start();
    }
}