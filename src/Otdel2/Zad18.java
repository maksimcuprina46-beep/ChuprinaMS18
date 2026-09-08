/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otdel2;
import java.util.Random;


/**
 *
 * @author RYZEN
 */
public class Zad18 {
 
    public static void main(String[] args) {
     System.out.println("18. Составить программу нахождения минимального элемента в каждом\n" +
"столбце и максимального в каждой строке квадратной матрицы.");  
        int size = 4;
        int[][] matrix = new int[size][size];
        Random random = new Random();

  
        System.out.println(" Исходная матрица ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(90) + 10; 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
       
       
        System.out.println(" Максимумы в каждой строке ");
        for (int i = 0; i < size; i++) {
            int maxInRow = matrix[i][0]; 

            for (int j = 1; j < size; j++) {
                if (matrix[i][j] > maxInRow) {
                    maxInRow = matrix[i][j]; 
                }
            }
            System.out.println("Строка " + (i + 1) + ": максимальный элемент = " + maxInRow);
        }
        System.out.println();

               System.out.println(" Минимумы в каждом столбце ");
        for (int j = 0; j < size; j++) {
            int minInCol = matrix[0][j]; // 
            for (int i = 1; i < size; i++) {
                if (matrix[i][j] < minInCol) {
                    minInCol = matrix[i][j]; // 
                }
            }
            System.out.println("Столбец " + (j + 1) + ": минимальный элемент = " + minInCol);
        }
    }
}
   

