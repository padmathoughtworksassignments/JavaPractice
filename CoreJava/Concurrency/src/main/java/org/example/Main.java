package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Simple Wait-Notify
class Signal
{
    synchronized void waitForTeacher()
    {
        System.out.println("Student waiting for Teacher's message");
        try
        {
            wait();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Student Got Teacher's message, starting Student Task");
    }

    synchronized void notifyStudent()
    {
        System.out.println("Teacher sending message to Students ");
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Signal signal = new Signal();

    Thread student = new Thread(() -> signal.waitForTeacher());

    Thread teacher = new Thread(() -> {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ignred)
            {

            }
            signal.notifyStudent();
        });
    student.start();
    teacher.start();

    }
}