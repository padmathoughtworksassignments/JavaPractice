package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Start");

//        try
//        {
//            System.out.println(100/0);
//        }
//        catch (ArithmeticException e) // e is the ref catching exception
//        {
//            System.out.println("Arithmetic Exception : "+e);
//        }

        try
        {
            int nums[] = {10,20,20};
            System.out.println(nums[3]/0);

            try
            {
                System.out.println("inner try block");
                System.out.println(100/0);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Inner block Catch Exception : "+ e);
                System.out.println(20/0);
            }
        }
        catch (Exception e)
        {
            System.out.println("Outer block Catch Exception : "+ e);
        }
        System.out.println("End");
    }
}