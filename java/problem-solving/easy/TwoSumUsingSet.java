import java.util.HashSet;
import java.util.Scanner;

public class TwoSumUsingSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target number : ");
        int target = sc.nextInt();

        HashSet<Integer> seen = new HashSet<>();

        for (int x : nums) {
            int needed = target - x;

            if (seen.contains(needed)) {
                System.out.println(needed + " " + x);
                break;
            }

            seen.add(x);
        }

        sc.close();
    }
}
