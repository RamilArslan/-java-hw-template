package hw04;

public class HW04 {
    public static void main(String[] args) {
        Human mother = new Human("Sevil", "Aliyeva", 1964);
        Human father = new Human("Rauf", "Aliyev", 1966);
        Human grandMother = new Human("Zerife", "Aliyeva", 1915);

        Pet doggie = new Pet("Doggie", "BASS");
        mother.setMother(grandMother);
        Human child = new Human("Zaur", "Aliyev", 1997, 90, doggie, mother, father,new int[1][1]);
        System.out.println(child.toString());
    }
}
