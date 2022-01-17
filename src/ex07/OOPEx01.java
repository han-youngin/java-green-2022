package ex07;

class Car {

    static int speed = 90;

}

public class OOPEx01 {
    public static void main(String[] args) {
        // new는 힙에 할당하라는 키워드
        // Car 클래스가 가지고 있는 스태틱 아닌 모든것들이 힙에 뜬다
        Car s1 = new Car();

    }
}
