/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otdel4;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author RYZEN
 */
public class Zad18 {
  public static void main(String[] args) {
      System.out.println("18. Создать файл, содержащий значения x (-2 x  7, h= 0,5) и значения\n" +
"функции y= sin2 (tg x). Вывести на экран данные в виде таблицы и определить,\n" +
"при каком значении х функция принимает максимальное значение.");
        String fileName = "data.txt"; 

        
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            
            for (double x = -1.5; x < 7.0; x += 0.5) {
                
                double y = Math.pow(Math.sin(Math.tan(x)), 2);
                
                
                printWriter.printf(Locale.US, "%.1f %.4f\n", x, y);
            }
            
            printWriter.close(); 
            System.out.println("Данные успешно записаны в файл " + fileName + "\n");

        } catch (Exception e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            fileScanner.useLocale(Locale.US); 

            System.out.println("=========================");
            System.out.println("|    x    |      y      |");
            System.out.println("=========================");

            double maxX = 0;
            double maxY = -1.0;

            
            while (fileScanner.hasNextDouble()) {
                double x = fileScanner.nextDouble(); 
                double y = fileScanner.nextDouble(); 

               
                System.out.printf(Locale.US, "|  %5.1f  |   %7.4f   |\n", x, y);

                
                if (y > maxY) {
                    maxY = y;
                    maxX = x; 
                }
            }
            fileScanner.close(); 

            System.out.println("=========================");
            System.out.printf(Locale.US, "\nМаксимальное значение функции y = %.4f достигается при x = %.1f\n", maxY, maxX);

        } catch (Exception e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
  

