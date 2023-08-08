package org.example;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Notifier implements Runnable {

private final Integer ads = 3;
    private Queue list = new ArrayDeque(30);

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", Starter");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public Queue getCount() {
        return list;
    }

    private void processSomething(int i) {
        // processing some job

    }
}
