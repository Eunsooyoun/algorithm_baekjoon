import java.util.Arrays;
import java.util.Scanner;

public class b_1107 {
    static boolean[] broken = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int channel = sc.nextInt();
        int cnt = sc.nextInt();
        Arrays.fill(broken, false);
        for (int i = 0; i < cnt; i++) {
            broken[sc.nextInt()] = true;
        }

        int ans = channel - 100; // n>=100
        if (ans < 0) {
            ans = -ans; // 숫자버튼 이용하지 않고 이동하는 횟수
        }

        for (int i = 0; i <= 1000000; i++) { // 0 ~ 50만이니까 ~100만까지
            int c = i;
            int len = isPossible(c);
            if (len > 0) {
                int press = c - channel;
                if (press < 0) {
                    press = -press;
                }
                if (ans > len + press) {
                    ans = len + press;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }

    public static int isPossible(int channel) {
        if (channel == 0) {
            return (broken[0]) ? 0 : 1;
        }
        int len = 0;
        while (channel > 0) {
            if (broken[channel % 10])
                return 0;
            len += 1;
            channel /= 10;
        }

        return len;
    }
}
