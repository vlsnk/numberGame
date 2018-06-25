package com.jcourse.vlsnk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Start game!");
        NumberGame game = new NumberGame();
        for(;;) {
            game.startGame();
            for (int i = 0; i < 8; i++) {
                boolean result = false;
                int number = -1;
                try {
                    if (in.hasNext()) {
                        if (in.hasNextInt()) {
                            number = in.nextInt();
                            result = game.guess(number);
                        } else {
                            System.out.println("Type a number!");
                            in.next();
                            i--;
                            continue;
                        }
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Exception - Type a number!");
                    in.next();
                    i--;
                    continue;
                }

                if (result) {
                    System.out.println("You win!");
                    break;
                } else {
                    System.out.println((i + 1) + " Wrong!");
                    if (i == 7) System.out.println("You loose!");
                }
            }
            System.out.println("Do you want to start next game?");
            if (in.next().equalsIgnoreCase("yes")) continue;
            else {
                System.out.println("End!");
                break;
            }
        }

        // write your code here
    }
}
