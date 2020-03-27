package hw07;

import hw07.person.Man;
import hw07.person.Woman;
import hw07.pets.DomesticCat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HW07 {
    public static void main(String[] args) throws Throwable {
        for (int i = 0; i < 1000; i++) {
            Human human = new Human();
            System.out.println("Human object created...");
        }

        Set<String> habits = new HashSet<>();
        habits.add("playing");
        habits.add("eat");
        habits.add("sleeping");
        habits.add("Pet is a creature.");

        HashMap<DayOfWeek, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.MONDAY, "HW");
        schedule.put(DayOfWeek.TUESDAY, "Sleep");
        schedule.put(DayOfWeek.WEDNESDAY, "HW");
        schedule.put(DayOfWeek.THURSDAY, "Reading");
        schedule.put(DayOfWeek.FRIDAY, "HW");
        schedule.put(DayOfWeek.SATURDAY, "GYM");
        schedule.put(DayOfWeek.SUNDAY, "HW");


        Man father = new Man("Ali", "Aliyev", 1974, schedule);
        father.repairCar();
        father.greetPet();
        Woman mother = new Woman("Nur", "Aliyev", 1978, schedule);
        mother.makeUp();
        mother.greetPet();
        Human son = new Human("B1", "Aliyev", 1997, schedule);
        Human daughter = new Human("G1", "Aliyev", 1999, schedule);
        Pet tom = new DomesticCat("Mesi", 2, 85, habits);
        Family family = new Family(father, mother, tom);
        family.addChild(son);
        family.addChild(daughter);
        System.out.println(family);
        family.finalize();
        mother.finalize();
        father.finalize();
    }
}

