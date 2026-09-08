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
public class zad18 {
    
 public static void main(String[] args) {
   System.out.println("Задан одномерный массив A[1..20]. Просуммировать все отрицательные" +
"элементы, стоящие на нечетных местах");     

    
        int[] a = new int[20]; 
        Random rand = new Random(); 

        
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(101) - 50; 
            System.out.print(a[i] + " "); 
        }
        System.out.println(); 

     
        int sum = 0;
        
      
        for (int i = 0; i < a.length; i += 2) {
            if (a[i] < 0) { 
                sum += a[i]; 
            }
        }

        System.out.println("Сумма: " + sum);
    }
}



