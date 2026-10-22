import java.util.Arrays;

/** Prefix/suffix products without division. Time O(n), auxiliary space O(1) excluding output. */
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] values) {
        int[] result = new int[values.length];
        int prefix = 1;
        for (int i = 0; i < values.length; i++) {
            result[i] = prefix;
            prefix *= values[i];
        }
        int suffix = 1;
        for (int i = values.length - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= values[i];
        }
        return result;
    }

    public static void main(String[] args) {
        if (!Arrays.equals(productExceptSelf(new int[] {1, 2, 3, 4}), new int[] {24, 12, 8, 6})) throw new AssertionError("Example failed");
        if (!Arrays.equals(productExceptSelf(new int[] {0, 1, 2}), new int[] {2, 0, 0})) throw new AssertionError("Zero test failed");
        if (!Arrays.equals(productExceptSelf(new int[] {}), new int[] {})) throw new AssertionError("Empty input test failed");
        System.out.println("All Product Except Self examples passed.");
    }
}
