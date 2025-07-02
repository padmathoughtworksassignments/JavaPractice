package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Camera
{

    //Synchronized function
    void Clear()
    {
        System.out.println("Entered "+Thread.currentThread().getName());
        for(int clr = 1; clr <= 25 ; clr++)
        {
            System.out.println("clear clear");
        }
        System.out.println("Exiting "+Thread.currentThread().getName());
    }

    //synchronized function
  synchronized void click()
  {
      System.out.println("Entered "+Thread.currentThread().getName());
      for(int click = 1; click <= 25 ; click++)
      {
          System.out.println("click");
      }
      System.out.println("Exiting "+Thread.currentThread().getName());
  }

  // Synchronized block
  void clack()
  {
      System.out.println("Entered "+Thread.currentThread().getName());
      synchronized (this) {
          for (int clack = 1; clack <= 25; clack++) {
              System.out.println("clack");
          }
      }
      System.out.println("Exiting "+Thread.currentThread().getName());
  }
}

class PersonA extends Thread
{
    Camera camera;

    PersonA(Camera cam)
    {
        this.camera = cam;
    }

    public void run()
    {
        //camera.Clear();
        camera.click();
        camera.clack();
    }
}

class PersonB extends Thread
{
    Camera camera;

    PersonB(Camera cam)
    {
        this.camera = cam;
    }

    public void run()
    {
        //camera.Clear();
        camera.click();
        camera.clack();
    }
}

public class Main {
    public static void main(String[] args) {

        Camera c1 = new Camera();

        PersonA p1 = new PersonA(c1);
        PersonB p2 = new PersonB(c1);

        p1.setName("Thread1");
        p2.setName("Thread2");

        p1.start();
        p2.start();
    }
}