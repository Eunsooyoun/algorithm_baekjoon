
import java.util.Scanner;

public class b_3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] r = new int[42];

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < 10; i++) {
            a[i] = a[i] % 42;
        }

        for (int i = 0; i < 10; i++) {
            r[a[i]] = r[a[i]] + 1;
        }

        int cnt = 0;

        for (int i = 0; i < 42; i++) {
            if (r[i] != 0) {
                cnt += 1;
            }
        }

        System.out.println(cnt);

    }

}
