import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int twoPair = PairOfTwo(a);

    }

    private static int PairOfTwo(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            int sum = 0;
            for (int j = i + 1; j < a.length; j++) {
                sum = sum + a[j];
                System.out.println(current + " " + a[j]);
            }
            System.out.println("");
            count++;
            System.out.println(count);

        }
        return 0;
    }
}
