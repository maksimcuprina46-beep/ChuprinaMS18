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
 
import java.util.Arrays;
public class zadaniE68 {
 public static int[] generateArray18(int n, int min, int max) {
        int[] array18 = new int[n];
        for (int i = 0; i < n; i++) {
            array18[i] = (int)(Math.random() * (max - min + 1)) + min;
        }
        return array18;
    }
    
    
    public static int findMaxElement18(int[] array18) {
        if (array18.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        
        int max = array18[0];
        for (int i = 1; i < array18.length; i++) {
            if (array18[i] > max) {
                max = array18[i];
            }
        }
        return max;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Заданы массивы a[1...n], b[1...n] и c[1...n]. Определить наименьший среди\n" +
"максимальных элементов массива (использовать процедуру формирования\n" +
"массива и процедуру определения максимального элемента).");
      int n = 5;
        
        System.out.println("Заданы массивы a[1..." + n + "], b[1..." + n + "] и c[1..." + n + "]");
        System.out.println("Определить наименьший среди максимальных элементов массивов\n");
        
        
        int[] a = generateArray18(n, 1, 100);
        int[] b = generateArray18(n, 1, 100);
        int[] c = generateArray18(n, 1, 100);
        
        
        System.out.println("Массив a: " + Arrays.toString(a));
        System.out.println("Массив b: " + Arrays.toString(b));
        System.out.println("Массив c: " + Arrays.toString(c));
        System.out.println();
        
        
        int maxA = findMaxElement18(a);
        int maxB = findMaxElement18(b);
        int maxC = findMaxElement18(c);
        System.out.println("Максимальный элемент массива a: " + maxA);
        System.out.println("Максимальный элемент массива b: " + maxB);
        System.out.println("Максимальный элемент массива c: " + maxC);
        System.out.println();
        
       
        int minOfMax = Math.min(Math.min(maxA, maxB), maxC);
        
        System.out.println("Наименьший среди максимальных элементов: " + minOfMax);  
    }
    
}
