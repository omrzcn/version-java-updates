package com.cydeo;

import java.math.BigDecimal;

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






    }
}
