package study.programmers;

import java.util.Scanner;

public class CalculateTheShortfall {

    public static void main(String[] args) {
        CalculateTheShortfall T = new CalculateTheShortfall();
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int count = sc.nextInt();
        System.out.println(T.solution(price, money, count));
    }

    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;
        for (int i = 1; i <= count; i++) {
            answer = (long) price * i;
            result += answer;
        }
        if (result < money) {
            return 0;
        } else {
            return result - money;
        }

//        return Math.max(price * (count * (count + 1) / 2) - money, 0);

//        long answer = -1;
//        answer = (long)price*count*(count+1)/2 - money;
//        return answer<=0?0:answer;
    }

}
