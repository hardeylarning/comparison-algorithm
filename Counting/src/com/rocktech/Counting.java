package com.rocktech;

import java.util.Arrays;

public class Counting {

    void sort(int[] array, int size) {
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i]; }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i)
            count[i] = 0;


        // Store the count of each element
        for (int i = 0; i < size; i++)
            count[array[i]]++;


        // Store the cumulative count of each array
        for (int i = 1; i <= max; i++)
            count[i] += count[i - 1];


        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--; }

        // Copy the sorted elements into original array
        if (size >= 0)
            System.arraycopy(output, 0, array, 0, size);
    }

    public static void main(String[] args) {
        Counting count = new Counting();
        int [] elements = {2,1,9,8,7,6,4,3,1};

        System.out.print("*************Elements before sorting*************\n");
            System.out.print(Arrays.toString(elements));

        System.out.println("\n*************Having sorted the array*************");
        count.sort(elements, elements.length);

        System.out.print(Arrays.toString(elements));
    }
}
