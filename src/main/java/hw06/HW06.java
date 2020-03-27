package hw06;

class Main {
    public static void main(String[] args) throws Throwable {
        for (int i = 0; i < 1000000; i++) {
            Human human = new Human();
            System.out.println("Human object created...");
        }

        String[] habits = {"eat", "sleep", "playing", "Pet is a creature."};

        String[][] schedule = new String[2][7];
        schedule[0][0] = DayOfWeek.MONDAY.name();
        schedule[0][1] = DayOfWeek.TUESDAY.name();
        schedule[0][2] = DayOfWeek.WEDNESDAY.name();
        schedule[0][3] = DayOfWeek.THURSDAY.name();
        schedule[0][4] = DayOfWeek.FRIDAY.name();
        schedule[0][5] = DayOfWeek.SATURDAY.name();
        schedule[0][6] = DayOfWeek.SUNDAY.name();
        schedule[1][0] = "HW";
        schedule[1][1] = "Sleep";
        schedule[1][2] = "HW";
        schedule[1][3] = "Reading";
        schedule[1][4] = "HW";
        schedule[1][5] = "GYM";
        schedule[1][6] = "Hw";

        Human father = new Human("Ali", "Aliyev", 53, schedule);
        Human mother = new Human("Nur", "Aliyev", 50, schedule);
        Human son = new Human("B1", "Aliyev", 28, schedule);
        Human daughter = new Human("G1", "Aliyev", 25, schedule);
        Pet pet = new Pet(Species.DOG, "Dog", 2, 85, habits);

        System.out.println(pet);

        Family family = new Family(father, mother, pet);
        family.addChild(son);
        family.addChild(daughter);
        System.out.println(family);
        family.finalize();
        mother.finalize();
        father.finalize();
        pet.finalize();
    }
}
