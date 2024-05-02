package codestudio.arrays;

import utils.InputNNumbers;

public class LargestElement {
    public static void main(String[] args) {
        int nums[] = InputNNumbers.get();
        int smallest = nums[0];
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println(smallest + " is the smallest number.");
    }
}
