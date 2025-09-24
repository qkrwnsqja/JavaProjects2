package Practice;

public class WhileExample {
    public static void main(String[] args) {
        // number 변수에 100을 저장합니다.
        int number = 100;
        // number가 10보다 큰 동안에는 계속 반복합니다.
        while (number > 10) {
            //number의 현재 값을 출력합니다.
            System.out.println(number);
            // number를 2로 나눈 값을 다시 number에 저장합니다.
            number = number / 2;
        }
    }
}