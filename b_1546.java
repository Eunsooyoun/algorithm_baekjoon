
import java.util.Scanner;

public class b_1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // DecimalFormat form = new DecimalFormat("#.##");
        int n = sc.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        double max = a[0];
        double avg = 0;
        sc.close();
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            a[i] = a[i] / max * 100;
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        avg = sum / n;

        System.out.println(avg);

    }

}
