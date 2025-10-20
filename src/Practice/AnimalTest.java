// Description: Java에서 'extends' 키워드를 사용해 상속 관계를 구현하는 표준 Best Practice 코드입니다.

// 1. 부모 클래스 정의 (Superclass)
// class Animal {: 'Animal'(동물)이라는 이름의 부모 클래스를 정의합니다.
class Animal {
    // String name;: 동물의 '이름' 속성을 정의합니다.
    String name;

    // void eat() {: 'eat'(먹다)라는 행동(메소드)을 정의합니다.
    void eat() {
        // System.out.println(name + "이(가) 식사 중입니다.");: 동물이 식사 중임을 출력합니다.
        System.out.println(name + "이(가) 식사 중입니다.");
    }
}

// 2. 자식 클래스 정의 (Subclass)
// class Dog extends Animal {: 'Dog'(개) 클래스가 'Animal' 클래스를 상속받는다고 정의합니다.
class Dog extends Animal {
    // void bark() {: 'Dog' 클래스만이 가지는 고유한 행동인 'bark'(짖다) 메소드를 정의합니다.
    void bark() {
        // System.out.println(name + "이(가) 멍멍 짖습니다!");: 개가 짖는 소리를 출력합니다.
        System.out.println(name + "이(가) 멍멍 짖습니다!");
    }
}

// 프로그램을 실행하기 위한 클래스
public class AnimalTest {
    public static void main(String[] args) {
        // 3. 자식 클래스의 객체 생성 및 사용
        // Dog myDog = new Dog();: 자식 클래스인 Dog로부터 'myDog' 객체를 생성합니다.
        Dog myDog = new Dog();

        // myDog.name = "바둑이";: 부모(Animal)로부터 물려받은 'name' 속성에 값을 할당합니다.
        myDog.name = "바둑";

        // myDog.eat();: 부모(Animal)로부터 물려받은 'eat()' 메소드를 호출합니다.
        myDog.eat();

        // myDog.bark();: 자식(Dog) 클래스 자신에게만 있는 'bark()' 메소드를 호출합니다.
        myDog.bark();
    }
}

