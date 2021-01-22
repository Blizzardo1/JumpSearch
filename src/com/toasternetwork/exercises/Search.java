package com.toasternetwork.exercises;

public final class Search {

    /**
     * Performs a Jump Search on the given array
     * @param arr The array to search
     * @param target The target number to search for
     * @return The index of where the target is positioned
     */
    public static int jumpSearch(int[] arr, int target) {

        final int n = arr.length; // final because this integer is not modified throughout the code.
        final int steps = (int)Math.floor(Math.sqrt(n)); // final because this integer is not modified throughout the code
        int stepping = steps; // Stepping or block jumps. If the array is a length of 100, then stepping is 10.

        int previous = 0;

        // Based on the stepping of the square root of the length of the array
        // find the block where the number might exist in.
        while(arr[Math.min(stepping, n) - 1] < target) {
            previous = stepping;
            stepping += steps;
            if(previous >= n) {
                return -1;
            }
        }

        // Perform a Linear Search for the target
        while(arr[previous] < target) {
            previous++;
            if(previous == Math.min(stepping, n)) {
                return -1;
            }
        }

        // We found our element, return the index!
        if(arr[previous] == target){
            return previous;
        }
        return -1;
    }
}
