package codestudio.arrays;

import utils.InputNNumbers;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = InputNNumbers.get();
        for(int i=1; i<nums.length-1;i++){
            if(nums[i]<nums[i-1]){
                System.out.println("Arrary is not sorted.");
                break;
            }
        }
        System.out.println("Array is sorted.");;
    }
}
