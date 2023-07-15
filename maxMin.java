import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // finding the maximum element in array using loop and storing it to
        // variable'max'

        int max = findMax(a);
        int min = findMin(a);

        System.out.println("Maximum Value Is" + max);
        System.out.println("Minimum Value Is" + min);

    }

    static int findMin(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= min) {
                min = a[i];
            }
            return min;
        }
        return 0;

    }

    static int findMax(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
            return max;
        }
        return 0;
    }
}