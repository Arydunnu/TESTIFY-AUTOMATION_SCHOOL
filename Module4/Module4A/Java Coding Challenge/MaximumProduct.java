package JavaCodingChallenge;

public class MaximumProduct {

    public static void main(String[] args) {
        int[] array = {2, 5, 1, 8, 4, 6};
        int[] result = findMaxProductPair(array);

        System.out.println("Maximum Product Pair: " + result[0] + " and " + result[1]);
        System.out.println("Maximum Product: " + result[0] * result[1]);
    }

    // Function to find two numbers of which the product is maximum in an array
    public static int[] findMaxProductPair(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            // Update maximum values
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Update minimum values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Check whether the product of max elements or product of min and max elements is greater
        return (max1 * max2 > min1 * min2) ? new int[]{max1, max2} : new int[]{min1, max1};
    }
}
