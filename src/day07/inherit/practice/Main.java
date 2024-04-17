package day07.inherit.practice;

/*
구현할 사항
Main 클래스에 main 메소드를 구현하여, 각각의 제품 (TV와 스마트폰) 인스턴스를 하나씩 생성하고, 각 제품의 정보를 출력하는 코드를 작성합니다.
 */
    // Main 클래스와 main 메소드
    public class Main {
        public static void main(String[] args) {

            Television tv = new Television("Samsung TV", 2000000, "Samsung", 55);
            Smartphone phone = new Smartphone("iPhone 13", 890000, "Apple", 256);

            System.out.println("TV Info:");
            tv.displayInfo();

            System.out.println("\nSmartphone Info:");
            phone.displayInfo();

        }
    }

