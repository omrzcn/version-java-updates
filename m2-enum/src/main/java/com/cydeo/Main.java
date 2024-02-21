package com.cydeo;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant (enums)?");

        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY); // same with upper one

        System.out.println("============================================================");
        System.out.println("How to access all constant");

        Currency[] currencies = Currency.values(); // it returns array, we know it
        for (Currency currency : currencies) {
            System.out.println(currency);
        }


        System.out.println("============================================================");
        System.out.println("How to use switchCase with enums");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("it's 1 cent");
                break;
            case NICKLE:
                System.out.println("it's 5 cent");
                break;
            case DIME:
                System.out.println("it is 10 cent ");
                break;
            case QUARTER:
                System.out.println("it is 25 cent");
                break;


        }


        System.out.println("============================================================");
        System.out.println("Math Operation Enum Solution");

        calculate(5,4,Operation.PLUS); //  calculate method iin this page .


        System.out.println("============================================================");
        System.out.println("How top retrieve the constant value ?");

        System.out.println(Currency.PENNY.getValue()); // with enum name.object.getvalue


        System.out.println(Currency.QUARTER.ordinal()); // ordinal shows us constant (sabit) index number.


    }

    private static void calculate (double x ,double y, Operation operation){

        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);

        }

    }


}
