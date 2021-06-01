
import java.util.Scanner;

public class b_4344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int[] arr = new int[a];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            double avg = sum / arr.length;
            double cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (avg < arr[j]) {
                    cnt++;
                } else {
                    continue;
                }
            }
            System.out.printf("%.3f%%\n", (cnt / a) * 100);
        }

        sc.close();
    }

}
