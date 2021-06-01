
import java.util.Scanner;

public class b_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = sc.nextLine();
        }

        sc.close();
        for (int i = 1; i < n + 1; i++) {
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }

    }

}
