package com.toasternetwork.exercises;

import java.util.Random;

public class Main {

    private static final int[] arr = new int[1000000];
    private static final Random random;

    static {
        random = new Random();
    }

    public static void main(String[] args) {
        int factor = random.nextInt(2147);
        int target = random.nextInt(arr.length) * factor;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i * factor;
        }
        System.out.printf("Using a factor of %d, perform the jump search\n", factor);
        int index = Search.jumpSearch(arr, target);
        if(index == -1) {
            System.out.printf("Target number %d not found\n", target);
            return;
        }

        System.out.printf("Target Index found! [%d] = %d? %s", index, target, arr[index] == target ? "Yes!" : "No.");

    }
}
