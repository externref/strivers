package leetcode.arrays;

import codestudio.sorting_i.BubbleSort;
import utils.InputNNumbers;

public class MissingNumber {
    static class Solution {
        public int missingNumber(int[] nums) {
            int[] sorted = BubbleSort.sort(nums);
            for(int i=0; i<nums.length; i++){
                if(!(i==sorted[i])){
                    return i;
                }
            }
            return nums.length;
        }
    } 

    public static void main(String[] args) {
        int nums[] = InputNNumbers.get();
        System.out.println((new Solution()).missingNumber(nums));
    }
}
