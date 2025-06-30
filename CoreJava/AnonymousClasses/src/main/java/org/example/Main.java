package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface CarInterface
{
    void wheels();
    default void color()
    {
        System.out.println("Red");
    }
}


//class  CarImplementation implements CarInterface
//{
//    public void wheels()
//    {
//        System.out.println("4 wheeler");
//    }
//}

//LAMDA expression
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        CarInterface car = () -> System.out.println("4 wheeler");
//        car.wheels();
//        car.color();
//    }
//}


public class Main {
    public static void main(String[] args) {
        CarInterface car = new CarInterface() {
            public void wheels()
            {
                System.out.println("4 wheeler");
            }
        };

        car.wheels();
        car.color();
    }
}