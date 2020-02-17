package hw03;

import java.util.Scanner;

public class HW3  {
    public static void main(String[] args) {
        String[][] schedules = new String[7][2];
        schedules[0][0] = "Sunday";
        schedules[0][1] = "do home work.";
        schedules[1][0] = "Monday";
        schedules[1][1] = "go to course. watch films.";
        schedules[2][0] = "Tuesday";
        schedules[2][1] = "do more home work.";
        schedules[3][0] = "Wednesday";
        schedules[3][1] = "drinking tequila.";
        schedules[4][0] = "Thursday";
        schedules[4][1] = "sleeping all of the day instead of working.";
        schedules[5][0] = "Friday";
        schedules[5][1] = "holy day. Drinking.";
        schedules[6][0] = "Saturday";
        schedules[6][1] = "doing my home work again.";
        while (true) {
            Scanner sc = new Scanner(System.in);
            String dayOfTheWeek;
            System.out.println("Please, input the day of the week: ");
            dayOfTheWeek = sc.nextLine();
            boolean end = false;
            switch (dayOfTheWeek.toLowerCase().trim()) {
                case "sunday":
                    System.out.println("Your task for " + schedules[0][0] + " is: " + schedules[0][1]);
                    break;
                case "monday":
                    System.out.println("Your task for " + schedules[1][0] + " is: " + schedules[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your task for " + schedules[2][0] + " is: " + schedules[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your task for " + schedules[3][0] + " is: " + schedules[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your task for " + schedules[4][0] + " is: " + schedules[4][1]);
                    break;
                case "friday":
                    System.out.println("Your task for " + schedules[5][0] + " is: " + schedules[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your task for " + schedules[6][0] + " is: " + schedules[6][1]);
                    break;
                case "exit":
                    end = true;
                    break;
                default:
                    System.out.println("Sorry, i don't understand you, please, try again:");
                    break;
            }
            if (end)break;

        }
}}
