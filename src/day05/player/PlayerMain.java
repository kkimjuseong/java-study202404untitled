package day05.player;

public class PlayerMain {

    public static void main(String[] args) {

        Player parking = new Player("주차왕파킹");
        Player insultking = new Player("욕설왕뻐킹");

        System.out.println("parking: " + parking);
        System.out.println("insultking: " + insultking);

        parking.attack(insultking);
        parking.attack(insultking);
        parking.attack(insultking);

        Player p1 = new Player("하하호호");


    }
}
