
import java.util.Scanner;

public class b_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int cnt = sc.nextInt();
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                for (int k = 0; k < cnt; k++) {
                    System.out.printf("%c", c);
                }
            }
            System.out.println();
        }

        sc.close();
    }

}
