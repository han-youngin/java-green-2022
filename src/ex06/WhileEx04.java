package ex06;

import java.util.Scanner;

public class WhileEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 2680;
        int restMoney = money;
        while (true) {
            int coin = sc.nextInt();

            // 남은 동전 출력하는 로직

            System.out.println(coin + "원:" + restMoney / coin + "개");
            restMoney = restMoney % coin;

            // if문 break;
            if (coin == 10) {
                break;
            }
        }
    }
}
