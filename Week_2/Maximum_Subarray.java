public class Maximum_Subarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}