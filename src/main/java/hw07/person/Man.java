package hw07.person;

import hw07.Family;
import hw07.Human;

public class Man extends Human {
    Man() {
        super();
    }

    Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    Man(String name, String surname, int year, int iq, Family family, String[][] schedule) {
        super(name, surname, year, iq, schedule, family);
    }

    public Man(String name, String surname, int year, String[][] schedule) {
        super(name, surname, year, schedule);
    }

    ///METHODS
    public void repairCar() {
        System.out.println("Car was broken. I am reparing(((");
    }

    @Override
    public void greetPet() {
        System.out.printf("Hello, %s\n", getFamily().getPet().getNickname());
    }

}
