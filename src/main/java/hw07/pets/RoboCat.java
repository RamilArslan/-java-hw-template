package hw07.pets;

import hw07.Pet;
import hw07.Species;

public class RoboCat extends Pet {
    public RoboCat() {
        super();
                setSpecies(Species.UNKNOWN);

    }

    public RoboCat(String nickname) {
        super(nickname);
                setSpecies(Species.UNKNOWN);

    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
                setSpecies(Species.UNKNOWN);

    }

    @Override
    public void eat() {
        System.out.println("Robot cat wants to it but it can't");
    }

    @Override
    public void foul() {
        System.out.println("Miau))))))))");
    }
    @Override
    public void respond() {
        System.out.println("Hello, owner. I am — " + super.getNickname() + ". I am a fuckin' robot! !!!!");
    }

}
