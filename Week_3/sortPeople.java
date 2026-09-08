import java.util.Arrays;
import java.util.stream.IntStream;

public class sortPeople {
    public static String[] sortpeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] indices = IntStream.range(0, n).boxed().toArray(Integer[]::new);

        Arrays.sort(indices, (i, j) -> Integer.compare(heights[j], heights[i]));

        return Arrays.stream(indices).map(i -> names[i]).toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] sortedNames = sortpeople(names, heights);

        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Sorted People: " + Arrays.toString(sortedNames));
    }
}