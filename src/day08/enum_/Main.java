package day08.enum_;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.orderPizza();
        pizza.readyPizza();
        pizza.deliverPizza();

        System.out.println("Pizza.getStatus() = " + Pizza.getStatus().getDescription());

    }
}
