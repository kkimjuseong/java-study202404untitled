package day07.inherit.practice;

/*
기본 클래스 ElectronicProduct 생성

이 클래스는 모든 전자 제품의 기본이 되는 클래스입니다.
속성:
productName (제품명, 문자열)
price (가격, 실수형)
manufacturer (제조사, 문자열)
메소드:
생성자: 모든 속성을 매개변수로 받아 초기화합니다.
displayInfo(): 제품의 정보를 출력하는 메소드. 출력 예: "Samsung TV, 가격: 2000000원, 제조사: Samsung"
 */
public class ElectronicProduct {

    String productName;
    double price;
    String manufacturer;

    // 생성자
    public ElectronicProduct(String productName, double price, String manufacturer) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    // 제품 정보를 출력하는 메소드
    public void displayInfo() {
        System.out.println(productName + ", 가격: " + price + "원, 제조사: " + manufacturer);
    }
}
