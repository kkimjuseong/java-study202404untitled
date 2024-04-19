package day09.poly.car;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

//        Sonata[] sArr = {sonata1, sonata2, sonata3, new Sonata()};
//        for (Sonate sonate : sArr) {
//            Sonata.accelerate();
//        }

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

//        Tucson[] tArr = {tucson1, tucson2, new Tucson()};


        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종모음 배열을 구현할 수 있다.
        Car[] cArr = {sonata1, tucson1, mustang1};
        for (Car car : cArr) {
            car.accelerate();
        }

        Object[] sArr = {"abc", "def", 100, false};

        System.out.println("===============================");

        Driver driver = new Driver();
        driver.drive(new Sonata());

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car [] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("====================");

        CarShop shop = new CarShop();

        // 객체 타입에서 다운캐스팅의 전제조건 : 반드시!! 상속관계가 있어야하며
        // 자식객체가 부모다입으로 업 캐스딩 된 것만 가능하다.
        // 즉 , 부모객체를 자식타입으로 내릴 수는 없다.
        Sonata car = (Sonata) shop.exportCar(3000);
        car.accelerate();
        car.joinSonataClub();

        System.out.println("==========================");


//        Sonata ccc = (Sonata) new Car();
//        Sonata mmm = (Sonata) new Mustang();
        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;


        System.out.println("==========================");

        driver.drive(new Tucson());

    }
}
