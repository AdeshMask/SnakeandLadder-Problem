package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
    static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        int playerPosition = 0;
        int min = 1;
        int max = 6;
        int number;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println(+playerPosition+" " + "This is the players starting Position");
        System.out.println("Rolls the dice to get number ");
        int i = 0;
        while (playerPosition != WINNING_POSITION) {
            number = (int) Math.floor(Math.random() * (max - min + 1) + min);

            System.out.println("Enter ur choice::");
            switch (n=scanner.nextInt()){
                case 1:
                    System.out.println("Play");
                    System.out.println("Dice:"+number);
                    int option = (int) Math.floor(Math.random() * 3);
                    if (option == 0) {
                        System.out.println("No Play");
                        playerPosition = playerPosition;
                        System.out.println("Player On::"+playerPosition);
                    }
                    else if (option == 1) {
                        System.out.println("Ladder");
                        if (playerPosition>WINNING_POSITION)
                            playerPosition = playerPosition-number;
                        else
                            playerPosition = playerPosition + number;
                            System.out.println("Player On::"+playerPosition);
                    }
                    else {
                        System.out.println("Snake");
                        playerPosition = playerPosition - number;
                        if (playerPosition < 0)
                            playerPosition=0;
                            System.out.println("Player On::"+playerPosition);
                    }
                    break;
                case 2:
                    System.out.println("exit");
                    return;
                case 3:
                    System.out.println("Invalid input");
                    break;
            }
            i++;
        }
        System.out.println("Player Position::"+playerPosition);
        System.out.println("Total Moves ="+i);
    }
}
