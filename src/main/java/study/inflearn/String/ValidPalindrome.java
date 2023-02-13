package study.inflearn.String;

import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome t = new ValidPalindrome();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(t.solution(s));
    }

    public String solution(String s) {
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) {
            return "YES";
        }


        return "NO";
    }

}
