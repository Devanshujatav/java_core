package in.devanshu.code.program_three;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FactorialCalculatorTesting {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)){
            List<Future<Integer>> list = new ArrayList<>();
            for (int i=0 ; i<10 ; i++){
                FactorialCalculator task = new FactorialCalculator(i);
                list.add(service.submit(task));
            }

            for (Future<Integer> future : list){
                System.out.printf("\n Result is : %d", future.get());
            }

            service.shutdown();

            if (!service.awaitTermination(10 , TimeUnit.SECONDS)){
                System.out.println("TIMEOUT.....NOW ITS GOING TO SHUTDOWN");
                service.shutdownNow();
            }
        } catch (RuntimeException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
