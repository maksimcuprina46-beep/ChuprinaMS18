/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otdel3;

/**
 *
 * @author RYZEN
 */
public class Zad68 {
    

    
public static void main(String[] args) {
    System.out.println("Дано предложение. Все пробелы в нем заменить на символ \"_\"(создать\n" +
"соответствующую процедуру).");
        String phrase = "Why so serious?"; 

        System.out.println("Исходная строка: " + phrase);

        
        replaceSpaces(phrase);
    }

    
    public static void replaceSpaces(String text) {
        
        String modifiedText = text.replace(" ", "_");
        
        System.out.println("Измененная строка: " + modifiedText);
    }
}
