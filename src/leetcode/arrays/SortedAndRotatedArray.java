package leetcode.arrays;

import utils.InputNNumbers;

public class SortedAndRotatedArray {
    public static void main(String[] args) {
        int[] nums = InputNNumbers.get();
        System.out.println((new Solution()).check(nums));
    }
}

class Solution {
    public boolean check(int[] nums) {
        int k = 0;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}

