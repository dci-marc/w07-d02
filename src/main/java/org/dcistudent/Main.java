package org.dcistudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this
            // Exercise 1: Basic Operations on ArrayList of Integers
            .exercise1()
            // Exercise 2: Working with ArrayList of Strings
            .exercise2()
            // Exercise 3: Filtering Odd Numbers
            .exercise3()
            // Exercise 4: Reversing an ArrayList
            .exercise4()
            // Exercise 5: Summing Elements in an ArrayList
            .exercise5()
        ;
    }

    /**
     * Exercise 1: Basic Operations on ArrayList of Integers
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Remove the third element at index 2
     * 3. Replace the first element with 11
     */
    public Main exercise1() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Exercise 1:");
        list.remove(2);
        System.out.println(Arrays.toString(list.toArray()));
        list.set(0, 11);
        System.out.println(Arrays.toString(list.toArray()));

        return this;
    }

    /**
     * Exercise 2: Working with ArrayList of Strings
     *
     * 1. Create an ArrayList of Strings with values "Banana", "Apple", "Orange", "Strawberry", "Watermelon", "Grape", "Mango"
     * 2. Check if the list contains "Apple"
     * 3. Find the index of "Banana"
     * 4. Check if the list contains "Pineapple"
     */
    public Main exercise2() {
        ArrayList<String> list = new ArrayList<>(
            Arrays.asList("Banana", "Apple", "Orange", "Strawberry", "Watermelon", "Grape", "Mango")
        );

        System.out.println("Exercise 2:");
        System.out.printf("Contains apple: %s%n", list.contains("Apple"));
        System.out.printf("Index of banana is: %s%n", list.indexOf("Banana"));

        if (!list.contains("Pineapple")) {
            System.out.println("Pineapple not found.");
        }

        return this;
    }

    /**
     * Exercise 3: Filtering Odd Numbers
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Create an ArrayList of Integers to store odd numbers
     * 3. Iterate through the list and remove even numbers
     * 4. Add odd numbers to the list of odd numbers
     */
    public Main exercise3() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> listOdd = new ArrayList<>();

        System.out.println("Exercise 3:");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();

            if (i % 2 == 0) {
                iterator.remove();
                continue;
            }

            listOdd.add(i);
        }

        System.out.printf("List of odd numbers: %s%n", Arrays.toString(listOdd.toArray()));

        return this;
    }

    /**
     * Exercise 4: Reversing an ArrayList
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Create an ArrayList of Integers to store reversed list
     * 3. Iterate through the list in reverse and add elements to the reversed list
     */
    public Main exercise4() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> listReversed = new ArrayList<>();

        System.out.println("Exercise 4:");

        for (int i = list.size() - 1; i >= 0; i--) {
            listReversed.add(list.get(i));
        }

        System.out.printf("Reversed array list: %s%n", Arrays.toString(listReversed.toArray()));

        return this;
    }

    /**
     * Exercise 5: Summing Elements in an ArrayList
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Iterate through the list and sum all elements
     */
    public Main exercise5() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;

        System.out.println("Exercise 5:");

        for (int i : list) {
            sum += i;
        }

        System.out.printf("Sum of elements: %s%n", sum);

        return this;
    }
}