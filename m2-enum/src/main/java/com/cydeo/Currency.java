package com.cydeo;

public enum Currency {
   PENNY(1) ,NICKLE(5),DIME(10),QUARTER(25);

   private int value;

   Currency(int value) { // we created constructor and if we created we need to add values at same class
      this.value = value;
   }

   public int getValue() {
      return value;
   }
}
