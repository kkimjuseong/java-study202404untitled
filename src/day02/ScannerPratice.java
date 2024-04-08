package day02;

import java.util.Scanner;

public class ScannerPratice {
    public static void main(String[] args) {
        // 상품의 가격: 5000
        // 상품의 수량:
        // 상품 재고 총액 :
        Scanner scan = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("상품의 가격: " );
        int price = Integer.parseInt(scan.nextLine());
        System.out.print("상품의 수량: ");
        int amount = Integer.parseInt(scan.nextLine());
        System.out.print("상품 재고 총액: " + price * amount + "원");

    }
}
