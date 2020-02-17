package hw02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Random random = new Random();


        while (true) {
            System.out.println("All set. Get ready to rumble!");

            int N = 5;
            int targetsCount = 1;
            int[] targets = random.ints(targetsCount,0,N*N).toArray();
            boolean success = false;
            int [] shot = new int[0];
            int [] successShot = new int[0];



            while (true) {
                Scanner sc = new Scanner(System.in);

                if(success)  {
                    System.out.println("Congratulations! You won!");
                    break;
                }
                System.out.println("Enter the line: ");
                int targRow;
                try {
                    targRow  = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please, make sure you have entered a number");
                    continue;
                }
                System.out.println("Enter element in the line: ");
                int targCol;
                try {
                    targCol  = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please, make sure you have entered a number");
                    continue;
                }

                boolean alreadyShot = false;
                int enteredTarget = (targRow -1)*N + targCol -1;

                for (int value : shot) {
                    alreadyShot |= (value == enteredTarget);
                }

                if(alreadyShot){
                    System.out.println("Already shot!Enter new numbers: ");
                    continue;
                }

                int [] tempShot = new int[shot.length + 1];
                for (int i = 0; i < tempShot.length-1; i++) {
                    tempShot[i] = shot[i];
                }
                shot = tempShot;
                shot[tempShot.length-1] = enteredTarget;

                for (int i = 0; i < N * N; i++) {
                    int col = i % N;
                    int row = i / N;
                    boolean hasTarget = false;
                    char itemToPrint = '-';

                    boolean usedValue = false;
                    for (int vs : shot) { usedValue|= vs==i; }

                    for (int targ : targets) {
                        hasTarget |= ((targ == i) || (targ == i + N*N));
                    }

                    if (usedValue && hasTarget) {
                        itemToPrint = 'x';
                    } else if(usedValue) {
                        itemToPrint = '*';
                    }

                    if (row == 0 && col == 0) {
                        System.out.print("  ");
                        for (int j = 0; j < N; j++) {
                            System.out.print(j + 1 + " ");
                        }
                        System.out.println();
                    }
                    if (col == 0) {
                        System.out.print(row + 1 + " ");
                    }


                    System.out.print(itemToPrint + " ");


                    if (col == N - 1) {
                        System.out.println();
                    }

                }

                for (int i1 = 0; i1 < targets.length; i1++) {
                    if(enteredTarget == targets[i1]) targets[i1] = (targets[i1] + N*N);
                }

                success = true;
                for (int target : targets) {
                    success&=target>=25;
                }


            }


        }

    }

}
