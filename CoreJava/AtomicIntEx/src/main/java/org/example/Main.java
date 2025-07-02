package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable
{
    static AtomicInteger cnt = new AtomicInteger(0);

    public void run()
    {
        for (int i=0; i<10000; i++)
        {
            cnt.incrementAndGet();
        }

        System.out.println("Final Value " + cnt.get());
    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread th1 = new Thread(new Counter());
        Thread th2 = new Thread(new Counter());

        th1.start();
        th1.join();

        th2.start();
        th2.join();

        //System.out.println("Synchronized counter Value : ");
    }
}