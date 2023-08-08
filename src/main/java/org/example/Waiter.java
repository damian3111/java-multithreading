package org.example;

public class Waiter implements Runnable{

    private String name;
    private int number = 0;
    private final Object object = new Object();
    public Waiter(String name) {
    this.name=name;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        asdsd();
    }

    public synchronized void asdsd(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            number++;
            System.out.println(Thread.currentThread().getName() + ", " + i);
        }

        System.out.println(Thread.currentThread().getName() + " waiter done");
        System.out.println("SUM: " + number);
    }

    public int getNumber(){
        return number;
    }
}
