package day10.inter;

import day10.inter.animal.Animal;
import day10.inter.animal.Pet;

public class Duck extends Animal implements Pet, Wild{

    @Override
    public void handle() {
        this.age = 3;
    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {

    }
}
