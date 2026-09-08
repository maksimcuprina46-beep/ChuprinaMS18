/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otdel1;
import java.util.Random;

/**
 *
 * @author RYZEN
 */
public class Zad68 {
 public static void main(String[] args) {
     System.out.print("Заданы массивы a[1...n], b[1...n] и c[1...n]. Определить наименьший среди\n" +
"максимальных элементов массива (использовать процедуру формирования\n" +
"массива и процедуру определения максимального элемента).");
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];

        
        System.out.print("Массив A: "); zap(a); 
        System.out.print("Массив B: "); zap(b); 
        System.out.print("Массив C: "); zap(c);

        
        int mA = a[0];
        for (int i = 1; i < a.length; i++) { if (a[i] > mA) mA = a[i]; }

        int mB = b[0];
        for (int i = 1; i < b.length; i++) { if (b[i] > mB) mB = b[i]; }

        int mC = c[0];
        for (int i = 1; i < c.length; i++) { if (c[i] > mC) mC = c[i]; }

        
        System.out.println("\nМаксимум A: " + mA);
        System.out.println("Максимум B: " + mB);
        System.out.println("Максимум C: " + mC);

     
        int res = mA;
        if (mB < res) res = mB;
        if (mC < res) res = mC;

        System.out.println("Результат (наименьший из них): " + res);
    }

   
    public static void zap(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100) + 1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
}

   

