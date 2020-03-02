package hw07.pets;

import hw07.Pet;
import hw07.Species;

public class DomesticCat extends Pet {
    public DomesticCat() {
        super();
        setSpecies(Species.CAT);

    }

    public DomesticCat(String nickname) {
        super(nickname);
        setSpecies(Species.CAT);

    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.CAT);

    }

    @Override
    public void eat() {
        System.out.println("Yemək lazım deyil QƏLYON çəkək");
    }

    @Override
    public void foul() {
        System.out.println("Gedək QƏLYON çəkək");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am — " + super.getNickname() + ". I'm not a domestic cat!!!!");
    }

}
