package hw07.pets;


import hw07.Pet;
import hw07.Species;

public class Fish extends Pet {
    public Fish() {
        super();
                setSpecies(Species.FISH);

    }

    public Fish(String nickname) {
        super(nickname);
                setSpecies(Species.FISH);

    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
                setSpecies(Species.FISH);

    }

    @Override
    public void eat() {
        System.out.println("Fish eats dried piranha");
    }

    @Override
    public void foul() {
        System.out.println("...");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am — " + super.getNickname() + ". I'm not supposed to speak wtf!!!!");
    }


}
