/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Student
 */
public class NewMain {

   
    public static void main(String[] args) {
      int[] array25 = new int[10];
int[] a = new int[5];
int[] b = new int[5];

int col_chet = 0;
int col_nechet = 0;

System.out.println("Задан массив D[1..10]. Сформиро\n" +
"System.out.println(\"Задан массив D[1..10].вать два массива, включая в первый\n" +
"элементы исходного массива с четными индексами, а во второй - с нечетными\n" +
"индексами.");
System.out.println("Исходный массив: ");
for (int i25 = 0; i25 < array25.length; i25++) {
array25[i25]=(int) (Math.random()*100-200);
System.out.print(array25[i25]+" ");
}
System.out.println("");
for (int i = 0; i < array25.length; i++) {
if(i % 2==0){

a[col_chet] = array25[i];
col_chet ++;

}else{
b[col_nechet] = array25[i];
col_nechet ++;
}
}
System.out.println("Массив четных индексов: ");
for (int i = 0; i < a.length; i++) {
System.out.print(a[i]+" ");

//System.out.print(b[i]+" ");
}
System.out.println("");
System.out.println("Массив нечетных индексов: ");
for (int i = 0; i < a.length; i++) {
System.out.print(b[i]+" ");

//System.out.print(b[i]+" ");
}
System.out.println("");
}

 	

    }
    

