package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        // else if(조건) => 그게 아니라 이것이라면
        int point = 10;
        if (point >= 90) {
            System.out.println("A학점");
        } else if (point >= 80) {// point가 89~90 사이라면?
            System.out.println("B학점");
        } else if (point >= 70) {
            System.out.println("C");
        } else if (point >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }// 메인 끝
}
