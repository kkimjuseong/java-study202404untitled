package day04;

public class FieldAndLocal {

    // 필드는 값을 초기화 하지 않아도 각 타입의 기본값으로 자동 셋팅이 된다.
    // 이유는 저장공간이 사실상 무한하기 때문에
    // 정수 : 0 , 실수 : 0.0 , 논리 : false , 문자(char) : '공백' , 나머지 null
    int aaa;

    // css = 매개 변수 (parameter) - 메서드 호출시 반드시 필요한 인자값.
    void foo(int ccc){
        int bbb = 20;
        // foo라는 함수에는 저장공간을 줋이기 위해 값을 넣어주지 않으면
        // 오류가 나게된다.0

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
