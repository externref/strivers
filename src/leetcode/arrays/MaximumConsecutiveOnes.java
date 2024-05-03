package leetcode.arrays;

import utils.InputNNumbers;

public class MaximumConsecutiveOnes {
    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0;
            int current = 0;
            for (int num : nums) {
                if (num != 0) {
                    maxCount = maxCount < current ? current : maxCount;
                    current = 0;
                } else {
                    current++;
                }
            }
            return current > maxCount ? current : maxCount;
        }
    }

    public static void main(String[] args) {
        int[] nums = InputNNumbers.get();
        System.out.println((new Solution()).findMaxConsecutiveOnes(nums));
    }
}
