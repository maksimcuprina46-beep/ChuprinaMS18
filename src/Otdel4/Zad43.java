/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otdel4;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author RYZEN
 */
public class Zad43 {
 public static void main(String[] args) {
      System.out.println("Создать файл, содержащий данные об учениках школы: фамилия, имя;\n" +
"класс (1,2,.....11); буква (А,Б,В,....).Определить в файле, созданном при решении\n" +
"задачи, сколько учащихся в 5Б и 10А классах. Записать в новый файл список\n" +
"учеников 11А класса. Параллельно вывести этот список на экран.");
        String inputFileName = "students.txt";      
        String outputFileName = "class11A.txt";   

       
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(inputFileName));
            
            writer.println("Иванов Иван 5 Б");
            writer.println("Петров Петр 10 А");
            writer.println("Сидоров Сидор 11 А");
            writer.println("Смирнова Анна 5 Б");
            writer.println("Кузнецов Олег 10 А");
            writer.println("Попова Ольга 11 А");
            writer.println("Васильев Игорь 9 В");
            writer.close();
            System.out.println("Исходный файл '" + inputFileName + "' успешно создан и заполнен.\n");
        } catch (Exception e) {
            System.out.println("Ошибка при создании исходного файла: " + e.getMessage());
        }

        
        int count5B = 0;
        int count10A = 0;

        try {
            Scanner scanner = new Scanner(new File(inputFileName));
            PrintWriter writer11A = new PrintWriter(new FileWriter(outputFileName));

            System.out.println(" Список учеников 11А класса ");

           
            while (scanner.hasNext()) {
                String lastName = scanner.next();  
                String firstName = scanner.next(); 
                int grade = scanner.nextInt();     
                String letter = scanner.next();    

                
                if (grade == 5 && letter.equalsIgnoreCase("Б")) {
                    count5B++;
                }
                
                if (grade == 10 && letter.equalsIgnoreCase("А")) {
                    count10A++;
                }
                
                if (grade == 11 && letter.equalsIgnoreCase("А")) {
                    String studentInfo = lastName + " " + firstName;
                    
                    
                    System.out.println(studentInfo);
                   
                    writer11A.println(studentInfo);
                }
            }

            
            scanner.close();
            writer11A.close();

          
           
            System.out.println("Количество учащихся в 5Б: " + count5B);
            System.out.println("Количество учащихся в 10А: " + count10A);
            System.out.println("Список 11А также успешно сохранен в файл '" + outputFileName + "'");

        } catch (Exception e) {
            System.out.println("Ошибка при обработке данных: " + e.getMessage());
        }
    }
}