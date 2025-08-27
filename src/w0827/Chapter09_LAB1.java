package w0827;

import java.util.Calendar;
import java.util.Random;

public class Chapter09_LAB1 {
    public static void main(String[] args) {
        String[] wiseSay ={
                "■ 인생이 행복해지는 비결은 끊임없이 작은선물을 받는 것이다.    - 아이리스 머독",

                "■ 전문가란 자기 주제에 관해서 저지를 수 있는 모든 잘못을  이미 저지른 사람이다.   - N.보르-",

                "■ 눈물로 씻겨지지 않은 슬픔은 몸을 울게 만든다. 특히 분노는 심한 마음의 통증을 일으키고 몸의 질병으로 나타난다. - 영국 의사, 핸리 모즐리-",

                "■ 모든 사람을 기쁘게 할수는 없다. 만약 그렇게 하려고 애를 쓴다면 기쁘게 해주지 못할 단 한 사람은 바로 당신 자신이다. - 원씽 중에서-",

                "■ 실패는 언제나 찾아오는 친구이며 성공은 어쩌다 찾아오는 손님이다. - 미르 임란",

                "■ 평범하다는 것은 '현대판 노예'라는 뜻이다. -부의 추월차선 중-",

                "■ 우리가 해야 할 일은 바로 자기가 잘하고 있는 일을 찾아내는 거야. 우리는 날마다 무슨 일인가를 훌륭하게 해내고 있으면서도 그런 작은 성공을 스스로 알아채지 못하고 있어. -스펜서 존슨의 <멘토>",

                "■ 매일 1퍼센트의 차이가 3개월을 넘기면 100퍼센트의 차이를 만든다는 사실을 기억하라. -사하 하셰미'-"
        };



        Random rand = new Random();

        int todayIndex = rand.nextInt(wiseSay.length); //   (int)(Math.random()*wiseSay.length);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%d년 %d월 %d일 오늘의 명언 : %s \n" ,year ,month ,day, wiseSay[todayIndex]);
    }
}