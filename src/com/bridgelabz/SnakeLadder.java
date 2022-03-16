package com.bridgelabz;

import java.util.Random;

public class SnakeLadder {

    public static void main(String[] args) {
	// write your code here
        int playerPosition = 0;
        int min = 1;
        int max = 6;
        System.out.println(+playerPosition+" " + "This is the players starting Position");
        System.out.println("Rolls the dice to get number ");
        int number = (int) Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(number);

        int option = (int) Math.floor(Math.random()*3);
        if (option == 0) {
            System.out.println("No Play");
            playerPosition = playerPosition;
            System.out.println(playerPosition);
        }
        else if (option == 1) {
            System.out.println("Ladder");
            playerPosition = playerPosition + number;
            System.out.println(playerPosition);
        }
        else {
            System.out.println("Snake");
            playerPosition = playerPosition - number;
            System.out.println(playerPosition);
        }

    }
}
