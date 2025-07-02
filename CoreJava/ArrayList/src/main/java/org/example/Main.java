package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//class Emp implements  Comparable<Emp>
//{
//    int id;
//    String name;
//
//    Emp(int idIn, String nameIn)
//    {
//        id = idIn;
//        name = nameIn;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int idIn) {
//        this.id = idIn;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String nameIn) {
//        this.name = nameIn;
//    }
//
//    @Override
//    public String toString() {
//        return "Emp{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Emp objIn)
//    {
//        return this.id - objIn.id;
//    }
//
//}

class Emp
{
    int id;
    String name;

    Emp(int idIn, String nameIn)
    {
        id = idIn;
        name = nameIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int idIn) {
        this.id = idIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameIn) {
        this.name = nameIn;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class EmpIdComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        return e1.getId() - e2.getId();
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList <Emp> employees = new ArrayList<>();

        employees.add(new Emp(10,"A"));
        employees.add(new Emp(40,"D"));
        employees.add(new Emp(70,"G"));
        employees.add(new Emp(30,"C"));
        employees.add(new Emp(20,"B"));
        employees.add(new Emp(50,"E"));
        employees.add(new Emp(60,"F"));

        System.out.println(employees);

        //Collections.sort(employees);
        //Collections.sort(employees, new EmpIdComparator());
        Collections.sort(employees, (e1, e2) -> e1.getId() - e2.getId()); //lamda function

        System.out.println(employees);



        for (Emp i : employees)
        {
            System.out.println(i);
        }

    }
}