package ex06;

public class WhileEx03 {
    public static void main(String[] args) {
        // 동전 구하기 게임 (500,100,50,10)
        int money = 2680;

        int coin;
        int restMoney = money;
        // 1. 500원 동전 구하기
        coin = 500;
        System.out.println(coin + "원 ==========");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;
        // 2.100원 동전 구하기
        coin = 100;
        System.out.println(coin + "1원 ==========");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;
        // 3.50원 동전 구하기
        coin = 50;
        System.out.println(coin + "원 ==========");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;
        // 4.10원 동전 구하기
        coin = 10;
        System.out.println(coin + "원 ==========");
        System.out.println(restMoney / coin + "개");
    }
}
