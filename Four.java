/*
@author josephjuarez
    
Homework Note: 
Redo exercise 8.29 using nested LinkedList<E> this time.

Chapter 8: Exercise 8.29

Title of assignment: IDENTICAL ARRAYS but STRICT
 */

import java.util.Scanner;
import java.util.LinkedList;

public class Four {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        LinkedList<LinkedList<Integer>> m1 = new LinkedList<>();
        
        // Prompt the user to enter values for the first array
        System.out.println("Enter values for the first Linked List (9 #'s needed): \n");
        for (int i = 0; i < 3; i++) {
            LinkedList<Integer> rowOne = new LinkedList<>();
            for (int j = 0; j < 3; j++) {
                int value = input.nextInt();
                rowOne.add(value);
            }
            m1.add(rowOne);
        }
        
        // Prompt the user to enter values for the second array
        LinkedList<LinkedList<Integer>> m2 = new LinkedList<>();
        System.out.println("\nEnter values for the second Linked List (9 #'s needed):\n");
        for (int i = 0; i < 3; i++) {
            LinkedList<Integer> rowTwo = new LinkedList<>();
            for (int j = 0; j < 3; j++) {
                int value = input.nextInt();
                rowTwo.add(value);
            }
            m2.add(rowTwo);
        }
        
        
        // Show the entire Linked List
        System.out.println("\n\n"+ m1 + "\n");
        
        // Show the enitre Linked List
        System.out.println("\n" + m2 + "\n");

        
        // call method

        if (equals(m1, m2)) {
            System.out.println("\nIt's a Match !\n\n");
        } else {
            System.out.println("\nIts not a Match : /");
        }
        System.out.println("\nEND OF PROGRAM");
    }
    
    
    // this is what the assignment asked for
     public static boolean equals(LinkedList<LinkedList<Integer>> m1, LinkedList<LinkedList<Integer>> m2) {
       // m1.size() helps determine the number of rows
        for (int i = 0; i < m1.size(); i++) {
            LinkedList<Integer> rowOne = m1.get(i);
            LinkedList<Integer> rowTwo = m2.get(i);

            if (rowOne != rowTwo) {
                return false;
            } // end of if statement
            
        } // end of for loop
        
        return true;
    } // end of method
    
}
