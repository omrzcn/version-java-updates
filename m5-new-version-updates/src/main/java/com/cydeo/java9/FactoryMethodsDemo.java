package com.cydeo.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        // we are gonna see       .of()

        System.out.println("==========Creating unmodifiable List before java 9===============");
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
        //courses.add("TS");
        System.out.println(courses);
        // we couldnt add TS to the list. Because it is before java 9

        System.out.println("==========Creating unmodifiable List after java 9===============");
        List<String>myCourses = List.of("Java","Spring","Agile");
        System.out.println(myCourses);

         System.out.println("==========Creating unmodifiable Set after java 9===============");
        Set<String> myProducts = Set.of("Milk","Bread","Butter");

          System.out.println("==========Creating unmodifiable Map after java 9===============");
        Map<String,Integer> myCart = Map.ofEntries(Map.entry("Samsung",1),Map.entry("PSP",1),Map.entry("Chair",5));








    }
}
