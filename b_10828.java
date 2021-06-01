
import java.util.Scanner;

public class b_10828 {
    // stack 구현 20210131

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); // 매번 sysout 찍으면 timeout남...
        int n = sc.nextInt();
        Stack st = new Stack();
        for (int i = 0; i <= n; i++) {
            String s = sc.nextLine();
            if (s.startsWith("push")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                st.push(num);
            }
            if (s.equals("pop")) {
                sb.append(st.pop()).append("\n");
                // System.out.println(st.pop());
            }
            if (s.equals("size")) {
                sb.append(st.size()).append("\n");
                // System.out.println(st.size());
            }
            if (s.equals("empty")) {
                sb.append(st.isEmpty()).append("\n");
                // System.out.println(st.isEmpty());
            }
            if (s.equals("top")) {
                sb.append(st.top()).append("\n");
                // System.out.println(st.top());
            }
        }
        System.out.println(sb);
        sc.close();
    }

}

class Stack {
    int[] arr = new int[10000];
    int top = 0;

    int pop() {
        if (top == 0) {
            return -1;
        }
        return arr[--top];
    }

    void push(int x) {
        arr[top++] = x;
    }

    int size() {
        return top;
    }

    int isEmpty() {
        if (top == 0) {
            return 1;
        }
        return 0;
    }

    int top() {
        if (top == 0) {
            return -1;
        }
        return arr[top - 1];
    }
}