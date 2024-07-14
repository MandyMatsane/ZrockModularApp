/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.absoluteValue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mandy
 */
public class Utilities {
    
    public int getAbsoluteValue(int number) {
        return Math.abs(number);
    }
    
    public List<String> convertStringToListOfWord(String string) {
        String[] stringArray = string.split("\\s+");
        return Arrays.asList(stringArray);
    }
    
    public int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        
        return reversedArray;
    }
    
    public Map<String, Integer> copyHashMap(Map<String, Integer> value) {
        return new HashMap<>(value);
    }
    
    public void printPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x + "*");
            }
            System.out.println();
        }
    } 
}
