package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26 ;
        System.out.println(amount1-amount2); // 0.30000000000001137

        System.out.println("================bigDecimal===================");

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = BigDecimal.valueOf(374.26);
        System.out.println(b1.subtract(b2));

        // we are gonna use after thar instead of double BigDecimal.

        BigDecimal b3 =BigDecimal.ONE;

        System.out.println(b1.add(BigDecimal.valueOf(15))); // 389.56
        System.out.println(b1.multiply(new BigDecimal("15"))); // 5618.40


        System.out.println("================scaling===================");

        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1,RoundingMode.FLOOR));
        System.out.println(number1.setScale(3,RoundingMode.CEILING));


        System.out.println("========Do not use equals(). Use compareTo()================");
        System.out.println(new BigDecimal(2).compareTo(new BigDecimal(2)));
        System.out.println(new BigDecimal(3).compareTo(new BigDecimal(2)));
        System.out.println(new BigDecimal(1).compareTo(new BigDecimal(2)));
















    }
}
