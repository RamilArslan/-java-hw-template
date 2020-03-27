package hw04;

public class HW04 {
    public static void main(String[] args) {
        Pet pet = new Pet("Dog", "Max", 5, 80, new String[]{"eat", "drink", "sleep"});

        Human mother = new Human("Nur", "Aliyev", 1970);

        Human father = new Human("Ali", "Aliyev", 1968);

        Human child = new Human("Veli", "Aliyev",
                1977, 90, pet, mother, father, new String[][]{{"day1", "day2"}, {"task1", "task2"}});
        child.greetPet();
        child.describePet();

        System.out.println(pet);
        System.out.println(child);
    }
}
