package hw07.person;

import hw07.DayOfWeek;
import hw07.Family;
import hw07.Human;

import java.util.Map;

public class Woman extends Human {
    Woman() {
        super();
    }

    Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    Woman(String name, String surname, int year, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, schedule);
    }

    Woman(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule, family);
    }

    public void makeUp() {
        System.out.println("Now I am ready.");
    }

    @Override
    public void greetPet() {
        System.out.printf("Hello, %s\n", getFamily().getPet().toString());
    }
}
