package hw05;

public class HW05 {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            String[] habits = {"eat", "sleep", "play"};



        Human mother = new Human("Sevil", "Aliyeva", 1964);
        Human father = new Human("Rauf", "Aliyev", 1966);
        Pet succPet = new Pet("Doggie", "Succ barker");

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work.";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to course. watch films.";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "do more home work.";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "drinking tequila.";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "sleeping all of the day instead of working.";
        schedule[5][0] = "Friday";
        schedule[5][1] = "holy day. Drinking.";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "doing my home work again.";

         Family succFamily = new Family(new Human("SuccMan", "Islamzade", 1921, 98, schedule),
                 new Human("SuccWoman", "Islamzade", 1912,2, schedule));
        succFamily.addChild(mother);
        succFamily.addChild(father);
        System.out.println(succFamily);
        succFamily.deleteChild(mother);
        succFamily.setPet(succPet);
        System.out.println(succFamily);
    }
}
