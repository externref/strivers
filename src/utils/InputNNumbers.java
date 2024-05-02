package utils;

public class InputNNumbers {
    public static int[] get() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter amount of numbers to take as input: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        return nums;
    }
}
