package hw11;

import hw11.controller.FamilyController;
import hw11.entity.Family;
import hw11.entity.human.Man;
import hw11.entity.human.Woman;
import hw11.entity.pet.Dog;
import hw11.entity.pet.DomesticCat;
import hw11.entity.pet.Pet;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws ParseException {
    Pet dog = new Dog("Jim");
    dog.setAge(15);
    dog.setTrickLevel(25);
    Set<String> habitsOfDog = new HashSet<>();
    habitsOfDog.add("sleep");
    habitsOfDog.add("eat");
    habitsOfDog.add("play");
    dog.setHabits(habitsOfDog);

    Pet cat = new DomesticCat("Tom");
    cat.setAge(3);
    cat.setTrickLevel(80);
    Set<String> habitsOfCat = new HashSet<>();
    habitsOfCat.add("run");
    habitsOfCat.add("play");
    habitsOfCat.add("sleep");
    cat.setHabits(habitsOfCat);

    // Kari family
    Woman motherBlack = new Woman("June", "Black", "1976/03/25");
    motherBlack.setIq(65);
    Man fatherBlack = new Man("Alex", "Black", "1970/04/02");
    fatherBlack.setIq(75);
    Family familyBlack = new Family(fatherBlack, motherBlack);

    // Imeno family
    Man fatherAliyev = new Man("Ali", "Aliye", "1981/02/10");
    fatherAliyev.setIq(75);
    Woman motherAliyev = new Woman("Nur", "Aliyev", "1983/01/20");
    motherAliyev.setIq(65);
    Family familyAliyev = new Family(fatherAliyev, motherAliyev);

    //family Watson
    Man fatherWhite = new Man("Piter", "White", "1980/05/12");
    fatherWhite.setIq(75);
    Woman motherWhite = new Woman("Yana", "White", "1985/06/14");
    motherWhite.setIq(65);
    Family familyWhite = new Family(fatherWhite, motherWhite);

    FamilyController familyController = new FamilyController();

    Man man1 = new Man("1111", "1111", "1991/01/01");
    Man man2 = new Man("2222", "2222", "1992/02/02");
    Man man3 = new Man("3333", "3333", "1993/03/03");
    Man man4 = new Man("4444", "4444", "1994/04/04");
    Man man5 = new Man("5555", "5555", "1995/05/05");
    Man man6 = new Man("6666", "6666", "1996/06/06");
    Man man7 = new Man("7777", "7777", "1997/07/07");
    Man man8 = new Man("8888", "8888", "1998/08/08");

    Man man = new Man("AAA", "BBB", "2000/07/18");
    Woman woman = new Woman("DDD", "FFF", "2001/09/15");
    familyController.createNewFamily(man,woman);

    familyController.adoptChild(familyBlack, man1);
    familyController.adoptChild(familyBlack, man4);
    familyController.bornChild(familyBlack, null, "June");

    familyController.adoptChild(familyAliyev, man2);
    familyController.adoptChild(familyAliyev, man6);
    familyController.adoptChild(familyAliyev, man7);

    familyController.adoptChild(familyWhite, man3);
    familyController.adoptChild(familyWhite, man5);
    familyController.bornChild(familyWhite, "Jack", null);

    familyController.saveFamily(familyBlack);
    familyController.saveFamily(familyAliyev);
    familyController.saveFamily(familyWhite);

    familyController.addPet(2, dog);
    familyController.addPet(3, cat);

    familyController.getAllFamilies();
    familyController.displayAllFamilies();
    familyController.count();
    familyController.getFamiliesBiggerThan(2);
    familyController.getFamiliesLessThan(5);
    familyController.countFamiliesWithMemberNumber(4);
    familyController.deleteFamilyByIndex(1);
    familyController.deleteFamily(familyBlack);
    familyController.deleteAllChildrenOlderThen(17);
    familyController.displayAllFamilies();
    familyController.getPets(1);
    familyController.getFamilyById(1);
  }
}
