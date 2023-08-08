package org.example;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Notifier pt = new Notifier();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Thread t1 = new Thread(pt, "t1");
        Thread t2 = new Thread(pt, "t2");
        Thread t3 = new Thread(pt, "t3");
        Thread t4 = new Thread(pt, "t4");
        Thread t5 = new Thread(pt, "t5");
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.execute(t4);
        executorService.execute(t5);
        //wait for threads to finish processing
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        System.out.println("DONE");
        executorService.shutdown();
    }
}