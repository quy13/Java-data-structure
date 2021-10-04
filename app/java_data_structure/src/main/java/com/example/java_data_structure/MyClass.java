package com.example.java_data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MyClass {
    public static void main(String[] args) {
//        int[] myArray = {1,33,4,12};
//        String[] myString = {"Ace","Mike","Steward","Bob"};
////        System.out.println(myArray[0] + " " + myString[0]);
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Array Items:" + i);
//            System.out.println(myArray[i]);
//            System.out.println(myString[i]);
//
//        }
//
//        int[] newArray = new int[3];
//        String[] newString = new String[3];
//
//        [1,2,3]
//        newArray[0] = 1;
//        newArray[1] = 2;
//        newArray[2] = 3;
//
//        newString[0] = "mark";
//        newString[1] = "lucy";
//        newString[2] = "odin";
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//            System.out.println(newString[i]);
//        }


////        ArrayList
//        ArrayList<String> name = new ArrayList<>(); //Default way
        ArrayList name = new ArrayList();
        name.add("hello");
        name.add("Bond");
        name.add("James");
        name.add("Adam");
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Names: " + name.get(i));
        }

        name.remove(0);
        System.out.println(name.get(3));

//        //clever for loop
//        for (Object n : name) {
//            System.out.println("Names: " + n);
//        }


//      //75 Passing Arrays as Method Parameters
//        int[] numbers = {12, 0, 34, 100, 34, 2, 3, 5, 10, 78, 69, 12349, 89, 76, 10000, 87654};
//        findMultThree(numbers);


        //HashMap is unordered
//        HashMap<String,Integer> gameStats = new HashMap<>();
//        gameStats.put("james", 100);
//        gameStats.put("ruth", 435);
//        gameStats.put("carolina", 909);
//
//        //gameStats.clear();
//        //gameStats.remove("ruth");
//        System.out.println(gameStats.size());
//
//        for (String item: gameStats.keySet()) {//for each loop
//            System.out.println(item);
//        }
//
//        for (int item: gameStats.values()) {
//            System.out.println(item);
//        }


//        sort an array use Arrays.sort();
        int[] arr = {3, 12, 0, 1};

        String[] names = {"Albert", "Craig", "Ben", "Chico"};

        System.out.println("Before sort...");
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        Arrays.sort(names);

        System.out.println("After sort...");
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Before sort...");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);

        System.out.println("After sort...");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
//
//
//    ArrayList<String> test = new ArrayList<>();
//        test.add("3");
//        test.add("2");
//        test.add("1");
//        test.add("4");
//        System.out.println(test);
//    //sort an ArrayList
//        Collections.sort(test);
//        System.out.println(test);
//    //reverse an ArrayList
//        Collections.reverse(test);
//        System.out.println(test);
 }


    public static void findMultThree(int[] nums) {
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 3 == 0) {
                    System.out.println("Number: " + nums[i] + " is a multiple of 3.");
                } else {
                    System.out.println(" [x] " + nums[i] + " is not a multiple of 3.");
                }
            }
        } else {
            System.out.println("Empty array");
        }
    }
}

