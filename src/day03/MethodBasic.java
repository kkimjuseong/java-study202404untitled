package day03;

import java.util.Scanner;

public class MethodBasic {

    // 자바의 함수는 반드시 클래스 블록 내부, 다른 함수 외부에 만들어야 함

    // 두개의 정수를 전달받아 합을 리턴하는 함수
    static int add(int n1,int n2) {

        return n1 + n2;  // function 대신 return값의 타입에 따라 바꿈 ex) return true 면 boolean add()
    }
//    static String[] add(int n1,int n2) {
//    return new String[]{"hello", "java"};
//
//    }

    static void multiply(int n1, int n2) { //void return 없음
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }
    // n개의 정수를 전닫받아 그 총합을 반환하는 함수
    static int addAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
    // 2개의 정수를 전달받아 사칙연산의 결과를 모두 리턴
    static int[] operate(int n1, int n2) {
        return new int[]{add(n1, n2), n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {
        // 함수를 호출할 때는 함수 안에서만 가능
        int r1 = add(10, 20);
        System.out.println("r1 = " + r1);

        // void 함수는 함수의 결과를 변수에 담을 수 없음
        // 반드시 단독호출해서 사용
        multiply(5,3);

        Math.random();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        // command 눌러서 커서가져다대면 타입 알 수 있음. 자바에서는 타입중요

        int r2 = addAll(new int[] {1,3,5,7,9});
        System.out.println("r2 = " + r2);

        int[] operateResultList = operate(20, 10);

        System.out.println("곱셈결과 = " + operateResultList[2]);

    } // end main method
}  // end class
