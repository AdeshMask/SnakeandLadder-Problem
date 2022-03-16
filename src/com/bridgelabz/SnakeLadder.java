package com.bridgelabz;

import java.util.Random;

public class SnakeLadder {

    public static void main(String[] args) {
	// write your code here
        int playerPosition = 0;
        int min = 1;
        int max = 6;
        System.out.println(+playerPosition+" " + "This is the players starting Position");
        System.out.println("Roll the dice to get number ");
        int number = (int) Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(number);

    }
}
