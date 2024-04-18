package day08.static_.retailer;
/*
클래스 Store 생성

속성:
totalSales (총 판매액, 정수형, static 변수)
메소드:
addSale(int amount): 판매액을 총 판매액에 추가하는 static 메소드.
getTotalSales(): 현재까지의 총 판매액을 반환하는 static 메소드.
 */
public class Store {

    // 총 판매액을 나타내는 static 변수
    private static int totalSales = 0;

    // 판매액을 총 판매액에 추가
    public static void addSale(int amount) {
        totalSales += amount;
    }

    // 현재까지의 총 판매액을 반환
    public static int getTotalSales() {
        return totalSales;
    }
}
