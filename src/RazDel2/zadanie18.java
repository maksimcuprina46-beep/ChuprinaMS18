/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RazDel2;


/**
 *
 * @author Student
 */
import java.util.Scanner;

public class zadanie18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println( "Write a program to find the minimum element in each column and the maximum element in each row of a square matrix.");     
         
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter square matrix size: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        
        
        System.out.println("\nOriginal matrix:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nMaximum elements in each row:");
        for (int i = 0; i < n; i++) {
            int maxInRow = array[i][0];
            for (int j = 1; j < n; j++) {
                if (array[i][j] > maxInRow) {
                    maxInRow = array[i][j];
                }
            }
            System.out.println("Row " + i + ": " + maxInRow);
        }
        
        
        System.out.println("\nMinimum elements in each column:");
        for (int j = 0; j < n; j++) {
            int minInColumn = array[0][j];
            for (int i = 1; i < n; i++) {
                if (array[i][j] < minInColumn) {
                    minInColumn = array[i][j];
                }
            }
            System.out.println("Column " + j + ": " + minInColumn);
        }
        
        scanner.close();
    }
}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    

