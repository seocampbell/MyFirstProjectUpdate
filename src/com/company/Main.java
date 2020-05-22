package com.company;

import javax.swing.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        int third = 0;
        int first = 10;
        int second = 20;
        int first1;
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};


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


        first1 = contents.get(6);



        System.out.println("The First Number is " + first);
        System.out.println("The Second Number is " + second);
        System.out.println("The contents Numbers is " + contents);
        System.out.println("Random " + first1);

        //Map a string to a number
        Map<String, Double> map = new HashMap<>();
        map.put("pi", 3.14);
        double pi = map.get("pi");

        System.out.println("The contents of pi is: " + pi);


        if (first > second)
            System.out.println("The number " + first + " is the bigger number");
        else if (first < second)
            System.out.println("The number " + second + " is the bigger number");
        else System.out.println("They are equal");

        //calculates array
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;

        one = one + array1[0];
        two = two + array1[1];
        three = three + array1[2];
        four = four + array1[3];

        for (int i = 0;
             i < array1.length;
             i++) {
            third = third + array1[i];

        }
        //int Guess = 6;
        Random rnd = new Random();
        third = rnd.nextInt(array1.length);
        System.out.println("New Random: " + third);


        System.out.println("\nThird : " + third);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);


        // write your code here
    }
}
