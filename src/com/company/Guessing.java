package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Guessing {

    int third = 0;
    int first = 10;
    int second = 20;


    int first1;
    int[] array1 = {1, 2, 3, 4};
    int[] array2 = {5, 6, 7, 8};

    public void Guessing (){
        first = array1.length;
        second = array2.length;
        List<Integer> contents = new ArrayList<>();
        contents.add(2);
        contents.add(3);
        contents.add(4);
        contents.add(5);
        contents.add(6);
        contents.add(7);
        contents.add(8);
        contents.add(9);
        contents.add(10);

        Random rnd = new Random();
        third = rnd.nextInt(array1.length);
        System.out.println("New Random: " + third);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please guess what number I'm thinking off from 0 - 10?");
        int Guess = userInput.nextInt();  // Read user input
        System.out.println("You have decided on is: " + Guess);
        int i = 1;
        do {
            if (Guess > third) {
                System.out.println("You guess was too high, please try again between 0 - 10?");
            }
            else if (Guess < third){
                System.out.println("You guess was too low, please try again between 0 - 10?");
            }
            Guess = userInput.nextInt();  // Read user input
            System.out.println("You have guessed : " + Guess);
            i++;
        }
        while (Guess != third);
        System.out.println("Well done, you guess correctly after " + i + " attempts!");

    }
}
