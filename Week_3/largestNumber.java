import java.util.Arrays;

public class largestNumber {
    public static String largestNumber(int[] nums) {
        String[] strs = Arrays.stream(nums)
                              .mapToObj(String::valueOf)
                              .toArray(String[]::new);

        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        if (strs[0].equals("0")) {
            return "0";
        }

        return String.join("", strs);
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String result = largestNumber(nums);

        System.out.println("Numbers: " + Arrays.toString(nums));
        System.out.println("Largest Formed Number: " + result);
    }
}