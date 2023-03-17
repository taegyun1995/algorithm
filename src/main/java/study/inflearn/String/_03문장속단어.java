package study.inflearn.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _03문장속단어 {

    public static void main(String[] args) {
        _03문장속단어 t = new _03문장속단어();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        String answer = "";

        String[] words = s.split("\\s+");
        answer = Arrays.stream(words)
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        return answer;
    }

}