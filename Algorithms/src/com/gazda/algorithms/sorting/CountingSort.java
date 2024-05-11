package com.gazda.algorithms.sorting;

public class CountingSort {

    private int findMax(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    private void countOccurences(int[] arr, int[] occArr) {
        for (int el : arr) {
            occArr[el]++;
        }
    }

    private void prepareCountArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }

    private void placeElementsBasingOnCountArray(int[] inputArr, int[] countArr, int[] outputArr) {
        for (int i = inputArr.length - 1; i >= 0; i--) {
            outputArr[countArr[inputArr[i]] - 1] = inputArr[i];
            countArr[inputArr[i]]--;
        }
    }

    public int[] countingSort(int[] arr) {
        int max = findMax(arr);
        int[] countArray = new int[max + 1];
        countOccurences(arr, countArray);
        prepareCountArray(countArray);
        int[] outputArray = new int[arr.length];
        placeElementsBasingOnCountArray(arr, countArray, outputArray);
        return outputArray;
    }
}
