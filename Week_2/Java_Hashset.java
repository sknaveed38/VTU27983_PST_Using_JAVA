import java.util.*;

public class Java_Hashset {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int t = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        System.out.println("Enter pairs:");

        while (t-- > 0) {

            String first = sc.next();
            String second = sc.next();

            set.add(first + " " + second);

            System.out.println("Unique Pairs = " + set.size());
        }

        sc.close();
    }
}