package org.launchcode.java.demos;

import java.util.ArrayList;
/**import java.util.Arrays;*/
/**
 * Created by LaunchCode
 */
    public class Arrays {

    public static void main(String[] args) {

       /** System.out.println("printArrayOfNumbers :: ");
        printArrayOfNumbers();

        System.out.println("arrayCreation :: ");
        arrayCreation();
        */
       /**System.out.println("addEvenDigits :: ");
       addEvenDigits();*/

       /**System.out.println();
       fiveLetterWord();*/

        printArray();

    }

    public static void printArrayOfNumbers() {

        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 6, 9, 10, 14, 17, 20, 24, 42, 45, 85};

        // Loop over the array and print each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void arrayCreation() {

        // Declare and initialize an empty array of 10 Integers
        int[] someInts = new int[10];

        // Declare and initialize an array using an array literal
        int[] someOtherInts = {1, 1, 2, 3, 5, 8};

        // We can use a for-in loop with arrays
        for (int i : someInts) {
            System.out.println(i);
        }

        // We can loop through an array with an iterator var as well
        for (int j : someOtherInts) {
            System.out.println(j);
        }
    }
    public static void addEvenDigits()  {

        int[] numList = {0,1,2,3,4,5,6,7,8,9};
        int y = 0;
        for (int x : numList) {

            if (x % 2 == 0) {
                y = y + x;

         System.out.println(y);

            }
        }
        }
    public static void fiveLetterWord() {

        String[] words = {"cats", "dogs", "fmlno", "dango", "thang"};
        /**String word0 = "cats";
         String word1 = "fmlno";
         String word2 = "ahhhh";
         String word3 = "dango";
         String word4 = "thing";
         String word5 = "dogs";*/

        ArrayList<String> wordList = new ArrayList<String>();
        /**wordList.add(word0);
         wordList.add(word1);
         wordList.add(word2);
         wordList.add(word3);
         wordList.add(word4);
         wordList.add(word5);*/


        for (String str : words) {
            wordList.add(str);
        }
        /**for(char word : wordList );

         if ()*/
        System.out.println(wordList);

        for (String word : wordList) {
            if (word.length() == 5) {
                System.out.println(word);
            }

        }
    }
    public static void printArray() {
        int nums[] = {1, 1, 2, 3, 5, 8};

        for(int num : nums) {
            System.out.println(num);

        }
    }
    }



/**String[] a = {"1","2","3"};
 ArrayList<String> nums= new ArrayList<String>(Arrays.asList(a));    */

/** String[] a = {"1","2","3"};
 ArrayList<String> b = new ArrayList<String>();

 for ( String str : a ) {
 b.add(str);
 }
*/