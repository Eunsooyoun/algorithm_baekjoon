
import java.util.Scanner;
import java.util.Stack;

public class b_9012 {
    // 20210130
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String isTrue = "";
            stack.clear();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(0) == ')') {
                    isTrue = "NO";
                    break;
                }
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                } else {
                    if (stack.size() > 0) {
                        stack.pop();
                    } else {
                        isTrue = "NO";
                        break;
                    }
                }
            }

            if (isTrue.equals("")) {
                if (!stack.isEmpty()) {
                    isTrue = "NO";
                    System.out.println(isTrue);
                } else {
                    isTrue = "YES";
                    System.out.println(isTrue);
                }
            } else {
                System.out.println(isTrue);
            }
        }

        sc.close();

    }

}
