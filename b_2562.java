
import java.util.Scanner;

public class b_2562 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[9];

        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int max = a[0];
        int cnt = 0;

        for (int i = 1; i < 9; i++) {
            if (max < a[i]) {
                max = a[i];
                cnt = i;
            }
        }

        System.out.println(max);
        System.out.println(cnt + 1);

    }

}
