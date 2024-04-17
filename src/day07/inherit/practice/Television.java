package day07.inherit.practice;
/*
서브 클래스 Television 생성

ElectronicProduct 의 서브 클래스입니다.
추가 속성:
screenSize (화면 크기, 정수형)
메소드:
생성자: 기본 클래스의 속성과 screenSize를 초기화합니다.
displayInfo() 메소드를 오버라이드하여 화면 크기 정보도 포함하여 출력합니다.
 */
public class Television extends ElectronicProduct {

    // 추가 속성
    private int screenSize;

    // 생성자
    public Television(String productName, double price, String manufacturer, int screenSize) {
        // 상위 클래스의 생성자를 호출하여 초기화
        super(productName, price, manufacturer);
        this.screenSize = screenSize;
    }

    // displayInfo 메소드 오버라이드
    @Override
    public void displayInfo() {
        // 상위 클래스의 displayInfo 메소드 호출
        super.displayInfo();
        // 화면 크기 정보 추가 출력
        System.out.println("화면 크기: " + screenSize + "인치");
    }

}
