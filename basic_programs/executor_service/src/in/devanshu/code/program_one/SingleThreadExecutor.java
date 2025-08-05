package in.devanshu.code.program_one;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newSingleThreadExecutor()){
            PrintNumbers task = new PrintNumbers();
            service.submit(task);
        }
    }
}
