
import java.util.Scanner;

public class b_2164 {
    // 카드2 20210201

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 제일 앞의 카드 버림
        // 그다음 카드는 맨 뒤로
        // 위에 두개 반복

        Queue2 q = new Queue2();
        for (int i = 1; i <= n; i++) {
            q.push(i);
        }

        for (int i = 0; i < n; i++) {
            if (q.size() == 1) {
                System.out.println(q.last());
                break;
            }
            q.pop();
            // System.out.println("pop front : " + q.front);
            // System.out.println("pop rear : " + q.rear);
            // System.out.println("pop size : " + q.size);
            // System.out.println("pop arr : " + Arrays.toString(q.arr));
            q.shift();
            // System.out.println("shift front : " + q.front);
            // System.out.println("shift rear : " + q.rear);
            // System.out.println("shift arr : " + Arrays.toString(q.arr));
        }

        sc.close();
    }

}

class Queue2 {
    int[] arr = new int[1000000];
    int front = 0;
    int rear = 0;
    int size = 0;

    void push(int x) {
        arr[rear++] = x;
        size++;
    }

    int pop() {
        size--;
        return arr[front++];
    }

    void shift() {
        arr[rear++] = arr[front++];
    }

    int size() {
        return size;
    }

    int last() {
        return arr[front];
    }

}
