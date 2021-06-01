
import java.util.Scanner;
import java.util.Stack;

public class b_10773 {
    // 20210130
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();

            if (a != 0) {
                s.push(a);
            } else {
                s.pop();
            }
        }
        sc.close();
        int size = s.size();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += (int) s.pop();
        }

        System.out.println(sum);
    }

}
