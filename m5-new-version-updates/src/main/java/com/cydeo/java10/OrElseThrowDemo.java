package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {

        Optional<String> str = Optional.empty();

        System.out.println(str.get()); // if its empty our application is gonna stop

        System.out.println(str.orElseThrow()); // shorthand of---->    if( str.isPresent() ){ south(str.get()) } else { exception }

        System.out.println(str.orElseThrow(RuntimeException::new) );




    }
}
