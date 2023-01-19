package study.algorithm;

import java.util.Scanner;

public class CaseConversion {

    public StringBuilder solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) sb.append(Character.toUpperCase(x));
            else sb.append(Character.toLowerCase(x));
        }

        return sb;
    }

    public static void main(String[] args) {
        CaseConversion T = new CaseConversion();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
