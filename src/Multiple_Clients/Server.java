package Multiple_Clients;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executor = null;
        try {
            executor = Executors.newCachedThreadPool();
            executor.submit(new Services());
            executor.awaitTermination(5, TimeUnit.SECONDS);
            executor.shutdown();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (executor != null) {
                executor.shutdown();
            }
        }

    }
}
