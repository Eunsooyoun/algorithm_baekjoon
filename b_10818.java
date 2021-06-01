
import java.util.Scanner;

public class b_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }

        System.out.printf("%d %d", min, max);

    }

}
