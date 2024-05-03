package codestudio.sorting_i;

import utils.InputNNumbers;
import utils.Sorts;

public class BubbleSort extends Sorts {
    public static int[] sort(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-i-1;j++){
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
        return nums;
    }
   public static void main(String[] args) {
        int[] nums = InputNNumbers.get();
        int[] sorted = sort(nums);
        for (int n : sorted) {
            System.out.println(n);
        }
    }

}
