/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.main;

import java.util.Scanner;
import com.absoluteValue.Utilities;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mandy
 */
public class MainModular {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;

        while (true) {
            //call the menu method
            displayMenu();

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    findAbsoluteValue();
                    break;
                case 2:
                    convertStringToListWord();
                    break;
                case 3:
                    reverseAnArray();
                    break;
                case 4:
                    copyAHashMap();
                    break;
                case 5:
                    printAPattern();
                    break;
                case 6:
                    System.out.println("Exit.....");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu: ");
        System.out.println("================================================ ");
        System.out.println("1. Find the absolute value. ");
        System.out.println("2. Convert a string to a list of words. ");
        System.out.println("3. Reverse an array. ");
        System.out.println("4. Copy a Hashmap. ");
        System.out.println("5. Use nested loop to print a pattern. ");
        System.out.println("6. Exit! ");
        System.out.println("7. Your choice : ");
        System.out.println("================================================ ");
    }

    private static void findAbsoluteValue() {
        Scanner scan = new Scanner(System.in);
        Utilities absValue = new Utilities();

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int value = absValue.getAbsoluteValue(number);
        System.out.print("The absolute value of " + number + " is: " + value);
    }

    private static void convertStringToListWord() {
        Scanner scan = new Scanner(System.in);
        Utilities stringToList = new Utilities();

        System.out.print("Enter a string: ");
        String string = scan.nextLine();

        List<String> words = stringToList.convertStringToListOfWord(string);
        System.out.print("List of words: " + words);
    }

    private static void reverseAnArray() {
        Scanner scan = new Scanner(System.in);
        Utilities reversedArray = new Utilities();

        //size of the array
        System.out.print("Enter size of an array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        //elements of the array
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        //reverse array
        int[] reverse = reversedArray.reverseArray(array);
        System.out.print("Reversed array: ");
        for (int r : reverse) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    private static void copyAHashMap() {
        Scanner scan = new Scanner(System.in);
        Utilities copyMap = new Utilities();
        
        //original map
        Map<String, Integer> map1 = new HashMap<>();
        
        map1.put("Java", 1);
        map1.put("Python", 2);
        map1.put("React", 3);
        map1.put("JavaScript", 4);
        map1.put("Node.js", 5);
 
        //copied map
        Map<String, Integer> map2 = copyMap.copyHashMap(map1);

        System.out.println("Copied HashMap: " + map2);
    }

    private static void printAPattern() {
        Scanner scan = new Scanner(System.in);
        Utilities pattern = new Utilities();
        
        System.out.print("Enter number of rows for pattern: ");
        int rows = scan.nextInt();

        //print the pattern
        pattern.printPattern(rows);
    }
}
