package com.cydeo;

public class ArraySorting { // QuickSort , BubbleSort
    public static void main(String[] args) {


        ArraySorting arraySort = new ArraySorting();

        QuickSort quickSort = new QuickSort();

        BubbleSort bubbleSort = new BubbleSort();



        arraySort.sort(quickSort);  // behavior parameterization
        arraySort.sort(bubbleSort); // behavior parameterization





    }
    private void sort(Sorting sorting){
        sorting.sort();
    }


}
