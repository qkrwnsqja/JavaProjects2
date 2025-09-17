package Practice;

public class LoopExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        //for (타입 변수명 : 배열) 구조를 통째로 외웁니다.
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}