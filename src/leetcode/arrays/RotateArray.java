package leetcode.arrays;

import utils.InputNNumbers;

public class RotateArray {
    static class Solution {
        // exceeds time limit for one case
        // public void rotate(int[] nums, int k) {
        // for(int _n=0;_n<k;_n++ ){
        // int switchTo = nums[0], cache=0;
        // nums[0] = nums[nums.length-1];
        // for(int i=1; i<nums.length; i++){
        // cache = nums[i];
        // nums[i] = switchTo;
        // switchTo=cache;
        // }
        // }
        // }

        public static void reverse(int nums[], int i, int j) {
            int li = i;
            int ri = j;

            while (li < ri) {
                int temp = nums[li];
                nums[li] = nums[ri];
                nums[ri] = temp;

                li++;
                ri--;
            }
        }

        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            if (k < 0) {
                k += nums.length;
            }
            reverse(nums, 0, nums.length - k - 1);
            reverse(nums, nums.length - k, nums.length - 1);
            reverse(nums, 0, nums.length - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = InputNNumbers.get();
        (new Solution()).rotate(arr, 3);
    }
}
