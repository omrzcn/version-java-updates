package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2,4,6,8);

         List<Integer> unmodifiableList= List.copyOf(numberList); // this will give us unmodifiable List
        //we cannot make any changes here.
        List<Integer> unmodifiableList2  = List.of(1,2); // this can add values on List



    }

}
