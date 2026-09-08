/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razdel1;

/**
 *
 * @author Student
 */
public class zADanie18 {

    public static void main(String[] args) {
        System.out.println("Задан одномерный массив A[1..20]. Просуммировать все отрицательные\n" +
                "элементы, стоящие на нечетных местах.");

        int[] A18 = new int[20];
        
        A18[0] = 5;   A18[1] = -3;  A18[2] = 8;   A18[3] = -7;
        A18[4] = 12;  A18[5] = -2;  A18[6] = 0;   A18[7] = -15;
        A18[8] = 9;   A18[9] = 4;   A18[10] = -1; A18[11] = 6;
        A18[12] = -8; A18[13] = 3;  A18[14] = -4; A18[15] = 11;
        A18[16] = -6; A18[17] = 7;  A18[18] = -9; A18[19] = 10;

        

        System.out.println("Массив A:");
        for (int i = 0; i < A18.length; i++) {
            System.out.print(A18[i] + " ");
        }
        System.out.println();
        
        int sum = 0;
        System.out.println("\nОтрицательные элементы на нечетных местах:");
        for (int i = 0; i < A18.length; i++) {
            
            if (i % 2 == 0 && A18[i] < 0) {
                System.out.println("A[" + (i + 1) + "] = " + A18[i]);
                sum += A18[i];    
            }
        }
        System.out.println("\nСумма отрицательных элементов на нечетных местах: " + sum);
    }
}