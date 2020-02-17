package hw01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        String [][] questions = new String[][]{
                {"Indi hansi reqem olacaq?", "150"},
                {"Baki ne vaxt muasir olacaq?", "3030"},
                {"BU gun ayin necesidir?", "17"}
        };

        while (true) {
            int guess, counter = 0;
            Scanner scan = new Scanner(System.in);
            Random random = new Random();
            int randomNum = random.nextInt(100);

            int[] array = {};
            String name;
            System.out.println("Please, enter your name: ");
            name = scan.nextLine();
            System.out.println("Let the game begin!");
            boolean gameType = true;
            if(gameType) {
                int questionNumber = random.nextInt(questions.length);
                String question = questions[questionNumber][0];
                randomNum = Integer.parseInt(questions[questionNumber][1]);
                System.out.println("Quiz type chosen. The question is:");
                System.out.println(question);
            }
            do {
                if (counter == 0)
                    System.out.println("Enter your number..:");

                try {
                    guess = Integer.parseInt(scan.nextLine());
                } catch (Exception e) {
                    System.out.println("Not a number! Try again.");
                    continue;
                }
                int[] tempArr = new int[counter + 1];
                for (int i = 0; i < array.length; i++) {
                    tempArr[i] = array[i];
                }
                array = tempArr;


                array[counter] = guess;
                counter++;
                if (guess == randomNum) {
                    System.out.println("Congurtulations! " + counter + " times " + " you know the number " + randomNum);
                    break;
                } else if (guess < randomNum)
                    System.out.println("Your number is too small. Please, try again.");
                else
                    System.out.println("Your number is too big. Please, try again.");
            } while (true);
            int points = (100 - (counter-1) * 10);
            System.out.println("Congratulations, " + name + "!");
            System.out.println("Your score is..:" + (Math.max(points, 0)));
            Arrays.sort(array);
            int[] revArr = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                revArr[i] = array[array.length - i - 1];
            }
            System.out.println("Your numbers: " + Arrays.toString(revArr));
            counter = 0;

            if (guess == -1) break;

        }
    }
}
