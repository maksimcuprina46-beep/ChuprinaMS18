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
public class Zad43 {
    public static void main(String[] args) {
    System.out.println("Изменить введенную строку цифр, заменяя цифры по схеме: N -> N mod 10");
        String s = "5912"; 
        
        
        String result = ""; 

       
        for (int i = 0; i < s.length(); i++) {
            
            
            char ch = s.charAt(i); 
            
            
            int N = ch - '0'; 
            
           
            int newN = (N + 1) % 10; 
            
            
            result = result + newN; 
        }

       
        System.out.println("Было:  " + s);
        System.out.println("Стало: " + result);
    }
}

