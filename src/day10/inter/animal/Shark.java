package day10.inter.animal;

public class Shark extends Animal implements Aggressive {

    // 사냥 기능
    @Override
    public void hunt(Pet pet) {
        this.age = 120;
    }

    // 난폭한 성격
    @Override
    public void violent() {

    }



    // 애완동물로는 부적합
}
