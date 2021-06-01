
import java.util.Scanner;

public class b_18258 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        Queue q = new Queue();
        for (int i = 0; i <= n; i++) {
            String s = sc.nextLine();

            if (s.startsWith("push")) {
                int x = Integer.parseInt(s.split(" ")[1]);
                q.push(x);
            }
            if (s.equals("pop")) {
                sb.append(q.pop()).append("\n");
            }
            if (s.equals("size")) {
                sb.append(q.size()).append("\n");
            }
            if (s.equals("empty")) {
                sb.append(q.isEmpty()).append("\n");
            }
            if (s.equals("front")) {
                sb.append(q.front()).append("\n");
            }
            if (s.equals("back")) {
                sb.append(q.back()).append("\n");
            }
        }

        System.out.println(sb);
        sc.close();

    }

}

class Queue {
    int[] queue = new int[2000000];
    int front = 0;
    int rear = 0;
    int size = 0;

    void push(int x) {
        queue[rear++] = x;
        size++;
    }

    int pop() {
        if (rear == front) {
            return -1;
        }
        size--;
        return queue[front++];
    }

    int size() {
        return size;
    }

    int isEmpty() {
        if (rear == front) {
            return 1;
        }
        return 0;
    }

    int front() {
        if (rear == front) {
            return -1;
        }
        return queue[front];
    }

    int back() {
        if (rear == front) {
            return -1;
        }
        return queue[rear - 1];
    }

}
