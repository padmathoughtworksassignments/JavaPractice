package org.example;

import java.util.HashMap;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> voterList = new HashMap<>();

        voterList.put(1, "A");
        voterList.put(2, "B");
        voterList.put(3, "C");
        voterList.put(4, "D");
        voterList.put(5, "E");
        voterList.put(6, "F");

        System.out.println(voterList);

        Iterator<Integer> itr = voterList.keySet().iterator();

        while(itr.hasNext())
        {
            Integer key = itr.next();

            String value = voterList.get(key);
            System.out.println("Key : " + key + " Value : " + value);
        }
    }
}