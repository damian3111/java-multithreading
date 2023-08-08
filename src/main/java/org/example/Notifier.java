package org.example;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

public class Notifier implements Callable {

private final Integer ads = 3;
    private Queue list = new ArrayDeque(30);



    public Queue getCount() {
        return list;
    }

    private void processSomething(int i) {
        // processing some job

    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ", Starter");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Thread.currentThread().getName() + ", works";
    }
}
