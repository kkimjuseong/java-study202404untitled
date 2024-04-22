package day10.inter.animal;

public class Duck extends Animal implements Pet, Wild {

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
