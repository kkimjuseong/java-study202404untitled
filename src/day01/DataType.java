package day01;

public class DataType {
    public static void main(String[] args) {

        // 정수형 4개의 type
        // 1byte = 8bit
        // 1bit = 숫자 0이나 1을 지정할 수 있음.
        // 1,0(부호비트) 1111111 => 64 + 32 + 16 + 8 + 4 + 2 + 1 = 127
        byte a = 127;           // 1byte
        short b = 32767;        // 2byte

        int c = 2147483647;     // 4byte

        long d = 2147483647123123L;    // 8byte
        System.out.println(d);


        // 실수형 2가지 type
        float e = 3.141596265F;
        double f = 3.14159265358979323846;
        double g = 314; // 정수저장가능
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        // 논리형 boolean
        boolean flag1 =true;
        boolean flag2 = 10 > 5;

        // 문자나 정수, 실수, 논리형을 작성후 컨트롤 알트 v 누르면 자동으로 type을 입력시켜줌.

        // double random = Math.random();


        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);


        // 문자형 char : 2byte
        char text = 44032;
        System.out.println("text = " + text);

        // 문자열 : 문자배열
        char [] hello = {'안', '녕', '하', '세', '요'};
        System.out.println("hello = " + new String(hello));

        String hello2 = "안녕하세요";
        System.out.println("hello2 = " + hello2);
    }
}

// 이거야
