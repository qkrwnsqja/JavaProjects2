package w0827;

import java.util.Arrays;

public class CloneArrayTest {
    public static void main(String[] args) {
//        복제가 아닌 경우
        String[] originArr1 = {"김치찌개", "잔치국수", "감자탕", "돈부리"};
        String[] originArr2 = originArr1;

        originArr1[1] = "라구파스타";
        originArr2[2] = "치즈돈까스";

        System.out.println(Arrays.toString(originArr1));
        System.out.println(Arrays.toString(originArr2));
//       복제되는 경우

        String[] originArr = {"다니엘", "민지", "해인", "혜린"};
        String[] cloneArr = originArr.clone();

        cloneArr[0] = "장원영";
        cloneArr[2] = "리즈";

        System.out.println(Arrays.toString(originArr));
        System.out.println(Arrays.toString(cloneArr));

    }
}
