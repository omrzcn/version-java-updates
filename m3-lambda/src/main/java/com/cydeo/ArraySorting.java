package com.cydeo;

import java.util.function.Predicate;

public class ArraySorting { // QuickSort , BubbleSort
    public static void main(String[] args) {


        ArraySorting arraySort = new ArraySorting();

        QuickSort quickSort = new QuickSort();

        BubbleSort bubbleSort = new BubbleSort();



        arraySort.sort(quickSort);  // behavior parameterization
        arraySort.sort(bubbleSort); // behavior parameterization


        Sorting qs = ()-> System.out.println("Quick Sort");
        arraySort.sort(qs);

        arraySort.sort(()-> System.out.println("Quick Sort")); // with this way , we dont need QucikSort interface anymore






    }
    private void sort(Sorting sorting){
        sorting.sort();
    }


}
