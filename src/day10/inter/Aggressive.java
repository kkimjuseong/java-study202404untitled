package day10.inter;

import day10.inter.animal.Pet;

public interface Aggressive extends Huntable, Wild{
    void hunt(Pet pet);
    void violent();
}
