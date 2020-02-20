package hw05;

public class HW04 {
    public static void main(String[] args) {
        Human mother = new Human("Sevil", "Aliyeva", 1964);
        Human father = new Human("Rauf", "Aliyev", 1966);

        Family succFamily = new Family(new Human("SuccMan", "Islamzade",1921), new Human("SuccWoman", "Islamzade",1912));
        succFamily.addChild(mother);
        succFamily.addChild(father);
        System.out.println(succFamily);
        succFamily.deleteChild(mother);
        System.out.println(succFamily);
    }
}
