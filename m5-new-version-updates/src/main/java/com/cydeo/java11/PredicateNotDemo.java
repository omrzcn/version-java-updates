package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Predicate.*;

public class PredicateNotDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> even = integer -> integer % 2 == 0 ;
        Predicate<Integer> odd = Predicate.not(even); // same with integer -> integer % 2 != 0 ;


        List<Integer> evenNumber = list.stream().filter(even).toList();
        System.out.println(evenNumber);




    }
}
