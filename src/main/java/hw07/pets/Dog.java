package hw07.pets;

import hw07.Pet;
import hw07.Species;

public class Dog extends Pet {

    public Dog() {
        super();
        setSpecies(Species.DOG);
    }

    public Dog(String nickname) {
        super(nickname);
        setSpecies(Species.DOG);
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOG);
    }

    @Override
    public void eat() {
        System.out.println("I like when you spend your money on me)) Succ))");
    }

    @Override
    public void foul() {
        System.out.println("MUUUUUUU!");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am — " + super.getNickname() + ". Bark!!!!Bark!!Succ!!");
    }

}
