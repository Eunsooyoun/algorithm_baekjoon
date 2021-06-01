
import java.util.Scanner;

public class b_2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[10];

        int t = a * b * c;
        sc.close();
        do {
            arr[t % 10] = arr[t % 10] + 1;
            t /= 10;
        } while (t > 0);

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }

}
