/*
@author josephjuarez
    
Homework Note: 
Redo exercise 7.1 using an ArrayList<E> this time

Chapter: 7 - Exercise 7.1

Title of assignment: ASSIGN GRADES
*/

package moduletwo;

import java.util.Scanner;
import java.util.ArrayList;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        // Gets the amount of students the teacher inputs.
        System.out.print("Enter the amount of students your about to grade: ");
        int studentAmount = input.nextInt();
        ArrayList<Integer> studentArrayList = new ArrayList<>();
        
        // Shows how much you want to grade.
        System.out.println("\nYou have entered: " + studentAmount + " Student(s)\n\n");
            
        // Note: Ignore this, since this is just to check if Array List is correct, since it should
        // just be "[ ]" printed out because there is no fixed amount.
        System.out.println(studentArrayList + "\n");
        
        // For Loop  for getting grades.
        for (int  i = 0; i < studentAmount; i++) {
            System.out.print("Enter student " + i +"'s grade: ");
            studentArrayList.add(input.nextInt());
        }
        
        // Note: Ignore this, just displays whats inside the Array List.
        System.out.println( "\n" + studentArrayList + "\n");
        
        // For loop to tell the teacher what grade the student got.
        for (int i = 0; i < studentAmount; i++) {
            if (studentArrayList.get(i) >= 90) {
                System.out.println("Student " + i + "'s grade (" + studentArrayList.get(i) + ") is an A");
            }
            else if (studentArrayList.get(i) >= 80) {
                System.out.println("Student " + i + "'s grade (" + studentArrayList.get(i) + ") is a b");
            }
            else if (studentArrayList.get(i) >= 70) {
                System.out.println("Student " + i + "'s grade (" + studentArrayList.get(i) + ") is a C");
            }
            else if (studentArrayList.get(i) >= 60) {
                System.out.println("Student " + i + "'s grade (" + studentArrayList.get(i) + ") is a D");
            } else {
                System.out.println("Student " + i + "'s grade (" + studentArrayList.get(i) + ") is an F");
            }
        }
        System.out.println("\n\nEND OF PROGRAM !\n\n");
    }
}
