package com.gazda.algorithms;

import com.gazda.algorithms.sorting.CountingSort;
import com.gazda.algorithms.sorting.RadixSort;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args){
        CountingSort countingSort = new CountingSort();
        int[] arrayToSort = new int[] {2,5,3,0,2,3,0,3};
        int[] sortedArray = countingSort.countingSort(arrayToSort);
        Arrays.stream(sortedArray).forEach(System.out::print);

        RadixSort radixSort = new RadixSort();
        arrayToSort = new int[] {175, 45, 75, 90, 802, 24, 2, 66};
        sortedArray = radixSort.radixSort(arrayToSort);
        Arrays.stream(sortedArray).forEach(System.out::print);
    }
}
