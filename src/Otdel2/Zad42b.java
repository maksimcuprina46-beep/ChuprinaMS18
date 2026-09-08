/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otdel2;

/**
 *
 * @author RYZEN
 */
public class Zad42b {
  public static void main(String[] args) {
      System.out.println("Сформировать матрицу вида: b) 1 2 3 4 5\n" +
                                                       "5 4 3 4 1\n" +
                                                       "1 2 3 4 5\n" +
                                                       "5 4 3 2 1\n" +
                                                       "1 2 3 4 5");
      System.out.println("5 4 3 4 1  (2 строка 4 столбец) - опечатка ?");
        int size = 5; 
        int[][] matrix = new int[size][size];

       
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    
                    matrix[i][j] = j + 1;
                } else {
                    
                    matrix[i][j] = size - j;
                }
            }
        }

        
        System.out.println(" Сформированная матрица b ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
   

