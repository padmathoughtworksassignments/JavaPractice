package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

class Task implements Runnable
{
    String name ;

    Task(String nameIn)
    {
        name = nameIn;
    }

    public void run ()
    {
        System.out.println(name+" task is being run by "+Thread.currentThread().getName());
    }
}


public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new Task("Task1"));
        pool.execute(new Task("Task2"));
        pool.execute(new Task("Task3"));

        pool.shutdown();
    }
}