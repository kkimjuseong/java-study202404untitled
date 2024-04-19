package day09.poly.car;

public class Driver {

    public void drive(Car car){

        String carName = "";
        if(car instanceof Sonata){
            carName = "Sonata";
        } else if (car instanceof Tucson) {
            carName = "Tucson";
        } else if (car instanceof Mustang) {
            carName = "Mustang";
        }

        System.out.println(car instanceof Sonata);

        System.out.println("운전을 시작합니다.");
        car.accelerate();
    }
}
