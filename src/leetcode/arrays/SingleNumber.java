package leetcode.arrays;

import utils.InputNNumbers;

public class SingleNumber {
    static class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = InputNNumbers.get();
        System.out.println((new Solution()).singleNumber(nums));
    }
}
