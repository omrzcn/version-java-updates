package com.cydeo.Task;

import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));


        // first way
        OrangeFormatter orangeLambda = orange -> "An Orange of "+orange.getWeight()+"g";
        prettyPrintApple(inventory,orangeLambda);

        // second way
        prettyPrintApple(inventory,orange -> "An Orange of "+orange.getWeight()+"g");






        // its gonna be more than 1 statement thats why we use curly bracket here below.
        OrangeFormatter fancyFormatter = orange -> {

            String result = orange.getWeight() >200 ? "Heavy" : "Light";

            return "A "+result+" "+orange.getColor()+" orange";

        };

        prettyPrintApple(inventory,fancyFormatter);







    }


    private static void prettyPrintApple(List<Orange>inventory,OrangeFormatter orangeFormatter){

        for (Orange orange : inventory) {
            String output = orangeFormatter.accept(orange);

            System.out.println(output);
        }



    }
}
