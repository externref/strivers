package leetcode.arrays;

import utils.InputNNumbers;

public class MoveZeroes {
    static class Solution {
        public void moveZeroes(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j] == 0) {
                        nums[j] = nums[j + 1];
                        nums[j + 1] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = InputNNumbers.get();
        (new Solution()).moveZeroes(nums);
    }
}
