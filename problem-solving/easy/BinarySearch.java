/** Iterative binary search on a sorted ascending array. Time O(log n); space O(1). */
public class BinarySearch {
    public static int search(int[] values, int target) {
        int left = 0, right = values.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (values[middle] == target) return middle;
            if (values[middle] < target) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        if (search(new int[] {1, 3, 5, 7, 9}, 7) != 3) throw new AssertionError("Found target test failed");
        if (search(new int[] {1, 3, 5, 7, 9}, 2) != -1) throw new AssertionError("Missing target test failed");
        if (search(new int[] {}, 4) != -1) throw new AssertionError("Empty array test failed");
        if (search(new int[] {5}, 5) != 0) throw new AssertionError("Single element test failed");
        System.out.println("All Binary Search examples passed.");
    }
}
