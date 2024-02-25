package com.cydeo;



import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        ApplePredicate applePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }


        };

        // functional interface ready methods
        System.out.println("=================PREDICATE=======================");

        Predicate<Integer> lesserThan = i -> i < 10; // its gonna return boolean

        System.out.println(lesserThan.test(20));


        System.out.println("=====================CONSUMER==========================");


        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);


        System.out.println("=====================BI CONSUMER==========================");

        BiConsumer<Integer,Integer> addTwo = (a,b)-> System.out.println(a+b );

        addTwo.accept(10,30);


        System.out.println("=====================FUNCTION==========================");

        Function<String,String> fun = s -> "Hello "+s;
        System.out.println(fun.apply("mehmet"));


        System.out.println("=====================BI FUNCTION==========================");

        BiFunction<Integer,Integer,Integer> func = (x,y)-> x+y;
        System.out.println(func.apply(10,5));

        System.out.println("=====================SUPPLIER==========================");

        Supplier<Double> funn1 = () -> Math.random();
        System.out.println(funn1.get());





    }
}
