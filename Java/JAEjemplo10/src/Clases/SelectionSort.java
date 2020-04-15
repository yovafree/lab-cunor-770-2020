/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author erwin
 */
public class SelectionSort {
    public static void main(String[] args) {
            SelectionSort selectionSort = new SelectionSort();
            int[] array = { 10, 1, 5, 40, 12, 34, 44, 12, 11, 9 };
            selectionSort.printArray(array);
            selectionSort.sortArray(array);
            selectionSort.printArray(array);
    }
    
    public void sortArray(int[] array) {
            for (int i = array.length - 1; i > 0; i--) {
                    int maxValue = 0;
                    for (int j = 0; j < i; j++) {
                            if (array[j + 1] > array[maxValue]) {
                                    maxValue = j + 1;
                            }
                    }
                    swap(array, i, maxValue);
                    printArray(array);
            }
    }

    public void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                    System.out.printf("%d \t", array[i]);
            }
            System.out.println();
    }

    public void swap(int[] array, int a, int b) {
            int value = array[b];
            array[b] = array[a];
            array[a] = value;
    }
}
