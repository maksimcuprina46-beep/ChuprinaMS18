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
import java.util.Random;
 public class Zadanie1 {

    public static void main(String[] args) {
        System.out.println("Заменить положительные элементы двумерного массива на 1, а\n"
                + "отрицательные на 0.");
       
        int[][] array18 = new int[3][3];
         Random random = new Random(); 
         System.out.println("Исходный массив:");
        for (int i = 0; i < array18.length; i++) {
            for (int j = 0; j < array18.length; j++) {
                array18[i][j] = random.nextInt(21) - 10;
                System.out.print(array18[i][j]+"\t");
            }
               System.out.println();
        }
      System.out.println("Преобразованный массив:");
        for (int i = 0; i < array18.length; i++) {
            for (int j = 0; j < array18[i].length; j++) {
                if (array18[i][j] > 0) {
                    array18[i][j] = 1;
                } else if (array18[i][j] < 0) {
                    array18[i][j] = 0;
                }
              
                System.out.print(array18[i][j] + "\t");
            }
            System.out.println();
    }   }
}
