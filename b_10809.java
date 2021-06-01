
import java.util.Scanner;

public class b_10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] arr = new int[26];
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            } else {
                continue;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

}
