package day10.inter.animal;

public interface Aggressive extends Huntable, Wild {
    void hunt(Pet pet);
    void violent();
}
