package com.cydeo.Task.review;

import lombok.*;

//@Getter
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
//@AllArgsConstructor
// OUR good way to create lombok is "Builder";


public class Car {

    @Getter
    private String make;
    private int topSpeed;
    private int year;

    public Car(String toyota, int i, int i1) {
    }


}
