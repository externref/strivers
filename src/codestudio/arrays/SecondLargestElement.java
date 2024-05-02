package codestudio.arrays;

import utils.InputNNumbers;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = InputNNumbers.get();
        int smallest = nums[0];
        int secondSmallest = nums[0];
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
        }
        for (int num : nums) {
            if (num == smallest) {
                continue;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
        }
        System.out.println(secondSmallest + " is the second smallest number.");

    }
}
