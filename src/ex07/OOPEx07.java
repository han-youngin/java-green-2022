package ex07;

import javax.print.attribute.standard.PresentationDirection;

class Person {
    String name;
    int height;
    int weight;

    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 만들어진다.
    // 클래스명(){}
    // 디폴트 생성자= 객체의 초기화를 위해 필요!!

    // 디폴트 생성자
    Person() {
        System.out.println("사람이 생성되었습니다.");
        name = "홍길동";
        height = 170;
        weight = 70; // 이렇게 하면 값이 고정이니까 이렇게 쓰지는 않는다 위에 변수 초기화 하는것과 다를게 없음
    }
}

// 생성자
public class OOPEx07 {
    public static void main(String[] args) {
        Person s1 = new Person();
    }
}
