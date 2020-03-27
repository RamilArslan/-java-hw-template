package hw12.entity.pet;

import java.util.Set;

public class Dog extends Pet {
  public Dog() {
    super();
  }

  public Dog(String nickname) {
    super(nickname);
    species = Species.DOG;
  }

  public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
    super(nickname, age, trickLevel, habits);
    species = Species.DOG;
  }

  @Override
  public void foul() {
    System.out.println("..........");
  }

  @Override
  public void respond() {
    System.out.printf("AUUUUUUUU, i am %s\n", getNickname());
  }
}


