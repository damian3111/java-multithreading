package org.example;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Notifier pt = new Notifier();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();

        FutureTask<String> stringFutureTask = new FutureTask<String>(pt);
//        threadPoolExecutor.execute(stringFutureTask);

        executorService.execute(stringFutureTask);

        String s = stringFutureTask.get();
        //wait for threads to finish processing

        System.out.println("DONE - " + s);
        executorService.shutdown();
    }
}