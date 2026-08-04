import java.util.*;

public class Java_Dequeue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter window size (m): ");
        int m = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxUnique = 0;

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            // Add new element
            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            // Remove oldest element if window size exceeds m
            if (deque.size() > m) {
                int removed = deque.removeFirst();

                map.put(removed, map.get(removed) - 1);

                if (map.get(removed) == 0) {
                    map.remove(removed);
                }
            }

            // Update maximum unique count
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, map.size());
            }
        }

        System.out.println("Maximum Unique Elements = " + maxUnique);

        sc.close();
    }
}