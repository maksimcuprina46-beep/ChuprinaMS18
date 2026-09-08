/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otdel3;
import java.util.Scanner;

/**
 *
 * @author RYZEN
 */
public class Zad18 {
  public static void main(String[] args) {
        System.out.print("Определить количество \"2\" и \"3\" во введенной строке.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любую строку: ");
        String text = scanner.nextLine();

                int count2 = 0;
        int count3 = 0;

               for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i); // Берем текущий символ

            if (currentSymbol == '2') {
                count2++; 
            } else if (currentSymbol == '3') {
                count3++; 
            }
        }

                System.out.println("Количество двоек (2) в строке: " + count2);
        System.out.println("Количество троек (3) в строке: " + count3);
    }
}
    

