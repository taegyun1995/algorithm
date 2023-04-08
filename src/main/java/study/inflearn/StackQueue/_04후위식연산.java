package study.inflearn.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class _04후위식연산 {

    public static void main(String[] args) {
        _04후위식연산 t = new _04후위식연산();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(t.solution(s));
    }

    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (Character x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(Integer.parseInt(x.toString()));
            }
            if (x.equals('+')) {
                answer = stack.get(stack.size() - 2) + stack.peek();
                stack.pop();
                stack.pop();
                stack.push(answer);
            }
            if (x.equals('*')) {
                answer = stack.get(stack.size() - 2) * stack.peek();
                stack.pop();
                stack.pop();
                stack.push(answer);
            }
            if (x.equals('-')) {
                answer = stack.get(stack.size() - 2) - stack.peek();
                stack.pop();
                stack.pop();
                stack.push(answer);
            }
            if (x.equals('/')) {
                answer = stack.get(stack.size() - 2) / stack.peek();
                stack.pop();
                stack.pop();
                stack.push(answer);
            }
        }

        return answer;
    }

}