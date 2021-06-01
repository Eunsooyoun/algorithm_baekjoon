
import java.util.Scanner;

public class b_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int divide = a / b;
        sc.close();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(divide);
        System.out.println(a % b);
    }
}
