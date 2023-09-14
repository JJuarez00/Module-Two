/*
@author josephjuarez
    
Homework Note: 
Remember you MUST use a single dimensional array 
or your points will be significantly reduced.

Chapter: 7 - Exercise 7.1

Title of assignment: ASSIGN GRADES
*/

//package moduletwo;
import java.util.Arrays;
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get number of students in the class
        System.out.print("Enter # of students in your class: ");
        int teacherEntry = input.nextInt();
        int [] students = new int [teacherEntry];
        
         // Test to print Number of Students       > [ ignore ] <
        System.out.print("\n" + Arrays.toString (students) + "\t* ignore this *\n\n");
        
        
        // Get the scores of the students
        System.out.print("\n\t> Enter " + teacherEntry + " Scores <\n");
        
        for(int i = 0; i < teacherEntry; i++) {
            System.out.print(" grade: ");
            students [i] = input.nextInt();
        }
        
        // Test to print scores of the students
        System.out.print("\n"+Arrays.toString(students) + "\t * ignore this *\n\n");
        
        // Grading System *  after looking at this i realized i could have gotten rid of this but too late now,
        //                *  but i did make this change in assignment 3 *

        int a = 90;
        int b = 80;
        int c = 70;
        int d = 60;
        
        // Start off with the first student and loop on until 
        // all of the grades displayed for all students.
        int start = 0;
        for(int i = 0; i < teacherEntry; i++) {
            if ( students[start] >= a) {
                System.out.println("\nStudent " + start + " score is " + students[start] + " and grade is A\n");
            } else if ( students[start] >= b) {
                System.out.println("\nStudent " + start + " score is " + students[start] + " and grade is B\n");
            } else if ( students[start] >= c) {
                System.out.println("\nStudent " + start + " score is  " + students[start] + " and grade is C\n");
            } else if ( students[start] >= d) {
                System.out.println("\nStudent " + start + " score is " + students[start] + " and grade is D\n");
            } else {
                System.out.println("\nStudent " + start + " score is " + students[start] + " and grade is F\n");
            }
            start ++;
        } // End of for loop
        System.out.println("\n\tEND OF PROGRAM !\n");
    }
}
