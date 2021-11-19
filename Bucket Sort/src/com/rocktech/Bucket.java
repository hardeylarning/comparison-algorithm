package com.rocktech;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket {
    public void sort(float [] arr, int n){
        if (n <= 0)
            return;
        ArrayList<Float>[] bucket = new ArrayList[n];

        //empty array
        for (int i = 0; i<n; i++)
            bucket[i] = new ArrayList<>();

        // Add elements into the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }

        //sort the elements of each bucket
        for (int i = 0; i<n; i++)
            Collections.sort(bucket[i]);

        // get sorted array
        int index = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0, size = bucket[i].size(); j<size; j++){
                arr[index++] = bucket[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        float[] elements = {(float) 0.42, (float) 0.32,(float) 0.23,
                (float) 0.52, (float) 0.25, (float) 0.47, (float) 0.43};


        System.out.print("*************Elements before sorting*************\n[");
        for (float i : elements)
            System.out.print(i+ " ");

        bucket.sort(elements, elements.length);
        System.out.println("\n*************Having sorted the array*************");
        for (float i : elements)
            System.out.print(i+ " ");
    }
}
