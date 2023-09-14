/*
@author josephjuarez
    
Homework Note: 
Remember you MUST use two multi-dimensional 
arrays or your points will be significantly reduced.

Chapter 8: Exercise 8.29

Title of assignment: IDENTICAL ARRAYS but STRICT
*/

//package moduletwo;

import java.util.Scanner;
import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Only did this since it makes the code more readable for me
        int rows = 3;
        int columns = 3;

        int[][] m1 = new int[rows][columns];
        int[][] m2 = new int[rows][columns];
        
        // Prompt the user to enter values for the first array
        System.out.println("Enter values for the first 3x3 array: \n");
        int startOne = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(startOne + ": ");
                m1[i][j] = input.nextInt();
                startOne++;
            }
        }
        
        // Prompt the user to enter values for the second array
        int startTwo = 1;
        System.out.println("Enter values for the second 3x3 array:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(startTwo + ": ");
                m2[i][j] = input.nextInt();
                startTwo++;
            }
        }
        
        
        System.out.println("\n" + Arrays.deepToString(m1));
        System.out.println(Arrays.deepToString(m2));

        
        if (equals(m1, m2)) {
            System.out.println("\nIt's a Match !\n\n");
        } else {
            System.out.println("Its not a Match : /");
        }
        
        
        System.out.println("\nEND OF PROGRAM");

        }
        
    public static boolean equals(int[][] m1, int[][] m2) {
         
        if (m1.length != m2.length ) {
            return false; 
        }

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false; 
                }
            }
        }

        // If both arrays = then it survived the 2 checkpoints because its identical
        return true; 
    }