package day02;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // 배열의 특징
        // 1. 동족 모음 구조 : 같은 타입의 데이터만 배열에 담을 수 있음
        // 2. 크기가 불편함 : 크기를 동적으로 늘이거나 줄일 수 없음

        // 배열의 생성 순서
        // 1. 배열 변수 선언
        int[] numbers; // 정수 배열 타입

        // 2. 배열의 객체를 생성
        numbers = new int[5];
        System.out.println("numbers = " + numbers);

        // 3. 배열 값 초기화
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;  // 가능하긴 한데 66만 출력됨
        numbers[3] = numbers[0] + 20;
        numbers[4] = 100;

        // 배열의 길이
        System.out.println(numbers.length);

        // 배열의 순회
        System.out.println("================================");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("number[%d]: %d\n", i, numbers[i]);
        }

        System.out.println("==================================");

        // 배열 순회 foreach , 단축기 : iter
        // for에 커서 가져다 대고 Alt엔터 누르면 쉽게 변경가능한 좋은 기능
        for (int n : numbers) {
            System.out.println("n = " + n);
        }

        // 배열 내부 간결하게 출력
        System.out.println(Arrays.toString(numbers));

        // 배열 한번에 만들기
        int[] pointList = new int[]{10, 20, 30, 40};
        System.out.println(Arrays.toString(pointList));

        // 만약 배열변수 선언과 동시에 값을 초기화 한다면
        // new type[] 생략 가능
        // 그 이후 배열을 추가하고 싶을땐 new type[]을 써줘야 함
        // pets = new String[] {"asd", "asd"};
        String[] pets = {"멍멍이", "짹짹이", "콩순이"};

        // 배열을 생성만 하고 값을 안 넣으면?
        // -> 각 타입의 기본값으로 미리 값을 넣어 놓음
        // 기본값: 정수 0, 실수 0.0, 논리 false, 문자(char): 공백, 기타: null

        byte[] bArr = new byte[3];
        double[] dArr = new double[6];
        boolean[] blArr = new boolean[4];
        String[] sArr = new String[5];


        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(blArr));
        System.out.println(Arrays.toString(sArr));
        System.out.println(bArr.length);

    }
    static int[] getNumbers() {
        return new int[] {50, 30, 10};
    }

}
