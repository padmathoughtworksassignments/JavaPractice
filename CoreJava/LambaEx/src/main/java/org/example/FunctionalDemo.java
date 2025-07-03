package org.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FunctionalDemo {


        private static Logger logger = Logger.getLogger("Demo");
        public static void print (Object obj) {logger.log(Level.INFO, obj.toString());}

    public static void main(String[] args) {

        //Consumer<String> c1 =;
        //Supplier

        Predicate<Integer> positive = (x) -> x >= 0;
        System.out.println(positive.test(-5));

        Function<Integer,Integer> square = (x)-> x * x;
    }
}