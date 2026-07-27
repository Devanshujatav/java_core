import java.util.concurrent.*;

class DownloadTask implements Callable<String> {
    private String fileName;

    public DownloadTask(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String call() throws Exception{
        System.out.println(Thread.currentThread().getName() + " downloading " + fileName);

        Thread.sleep(2000);

        return fileName + " Download Complete.";
    }
}

public class DownloadManager {

    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<String> file1 = executor.submit(new DownloadTask("Movie.mp4"));
        Future<String> file2 = executor.submit(new DownloadTask("song.mp3"));
        Future<String> file3 = executor.submit(new DownloadTask("Image.png"));

        System.out.println(file1.get());
        System.out.println(file2.get());
        System.out.println(file3.get());

        executor.shutdown();
    }
}

