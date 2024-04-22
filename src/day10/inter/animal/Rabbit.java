package day10.inter.animal;

import day10.inter.Wild;

public class Rabbit implements Pet, Wild {

    // 애완동물로 키울 수 있음
    @Override
    public void handle() {

    }

    // 예방접종
    @Override
    public boolean inject() {
        return false;
    }

    // 난폭함
    @Override
    public void violent() {

    }

    // 사냥 기능 없음


}
