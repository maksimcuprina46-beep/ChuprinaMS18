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
public class Zad43 {

    public static void main(String[] args) {
      System.out.println("В массиве хранятся сведения об общей стоимости товаров, проданных\n" +
"фирмой за каждый день марта. Определить дни, в которые стоимость проданных\n" +
"товаров превысила среднюю ежедневную сумму продаж.");  
        int[] sales = new int[31]; 
        
        
        Random rand = new Random(); 

        
        for (int i = 0; i < sales.length; i++) {
            
            sales[i] = rand.nextInt(50000 - 10000 + 1) + 10000; 
        }

        
        System.out.println("Выручка за каждый день марта:");
        for (int i = 0; i < sales.length; i++) {
            System.out.println("День " + (i + 1) + ": " + sales[i] + " руб.");
        }
        

     
        int totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum += sales[i];
        }
        
       
        int average = totalSum / sales.length; 
        System.out.println("СРЕДНЯЯ ежедневная сумма: " + average + " руб.");
       

        
        System.out.println("Дни, когда выручка превысила среднюю:");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                System.out.println("-> День " + (i + 1) + "-й (выручка: " + sales[i] + " руб.)");
            }
        }
    }
}
