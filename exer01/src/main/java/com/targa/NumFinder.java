package com.targa;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        for (int n : nums) {
            if (n < smallest)
                smallest = n;
            else if (n > largest)
                largest = n + 1;
        }
    }

    public int getSmallest() {
        return smallest;
    }

    public int getLargest() {
        return largest;
    }
}
