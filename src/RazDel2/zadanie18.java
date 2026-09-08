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
         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter square matrix size: ");
        int n = sc.nextInt();
        int[][] array18 = new int[n][n];
        
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array18[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.println("\nOriginal matrix:");
        for (int i = 0; i < array18.length; i++) {
            for (int j = 0; j < array18[i].length; j++) {
                System.out.print(array18[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nMaximum elements in each row:");
        for (int i = 0; i < n; i++) {
            int maxInRow = array18[i][0];
            for (int j = 1; j < n; j++) {
                if (array18[i][j] > maxInRow) {
                    maxInRow = array18[i][j];
                }
            }
            System.out.println("Row " + i + ": " + maxInRow);
        }
        
        
        System.out.println("\nMinimum elements in each column:");
        for (int j = 0; j < n; j++) {
            int minInColumn = array18[0][j];
            for (int i = 1; i < n; i++) {
                if (array18[i][j] < minInColumn) {
                    minInColumn = array18[i][j];
                }
            }
            System.out.println("Column " + j + ": " + minInColumn);
        }
        
        sc.close();
    }
}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    

