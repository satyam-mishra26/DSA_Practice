import java.util.*;

public class kadans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            cs = cs + a[i];
            if (cs <= 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Sum Of Maximum Subarray " + ms);

    }
}
