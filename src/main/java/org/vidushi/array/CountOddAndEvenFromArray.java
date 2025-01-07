package org.vidushi.array;

import java.util.ArrayList;
import java.util.List;

public class CountOddAndEvenFromArray {

    public static void main(String[] args) {
        //   testCountOddAndEvenFromArray();
        testMaxAndMinimumValuefromArray();
    }

    private static void testCountOddAndEvenFromArray() {

        Integer array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 12, 24, 56};
        List<Integer> evenNumber = new ArrayList<>();
        List<Integer> oddNumber = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumber.add(array[i]);
            } else {
                oddNumber.add(array[i]);
            }
        }
        System.out.println("The even number are =" + evenNumber);
        System.out.println("The Odd number are =" + oddNumber);
    }

    private static void testMaxAndMinimumValuefromArray() {
        Integer array[] = {7, 2, 3, 4, 5, 2, 8, 9, 23, 12, 24, 56, 1008, 34, 56, 436,};
        int maxNumber = array[0];
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >=maxNumber){
                maxNumber = array[i];

            }else {
                if (array[1]<minNumber){
                    minNumber = array[1];
                }
            }
        }
        System.out.println("The maximum number is :" +maxNumber);
        System.out.println("The minumum number is :" +minNumber);


    }

}


