package com.rocktech;

import java.util.Arrays;

public class Cocktail {
    public void sort(int[] a, int n) {
        int temp;
        boolean isSwapped = true;
        int begin = 0, i;
        int end = n - 1;

        while (isSwapped) {
            isSwapped = false;
            for (i = begin; i < end; ++i) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
            isSwapped = false;
            for (i = end - 1; i >= begin; --i) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    isSwapped = true; } }
            ++begin; } }

    public static void main(String[] args) {
        Cocktail cocktail = new Cocktail();
        int [] elements = {7,9,2,8,7,6,4,3,1,4,11,19,13};

        System.out.print("*************Elements before sorting*************\n[");
        System.out.print(Arrays.toString(elements));

        cocktail.sort(elements, elements.length);
        System.out.println("\n*************Having sorted the array*************");
        System.out.print(Arrays.toString(elements));
    }
}
