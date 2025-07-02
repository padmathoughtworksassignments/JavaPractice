package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Counter implements Runnable
{
    static int cnt = 0;


    //synchronized void increment()
    public synchronized static  void increment()
    {
        ++cnt;
    }

    public void run()
    {
        for (int i=0; i<10000; i++)
        {
            increment();
        }

        System.out.println("Final Value " + cnt);
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
