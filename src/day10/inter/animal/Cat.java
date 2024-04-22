package day10.inter.animal;

import day10.inter.Aggressive;

public class Cat extends Animal implements Pet, Aggressive {
    @Override
    public void hunt(Pet pet) {

    }

    @Override
    public void violent() {

    }

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }
}
