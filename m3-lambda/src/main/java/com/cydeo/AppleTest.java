package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


        List<Apple> heavyApples = filterApples(inventory,new AppleHeavyPredicate());

        List<Apple> greenApples = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(heavyApples);
        System.out.println(greenApples);













    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        // we put second parameter Applepredicate because it has to be common, not specific interface
        // if we put ex: AppleHeavyPredicate --> we cannot provide color of apple
        // that interface can accept color and heavy both.

        List<Apple> result = new ArrayList<>(); // this gonna accept filtered objects

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)){ // this is my filter point ( applePredicate )
                result.add(apple);
            }
        }





        return result;
    }

}
