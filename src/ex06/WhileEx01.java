package ex06;

import java.util.Scanner;

public class WhileEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            System.out.println("사용자입력:" + num);
            if (num == 0) {
                break; // 반복문을 빠져나가는 키워드
            }

        }
    }
}