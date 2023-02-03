package study.inflearn.String;

import java.util.Scanner;

public class FindText {

    public static void main(String[] args) {
        FindText t = new FindText();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(t.solution(str, c));
    }

    public int solution(String str, char c) {
        int answer = 0;
        for (char aChar : str.toUpperCase().toCharArray()) {
            if (aChar == Character.toUpperCase(c)) {
                answer++;
            }
        }

        return answer;
    }
}