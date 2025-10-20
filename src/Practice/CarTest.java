// Description: Java에서 클래스를 정의하고, 해당 클래스로부터 객체를 생성하는 표준 Best Practice 코드입니다.

// 1. 클래스 정의 (설계도 만들기)
// class Car {: 'Car'라는 이름의 클래스를 정의합니다. 자동차의 설계도입니다.
class Car {
    // 속성 (Attributes / Fields): 자동차가 가지는 데이터
    // String color;: 자동차의 '색상'이라는 문자열 속성을 정의합니다.
    String color;
    // int speed;: 자동차의 '속도'라는 정수 속성을 정의합니다.
    int speed;

    // 행동 (Behaviors / Methods): 자동차가 할 수 있는 기능
    // void speedUp() {: 'speedUp'이라는 이름의 행동(메소드)을 정의합니다.
    void speedUp() {
        // speed = speed + 10;: 속성(speed)의 값을 10 증가시킵니다.
        speed = speed + 10;
        // System.out.println("속도를 10 올립니다. 현재 속도: " + speed);: 결과를 출력합니다.
        System.out.println("속도를 10 올립니다. 현재 속도: " + speed);
    }
}

// 프로그램을 실행하기 위한 별도의 클래스
// public class Main {: 프로그램을 실행하기 위한 Main 클래스입니다.
public class CarTest {
    // public static void main(String[] args) {: 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 2. 객체 생성 (설계도로부터 실제 제품 만들기)
        // Car myCar = new Car();: Car 클래스(설계도)를 사용해 'myCar'라는 이름의 새로운 Car 객체(실체)를 생성합니다.
        Car myCar = new Car();
        // Car yourCar = new Car();: Car 클래스(설계도)를 사용해 'yourCar'라는 또 다른 Car 객체(실체)를 생성합니다.
        Car yourCar = new Car();

        // 3. 객체 사용 (생성된 제품 사용하기)
        // myCar.color = "빨간색";: 'myCar' 객체의 color 속성에 "빨간색"이라는 값을 할당합니다.
        myCar.color = "빨간색";
        // yourCar.color = "파란색";: 'yourCar' 객체의 color 속성에 "파란색"이라는 값을 할당합니다.
        yourCar.color = "파란색";

        // myCar.speedUp();: 'myCar' 객체의 speedUp() 메소드를 호출하여 속도를 올립니다.
        myCar.speedUp();


        // System.out.println("내 차의 색상: " + myCar.color + ", 속도: " + myCar.speed);: 'myCar' 객체의 현재 상태를 출력합니다.
        System.out.println("내 차의 색상: " + myCar.color + ", 속도: " + myCar.speed);
        // System.out.println("네 차의 색상: " + yourCar.color + ", 속도: " + yourCar.speed);: 'yourCar' 객체의 현재 상태를 출력합니다.
        System.out.println("네 차의 색상: " + yourCar.color + ", 속도: " + yourCar.speed);
    }
}

