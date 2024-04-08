package day02;

import java.util.Scanner;

public class StdlO {
    public static void main(String[] args) {
        // print 는 줄바꿈이 안됨

        String name = "김철수";
        // $s: 문자열 포맷팅, $d: 정수포맷팅, $f: 실수포맷팅, $c: 단일문자
        System.out.print("강아지");
        System.out.printf("$s의 고양이", name);
        // println은 줄바꿈이 됨
        System.out.println("강아지");
        System.out.println("강아지");

        // 자바에서 키보드 입력받기
        Scanner scan = new Scanner(System.in);

        // 문자 입력받기
        System.out.print("이름: ");
        String userName = scan.nextLine();
        System.out.println("userName = " + userName);

        // 정수 입력받기 - 문자를 입력받은 뒤 정수로 변환
        System.out.print("출생년도: ");
        int birthYear = Integer.parseInt(scan.nextLine());
        System.out.println("birthYear = " + birthYear);
    }
}
