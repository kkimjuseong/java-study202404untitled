package day08.static_.retailer;
/*
클래스 Product 생성

속성:
productName (제품 이름, 문자열)
price (제품 가격, 정수형)
메소드:
생성자: productName과 price를 매개변수로 받아 초기화합니다.
sellProduct(): 제품을 판매하고 Store의 총 판매액을 업데이트합니다.
 */
public class Product {


    private String productName;
    private int price;

    // 생성자: 제품 이름과 가격을 초기화
    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    // 제품을 판매하고 Store의 총 판매액을 업데이트
    public void sellProduct() {
        // 판매액을 Store 클래스의 totalSales 에 추가
        Store.addSale(price);
    }
}
