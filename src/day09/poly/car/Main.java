package day09.poly.car;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Car sonata3 = new Sonata();

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

    }
}
