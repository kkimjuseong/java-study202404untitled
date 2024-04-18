package Util;

import java.util.Scanner;

// 역학 : 스캐너 입력을 간소화해주는 객체
public class SimpleInput {

    // 뒤에 new를 바로 적어주면 안됨.
//    private static Scanner sc = new Scanner(System.in);
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    //문자열 입력을 처리
    public static String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }


    // 엔터를 누르기 전까지 멈춰있는 기능
    public void stopInput(){
        System.out.println("\n====== 엔터를 누르면 계속.. ======");
        sc.nextLine();
    }
}
