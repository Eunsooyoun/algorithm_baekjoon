import java.util.ArrayList;
import java.util.Scanner;

public class b_10819 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

    }

    public static int calc(int a, int b) {

    }

}
