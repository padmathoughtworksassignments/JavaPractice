package org.example;

//class MyThread extends Thread
class MyThread implements Runnable
{
    //void show()
//    public MyThread(String name) {
//        super(name);
//    }

    public void run()
    {
        for (int i =1 ;i <= 20; i++)
        {
            //System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and welcome!");

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();


//        MyThread thread1 = new MyThread("Thread1");
//        MyThread thread2 = new MyThread("Thread2");
//        MyThread thread3 = new MyThread("Thread3");

        //thread1.setName("Thread1");
        //thread2.setName("Thread2");
        //thread3.setName("Thread3");

//        thread1.start();
//        try
//        {
//            thread1.join();
//        }
//        catch (InterruptedException e)
//        {
//            System.out.println("Thread exception");
//        }
//        thread2.start();
//        try
//        {
//            thread2.join();
//        }
//        catch (InterruptedException e)
//        {
//            System.out.println("Thread exception");
//        }

        for (int i =1 ;i <= 20; i++)
        {
            System.out.println("Main Thread");
        }

    }
}