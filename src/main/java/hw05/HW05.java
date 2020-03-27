package hw05;

public class HW05 {
    public static void main(String[] args) {
        String[] habits = {"play", "eat", "sleep"};
        Human father = new Human("Ali", "Aliyev", 1975);
        Human mother = new Human("Nur", "Aliyev", 1979);
        Family family = new Family(father, mother);
        Human son = new Human("B1", "Aliyev", 1950);
        Human daughter = new Human("G1", "Aliyev", 1954);
        Human son2 = new Human("B2", "Aliyev", 1978, 100,
                new String[][]{{"MONDAY", "Task_1"}, {"TUESDAY", "task_2"}, {"FRIDAY", "Task3"}}, family);
        Pet pet = new Pet("Cat", "Mesi", 4, 60, habits);

        family.addChild(son);
        family.addChild(daughter);
        family.setPet(pet);
        family.addChild(son2);

        System.out.println(family);

    }
}
