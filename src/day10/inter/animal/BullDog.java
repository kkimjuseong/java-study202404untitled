package day10.inter.animal;

public class BullDog extends Animal implements Pet, Aggressive {

    // 애완동물로 키울 수 있음
    @Override
    public void handle() {
        this.age = 10;
    }

    // 예방접종
    @Override
    public boolean inject() {
        return false;
    }

    // 사냥 기능
    @Override
    public void hunt(Pet pet) {

    }

    // 난폭함
    @Override
    public void violent() {

    }



}
