package codestudio.sorting_i;

import utils.InputNNumbers;
import utils.Sorts;

public class SelectionSort extends Sorts {
    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

      public static void main(String[] args) {
        int[] nums = InputNNumbers.get();
        int[] sorted = sort(nums);
        for (int n : sorted) {
            System.out.println(n);
        }
    }

   
}