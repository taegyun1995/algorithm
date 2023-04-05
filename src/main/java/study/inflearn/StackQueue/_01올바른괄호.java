package study.inflearn.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class _01올바른괄호 {

    public static void main(String[] args) {
        _01올바른괄호 t = new _01올바른괄호();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

}