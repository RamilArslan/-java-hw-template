package hw07.pets;

import hw07.Pet;
import hw07.Species;

import java.util.Set;

public class Dog extends Pet {

    Dog() {
        super();
    }

    Dog(String nickname) {
        super(nickname);
        species = Species.DOG;
    }

    Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        species = Species.DOG;
    }

    @Override
    public void respond() {
        System.out.printf("AUUUUUUUU, i am %s\n",getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Foul method in Dog class.");
    }
}
