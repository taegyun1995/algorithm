package study.inflearn.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class _02괄호문자제거 {

    public static void main(String[] args) {
        _02괄호문자제거 t = new _02괄호문자제거();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            answer.append(stack.get(i));
        }

        return answer.toString();
    }

}