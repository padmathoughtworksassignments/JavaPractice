package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class AGEException extends RuntimeException
{
    //String message;
    AGEException (String message)
    {
        //this.message = message;
        super(message);
    }
}

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



//        try
//        {
//            int nums[] = {10,20,20};
//            System.out.println(nums[3]/0);
//
//            try
//            {
//                System.out.println("inner try block");
//                System.out.println(100/0);
//            }
//            catch (ArithmeticException e)
//            {
//                System.out.println("Inner block Catch Exception : "+ e);
//                System.out.println(20/0);
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("Outer block Catch Exception : "+ e);
//        }

        //Exception Hierarchy Specific -> Generic

        try
        {
            int nums[] = {10,20,30};
            System.out.println(nums[4]);

        }

        // ERROR : cannot have both exceptions of same Parent
//        catch (IndexOutOfBoundsException e || Exception e)
//        {
//            System.out.println("Generic Exception (Parent)");
//        }

        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds");
        }
        catch (Exception e)
        {
            System.out.println("Generic Exception (Parent)");
        }
        finally
        {
            System.out.println("Execute at last");
        }

        try
        {
            int nums[] = {10,20,30};
            //System.out.println(nums[4]);

        }
        finally
        {
            System.out.println("Executing Finally");
        }

        System.out.println("End");

        //Custom Runtime Exceptions
        int age = 12;
        if (age < 18)
        {
            throw new AGEException("Age Invalid");
        }
        else
        {
            System.out.println("Age is fine");
        }
    }
}