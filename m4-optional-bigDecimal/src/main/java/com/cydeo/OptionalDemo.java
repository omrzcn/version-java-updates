package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // Optional is preventing null pointer exceptions

        List<Integer> number = Arrays.asList(2,4,2,10,23);


        System.out.println("=============isPresent==============");
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        System.out.println(Optional.of(number).isPresent());




        System.out.println("=======ifPresent============");
        // it means if its presents, sout it. If no, just leave it.
          Optional<Integer> bigNumber = number.stream().filter(x->x > 100).findAny();
          bigNumber.ifPresent(System.out::println);
          // condition is not true , thats why it didnt throws exception

        System.out.println("===============get====================");
       // System.out.println(bigNumber.get());

        System.out.println("===============orElse====================");

        System.out.println(bigNumber.orElse(5));
        // if condition is not true, throw 5.






    }
}
