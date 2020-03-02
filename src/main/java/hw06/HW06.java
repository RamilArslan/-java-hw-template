package hw06;


import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

public class HW06 {
    public static void main(String[] args) {

//        Human[] humans = new Human[100000];
//        int delta = 1000;
//        Random random = new Random();
//        for (int i = 0; i < humans.length; i++) {
//            if (i % delta == 0 && i >= delta) {
//                for (int j = (i/delta)*delta; j < ((i/delta) * delta + delta); j++) {
//                    humans[j] = null;
//                }
//            }
//            String randomUUID =  UUID.randomUUID().toString();
//            String name = randomUUID.substring(0,(new Random().nextInt(5) + 4));
//            String surName = randomUUID.substring(0,(new Random().nextInt(5) + 4));
//            humans[i] = new Human(name, surName,random.nextInt(101) + 1900);
//        }
//        humans = null;
//
//
//        int sleepCount = 0;
//        try {
//            while ( sleepCount<5){
//                System.out.println("Time to sleep..." + sleepCount);
//                Thread.sleep(1000);
//                sleepCount++;
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.gc();
//        System.out.println("AFTER GC");
//        System.out.println(Runtime.getRuntime().freeMemory());

        Human succHumanMan = new Human("SuccName", "SuccSurname", 1924);
        Human succHumanWoman = new Human("SuccNameWoman", "SuccSurnameWoman", 1929);
        Human succHumanChild = new Human("succChilName", "SuccChildSurname", 1965);
        Human succHumanChildLox = new Human("succChildLoxName", "SuccChildLoxSurname", 1969);
        Pet sukaPet = new Pet(Species.DOG,"Suka");
        Family scumFamily = new Family(succHumanWoman,succHumanMan);
        scumFamily.addChild(succHumanChild);
        scumFamily.addChild(succHumanChildLox);
        scumFamily.setPet(sukaPet);

    }
}
